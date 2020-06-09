package com.samphanie.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.samphanie.mall.entity.*;
import com.samphanie.mall.enums.OrderStatusEnum;
import com.samphanie.mall.enums.PaymentTypeEnum;
import com.samphanie.mall.enums.ProductStatusEnum;
import com.samphanie.mall.enums.ResponseEnum;
import com.samphanie.mall.exception.MallException;
import com.samphanie.mall.mapper.OrderMapper;
import com.samphanie.mall.service.*;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.mall.utils.GenerateCodeFactory;
import com.samphanie.mall.vo.OrderItemVo;
import com.samphanie.mall.vo.OrderVo;
import com.samphanie.mall.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

    @Autowired
    private IShippingService shippingService;

    @Autowired
    private ICartService cartService;

    @Autowired
    private IProductService productService;
    
    @Autowired
    private IOrderService orderService;
    
    @Autowired
    private IOrderItemService orderItemService;

    /**
     * 创建订单 商品服务
     *
     * @param uid
     * @param shippingId
     */
    @Override
    @Transactional
    public ResponseVo<OrderVo> create(Integer uid, Integer shippingId) {
        // 收货地址校验
        QueryWrapper<Shipping> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", shippingId);
        queryWrapper.eq("user_id", uid);
        Shipping shipping = shippingService.getOne(queryWrapper);

        if (shipping == null) {
            throw new MallException(ResponseEnum.SHIPPING_NOT_EXIST);
        }

        // 获取购物车，校验（是否有商品、库存）
        List<Cart> cartList = cartService.listForCart(uid)
                .stream().filter(Cart::getProductSelected)
                .collect(Collectors.toList());

        if (CollectionUtils.isEmpty(cartList)) {
            throw new MallException(ResponseEnum.CART_SELECTED_IS_EMPTY);
        }

        Map<Integer, Cart> map = cartList.stream().collect(Collectors.toMap(Cart::getProductId, Function.identity()));
        List<Product> productList = productService.selectByProductMap(map);

        Map<Integer, Product> productMap = productList.stream()
                .collect(Collectors.toMap(Product::getId, Function.identity()));

        List<OrderItem> orderItems = new ArrayList<>();
        Long orderNo = Long.valueOf(GenerateCodeFactory.getOrderCode(Long.valueOf(uid)).substring(0,19));
        for (Cart cart : cartList) {
            Product product = productMap.get(cart.getProductId());
            // 是否有商品
            if (product == null) {
                Map<String, Object> error = new HashMap<>();
                error.put("error", ResponseEnum.PRODUCT_NOT_EXIST.getMessage() + "productId = " + cart.getProductId());
                throw new MallException(ResponseEnum.PRODUCT_NOT_EXIST, error);
            }

            // 商品上下架状态
            if (!ProductStatusEnum.ON_SALE.getCode().equals(product.getStatus())) {
                Map<String, Object> errorMsg = new HashMap<>();
                errorMsg.put("error", ResponseEnum.PRODUCT_OFF_SALE_OR_DELETE.getMessage() + product.getName());
                throw new MallException(ResponseEnum.PRODUCT_OFF_SALE_OR_DELETE);
            }

            // 库存是否充足
            if (product.getStock() < cart.getQuantity()) {
                Map<String, Object> error = new HashMap<>();
                error.put("error", ResponseEnum.PRODUCT_STOCK_ERROR.getMessage() + product.getName());
                throw new MallException(ResponseEnum.PRODUCT_STOCK_ERROR);
            }

            OrderItem orderItem = buildOrderItem(uid, orderNo, cart.getQuantity(), product);
            orderItems.add(orderItem);

            // 减库存
            product.setStock(product.getStock() - cart.getQuantity());
            boolean saveOrUpdate = productService.updateById(product);
            if (!saveOrUpdate) {
                throw new MallException(ResponseEnum.ERROR);
            }
        }

        // 计算总价，只计算选中的商品
        // 生成订单，入库：order和order_item, 事务
        Order order = buildOrder(uid, orderNo, shippingId, orderItems);
        boolean orderSave = orderService.save(order);
        if (!orderSave) {
            throw new MallException(ResponseEnum.ERROR);
        }

        boolean orderItemSave = orderItemService.saveBatch(orderItems);
        if (!orderItemSave) {
            throw new MallException(ResponseEnum.ERROR);
        }

        // 更新购物车（选中的商品）
        // Redis不能回滚
        for (Cart cart : cartList) {
            cartService.delete(uid, cart.getProductId());
        }


        // 构造orderVo
        OrderVo orderVo = buildOrderVo(order, orderItems, shipping);

        return ResponseVo.successByData(orderVo);
    }

    /**
     * 订单列表
     *
     * @param uid
     * @param pageNum
     * @param pageSize
     */
    @Override
    public ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum,pageSize);

        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", uid);
        List<Order> orderList = orderService.list(queryWrapper);

        Set<Long> orderNoSet = orderList.stream()
                .map(Order::getOrderNo)
                .collect(Collectors.toSet());
        List<OrderItem> orderItems = orderItemService.selectByOrderNo(orderNoSet);
        Map<Long, List<OrderItem>> orderItemMap = orderItems.stream().collect(Collectors.groupingBy(OrderItem::getOrderNo));

        List<Integer> shippingIds = orderList.stream()
                .map(Order::getShippingId)
                .collect(Collectors.toList());
        List<Shipping> shippings = shippingService.listByIds(shippingIds);
        Map<Integer, Shipping> shippingMap = shippings.stream().collect(Collectors.toMap(Shipping::getId, Function.identity()));

        List<OrderVo> orderVoList = new ArrayList<>();
        for (Order order : orderList) {
            OrderVo orderVo = buildOrderVo(order, orderItemMap.get(order.getOrderNo()), shippingMap.get(order.getShippingId()));
            orderVoList.add(orderVo);
        }

        PageInfo pageInfo = new PageInfo(orderList);
        pageInfo.setList(orderVoList);

        return ResponseVo.successByData(pageInfo);
    }

    /**
     * 订单详情
     *
     * @param uid
     * @param orderNo
     */
    @Override
    public ResponseVo<OrderVo> detail(Integer uid, Long orderNo) {

        // 查询订单
        Order order = selectByOrderNo(orderNo);
        if (order == null || !order.getUserId().equals(uid)){
            throw new MallException(ResponseEnum.ORDER_NOT_EXIST);
        }

        // 订单详情
        Set<Long> orderNoSet = new HashSet<>();
        orderNoSet.add(order.getOrderNo());
        List<OrderItem> orderItems = orderItemService.selectByOrderNo(orderNoSet);

        // 收货地址
        Shipping shipping = shippingService.getById(order.getShippingId());

        // 构造orderVo
        OrderVo orderVo = buildOrderVo(order, orderItems, shipping);

        return ResponseVo.successByData(orderVo);
    }

    /**
     * 取消订单
     *
     * @param uid
     * @param orderNo
     */
    @Override
    public ResponseVo cancel(Integer uid, Long orderNo) {
        // 查询订单
        Order order = selectByOrderNo(orderNo);
        if (order == null || !order.getUserId().equals(uid)){
            throw new MallException(ResponseEnum.ORDER_NOT_EXIST);
        }

        // 只有未付款订单可以取消
        if (!order.getStatus().equals(OrderStatusEnum.NO_PAY.getCode())) {
            throw new MallException(ResponseEnum.ORDER_STATUS_ERROR);
        }

        order.setStatus(OrderStatusEnum.PAID.getCode());
        order.setPaymentTime(LocalDateTime.now());

        boolean row = orderService.updateById(order);
        if (!row) {
            throw new MallException(ResponseEnum.ERROR);
        }

        return ResponseVo.success();
    }

    /**
     * 支付订单
     *
     * @param orderNo
     */
    @Override
    public void paid(Long orderNo) {
        // 查询订单
        Order order = selectByOrderNo(orderNo);
        if (order == null){
            Map map = new HashMap();
            map.put("订单Id", order.getOrderNo());
            throw new MallException(ResponseEnum.ORDER_NOT_EXIST, map);
        }

        // 只有未付款订单可以支付
        if (!order.getStatus().equals(OrderStatusEnum.NO_PAY.getCode())) {
            Map map = new HashMap();
            map.put("订单Id", order.getOrderNo());
            throw new MallException(ResponseEnum.ORDER_STATUS_ERROR);
        }

        order.setStatus(OrderStatusEnum.CANCELED.getCode());
        order.setCloseTime(LocalDateTime.now());

        boolean row = orderService.updateById(order);
        if (!row) {
            throw new MallException(ResponseEnum.ERROR);
        }
    }

    private OrderVo buildOrderVo(Order order, List<OrderItem> orderItems, Shipping shipping) {

        OrderVo orderVo = new OrderVo();
        BeanUtils.copyProperties(order, orderVo);

        List<OrderItemVo> orderItemVoList = orderItems.stream().map(e -> {
            OrderItemVo orderItemVo = new OrderItemVo();
            BeanUtils.copyProperties(e, orderItemVo);
            return orderItemVo;
        }).collect(Collectors.toList());

        orderVo.setOrderItemVoList(orderItemVoList);

        if (shipping != null) {
            orderVo.setShippingId(shipping.getId());
            orderVo.setShippingVo(shipping);
        }

        return orderVo;
    }

    private Order buildOrder(Integer uid,
                             Long orderNo,
                             Integer shippingId,
                             List<OrderItem> orderItems) {
        Order order = new Order();
        order.setOrderNo(orderNo);
        order.setUserId(uid);
        order.setShippingId(shippingId);
        order.setPayment(orderItems.stream().map(OrderItem::getTotalPrice).reduce(BigDecimal.ZERO, BigDecimal::add));
        order.setPaymentType(PaymentTypeEnum.PAY_ONLINE.getCode());
        order.setPostage(0);
        order.setStatus(OrderStatusEnum.NO_PAY.getCode());

        return order;
    }

    private OrderItem buildOrderItem(Integer uid, Long orderNo, Integer quantity, Product product) {

        OrderItem orderItem = new OrderItem();
        orderItem.setUserId(uid);
        orderItem.setOrderNo(orderNo);
        orderItem.setProductId(product.getId());
        orderItem.setProductName(product.getName());
        orderItem.setCurrentUnitPrice(product.getPrice());
        orderItem.setQuantity(quantity);
        orderItem.setTotalPrice(product.getPrice().multiply(BigDecimal.valueOf(quantity)));

        return orderItem;

    }

    // 按订单号查询订单
    @Override
    public Order selectByOrderNo(Long orderNo) {

        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("order_no", orderNo);

        return orderService.getOne(queryWrapper);
    }

}
