package io.mosidian.modules.mall.listener;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.gson.Gson;
import io.mosidian.modules.mall.consts.MallConst;
import io.mosidian.modules.mall.entity.OrderItem;
import io.mosidian.modules.mall.service.IOrderItemService;
import io.mosidian.modules.mall.service.IOrderService;
import io.mosidian.modules.member.entity.MemberEntity;
import io.mosidian.modules.member.service.MemberService;
import io.mosidian.modules.pay.entity.PayInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname PayMsgListener
 * @Date 2020/4/8 17:28
 * @Author ZSY
 */
@Component
@RabbitListener(queues = "payNotify")
@Slf4j
public class PayMsgListener {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IOrderItemService orderItemService;

    @Autowired
    private MemberService memberService;

    @RabbitHandler
    public void process(String msg) {

        log.info("【接收到消息】 {}", msg);

        PayInfo payInfo = new Gson().fromJson(msg, PayInfo.class);

        if (MallConst.ORDER_SUCCESS.equals(payInfo.getPlatformStatus())) {
            // 修改订单里的状态
            orderService.paid(payInfo.getOrderNo());
        }

        QueryWrapper<OrderItem> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("order_no", payInfo.getOrderNo());
        OrderItem orderItem = orderItemService.getOne(queryWrapper);

        // 充值
        if (MallConst.ORDER_TYPE_MEMBER.equals(orderItem.getProductName())) {
            QueryWrapper<MemberEntity> memberEntityQueryWrapper = new QueryWrapper<>();
            memberEntityQueryWrapper.eq("user_id", payInfo.getUserId());

            MemberEntity member = memberService.getOne(memberEntityQueryWrapper);
            member.setBalance(payInfo.getPayAmount().add(member.getBalance()));

            memberService.updateById(member);
        }

        // 激活
        if (MallConst.ORDER_TYPE_MEMBER_ACTIVE.equals(orderItem.getProductName())) {
            QueryWrapper<MemberEntity> memberEntityQueryWrapper = new QueryWrapper<>();
            memberEntityQueryWrapper.eq("user_id", payInfo.getUserId());

            MemberEntity member = memberService.getOne(memberEntityQueryWrapper);
            member.setMonetary(payInfo.getPayAmount().add(member.getMonetary()));

            memberService.updateById(member);
        }

    }

}
