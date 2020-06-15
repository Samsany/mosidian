package io.mosidian.modules.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import io.mosidian.modules.mall.entity.Order;
import io.mosidian.modules.mall.vo.OrderVo;
import io.mosidian.modules.mall.vo.ResponseVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
public interface IOrderService extends IService<Order> {


    /**
     * 充值订单
     */
    ResponseVo<OrderVo> recharge(Integer userId, String recharge);

    /**
     * 创建订单
     */
    ResponseVo<OrderVo> create(Integer uid, Integer shippingId);

    /**
     * 订单列表
     */
    ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize);

    /**
     * 订单详情
     */
    ResponseVo<OrderVo> detail(Integer uid, Long orderNo);

    /**
     * 取消订单
     */
    ResponseVo cancel(Integer uid, Long orderNo);

    /**
     * 支付订单
     */
    void paid(Long orderNo);

    Order selectByOrderNo(Long orderNo);

    ResponseVo<OrderVo> activate(Integer userId);
}
