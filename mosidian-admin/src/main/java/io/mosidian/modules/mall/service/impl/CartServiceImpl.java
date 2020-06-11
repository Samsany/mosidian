package io.mosidian.modules.mall.service.impl;

import com.google.gson.Gson;
import io.mosidian.modules.mall.entity.Cart;
import io.mosidian.modules.mall.entity.Product;
import io.mosidian.modules.mall.enums.ProductStatusEnum;
import io.mosidian.modules.mall.enums.ResponseEnum;
import io.mosidian.modules.mall.exception.MallException;
import io.mosidian.modules.mall.form.CartAddForm;
import io.mosidian.modules.mall.form.CartUpdateForm;
import io.mosidian.modules.mall.mapper.ProductMapper;
import io.mosidian.modules.mall.service.ICartService;
import io.mosidian.modules.mall.vo.CartProductVo;
import io.mosidian.modules.mall.vo.CartVo;
import io.mosidian.modules.mall.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname CartService
 * @Date 2020/3/30 17:13
 * @Author ZSY
 */
@Service
public class CartServiceImpl implements ICartService {

    private final static String CART_REDIS_KEY_TEMPLATE = "cart_%d";

    @Resource
    private ProductMapper productMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;

    private Gson gson = new Gson();

    /**
     * 购物车添加商品
     *
     * @param cartAddForm
     */
    @Override
    public ResponseVo<CartVo> add(Integer uid, CartAddForm cartAddForm) {
        Integer quantity = 1;
        Product product = productMapper.selectById(cartAddForm.getProductId());

        // 商品是否存在
        if (product == null) {
            throw new MallException(ResponseEnum.PRODUCT_NOT_EXIST);
        }

        // 商品是否在售
        if (product.getStatus().equals(ProductStatusEnum.OFF_SALE.getCode())
                || product.getStatus().equals(ProductStatusEnum.DELETE.getCode())) {
            throw new MallException(ResponseEnum.PRODUCT_OFF_SALE_OR_DELETE);
        }

        // 商品库存是否充足
        if (product.getStock() <= 0) {
            throw new MallException(ResponseEnum.PRODUCT_STOCK_ERROR);
        }

        // 写入到redis
        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE, uid);
        String value = opsForHash.get(redisKey, String.valueOf(product.getId()));

        Cart cart;
        if (StringUtils.isEmpty(value)) {
            // 没有该商品，新增
            cart = new Cart(product.getId(), quantity, cartAddForm.getSelected());
        } else {
            // 已经有了，数量+1
            cart = gson.fromJson(value, Cart.class);
            cart.setQuantity(cart.getQuantity() + quantity);
        }

        opsForHash.put(redisKey,
                String.valueOf(product.getId()),
                gson.toJson(cart));

        return list(uid);
    }

    /**
     * 购物车列表
     *
     * @param uid
     */
    @Override
    public ResponseVo<CartVo> list(Integer uid) {

        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE, uid);

        Map<String, String> entries = opsForHash.entries(redisKey);

        boolean selectAll = true;
        Integer cartTotalQuantity = 0;
        BigDecimal cartTotalPrice = BigDecimal.ZERO;

        CartVo cartVo = new CartVo();
        Map<Integer, Cart> productMap = new HashMap<>();
        List<CartProductVo> cartProductVos = new ArrayList<>();

        if (entries.size() > 0) {

            for (Map.Entry<String, String> entry : entries.entrySet()) {
                Integer productId = Integer.valueOf(entry.getKey());
                Cart cart = gson.fromJson(entry.getValue(), Cart.class);
                productMap.put(productId, cart);
                cartTotalQuantity += cart.getQuantity();
            }

            List<Product> products = productMapper.selectByProductMap(productMap);

            for (Product product : products) {
                // 商品是否为空
                if (product == null) {
                    throw new MallException(ResponseEnum.PRODUCT_NOT_EXIST);
                }

                // 商品上下架状态
                if (!ProductStatusEnum.ON_SALE.getCode().equals(product.getStatus())) {
                    Map<String, Object> errorMsg = new HashMap<>();
                    errorMsg.put("error", ResponseEnum.PRODUCT_OFF_SALE_OR_DELETE.getMessage() + product.getName());
                    throw new MallException(ResponseEnum.PRODUCT_OFF_SALE_OR_DELETE);
                }

                Cart cart = productMap.get(product.getId());
                // 库存是否充足
                if (product.getStock() < cart.getQuantity()) {
                    Map<String, Object> error = new HashMap<>();
                    error.put("error", ResponseEnum.PRODUCT_STOCK_ERROR.getMessage() + product.getName());
                    throw new MallException(ResponseEnum.PRODUCT_STOCK_ERROR);
                }

                CartProductVo cartProductVo = new CartProductVo(product.getId(),
                        cart.getQuantity(),
                        product.getName(),
                        product.getSubtitle(),
                        product.getMainImage(),
                        product.getPrice(),
                        product.getStatus(),
                        product.getPrice().multiply(BigDecimal.valueOf(cart.getQuantity())),
                        product.getStock(),
                        cart.getProductSelected()
                );

                // 计算总价（只计算选中的）
                if (cart.getProductSelected()) {
                    cartTotalPrice = cartTotalPrice.add(cartProductVo.getProductTotalPrice());
                }

                if (!cart.getProductSelected()) {
                    selectAll = false;
                }

                cartProductVos.add(cartProductVo);
            }

        }


        // 购物车列表
        cartVo.setCartProductVoList(cartProductVos);
        // 是否全选
        cartVo.setSelectedAll(selectAll);
        // 商品数量
        cartVo.setCartTotalQuantity(cartTotalQuantity);
        // 商品总价
        cartVo.setCartTotalPrice(cartTotalPrice);
        return ResponseVo.successByData(cartVo);
    }


    /**
     * 更新购物车
     *
     * @param uid
     * @param productId
     * @param form
     */
    @Override
    public ResponseVo<CartVo> update(Integer uid, Integer productId, CartUpdateForm form) {

        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE, uid);

        String value = opsForHash.get(redisKey, String.valueOf(productId));

        if (StringUtils.isEmpty(value)) {
            // 没有该商品，数据错误，报错
            throw new MallException(ResponseEnum.CART_PRODUCT_NOT_EXIST);
        }
        // 已经有了，修改
        Cart cart = gson.fromJson(value, Cart.class);
        if (form.getQuantity() != null && form.getQuantity() >= 0) {
            cart.setQuantity(form.getQuantity());
        }
        if (form.getSelected() != null) {
            cart.setProductSelected(form.getSelected());
        }

        opsForHash.put(redisKey, String.valueOf(productId), gson.toJson(cart));

        return list(uid);
    }

    /**
     * 删除商品
     *
     * @param uid
     * @param productId
     */
    @Override
    public ResponseVo<CartVo> delete(Integer uid, Integer productId) {
        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE, uid);

        String value = opsForHash.get(redisKey, String.valueOf(productId));

        if (StringUtils.isEmpty(value)) {
            // 没有该商品，数据错误，报错
            throw new MallException(ResponseEnum.CART_PRODUCT_NOT_EXIST);
        }
        // 删除商品
        opsForHash.delete(redisKey, String.valueOf(productId));

        return list(uid);
    }


    /**
     * 全选
     *
     * @param uid
     */
    @Override
    public ResponseVo<CartVo> selectAll(Integer uid) {
        return cartBySelect(uid, true);
    }

    /**
     * 全不选
     *
     * @param uid
     */
    @Override
    public ResponseVo<CartVo> unSelectAll(Integer uid) {

        return cartBySelect(uid, false);
    }

    public List<Cart> listForCart(Integer uid) {
        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE, uid);

        List<Cart> cartList = new ArrayList<>();
        Map<String, String> entries = opsForHash.entries(redisKey);
        for (Map.Entry<String, String> entry : entries.entrySet()) {
            cartList.add(gson.fromJson(entry.getValue(), Cart.class));
        }

        return cartList;
    }

    private ResponseVo<CartVo> cartBySelect(Integer uid, Boolean select) {
        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE, uid);

        List<Cart> cartList = listForCart(uid);

        for (Cart cart : cartList) {
            cart.setProductSelected(select);
            opsForHash.put(redisKey,
                    String.valueOf(cart.getProductId()),
                    gson.toJson(cart));
        }

        return list(uid);
    }

    /**
     * 购物车商品总和
     *
     * @param uid
     */
    @Override
    public ResponseVo<Integer> sum(Integer uid) {

        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE, uid);

        List<Cart> cartList = new ArrayList<>();
        Map<String, String> entries = opsForHash.entries(redisKey);
        for (Map.Entry<String, String> entry : entries.entrySet()) {
            cartList.add(gson.fromJson(entry.getValue(), Cart.class));
        }

        Integer sum = cartList.stream()
                .map(Cart::getQuantity)
                .reduce(0, Integer::sum);

        return ResponseVo.successByData(sum);
    }
}
