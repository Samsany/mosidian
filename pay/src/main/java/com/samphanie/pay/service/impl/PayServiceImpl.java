package com.samphanie.pay.service.impl;

import com.google.gson.Gson;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.enums.OrderStatusEnum;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import com.samphanie.pay.consts.PayConst;
import com.samphanie.pay.entity.PayInfo;
import com.samphanie.pay.enums.PayPlatformEnum;
import com.samphanie.pay.mapper.PayInfoMapper;
import com.samphanie.pay.service.IPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Classname PayService
 * @Description 支付service
 * @Date 2020/3/21 14:49
 * @Author ZSY
 */
@Slf4j
@Service
public class PayServiceImpl implements IPayService {


    @Autowired
    private BestPayServiceImpl bestPayService;

    @Autowired
    private PayInfoMapper payInfoMapper;

    @Autowired
    private AmqpTemplate amqpTemplate;


    /**
     * 创建/发起支付
     *
     * @param orderId
     * @param amount
     * @return
     */
    @Override
    public PayResponse create(String userId,String orderId, BigDecimal amount, BestPayTypeEnum bestPayTypeEnum) {

//        QueryWrapper<PayInfo> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("order_no", orderId);
//        PayInfo payInfoResult = payInfoMapper.selectOne(queryWrapper);
        PayInfo payInfoResult = payInfoMapper.selectByOrderNo(Long.parseLong(orderId));


        if (payInfoResult == null) {
            payInfoResult = new PayInfo(Long.parseLong(userId),Long.parseLong(orderId),
                    PayPlatformEnum.getByBestPayTypeEnum(bestPayTypeEnum).getCode(),
                    OrderStatusEnum.NOTPAY.name(), amount);
            // 写入数据库
            payInfoMapper.insert(payInfoResult);
        }

        PayRequest payRequest = new PayRequest();
        // 设置支付方式
        payRequest.setPayTypeEnum(bestPayTypeEnum);
        // 设置订单号
        payRequest.setOrderId(orderId);
        // 设置订单名称
        payRequest.setOrderName(PayConst.ORDER_NAME);
        // 支付金额
        payRequest.setOrderAmount(amount.doubleValue());
        // 支付的openId
        payRequest.setOpenid("");
        // 附加的信息
        payRequest.setAttach("附加的信息");
        PayResponse payResponse = bestPayService.pay(payRequest);

        log.info("【发起支付】 payResponse={}", payResponse);

        return payResponse;
    }

    /**
     * 支付异步通知
     *
     * @param notifyData
     */
    @Override
    public PayResponse notify(String notifyData) {

        // 1.签名校验
        PayResponse payResponse = bestPayService.asyncNotify(notifyData);

        // 2.金额校验 （数据库查订单）
        // 发送短信告警
        PayInfo payInfo = payInfoMapper.selectByOrderNo(Long.parseLong(payResponse.getOrderId()));
        if (payInfo == null) {
            throw new RuntimeException("通过订单号查询到的内容为空！");
        }
        if (!payInfo.getPlatformStatus().equals(OrderStatusEnum.SUCCESS.name())) {
            if (payInfo.getPayAmount().compareTo(BigDecimal.valueOf(payResponse.getOrderAmount())) != 0) {
                // 告警
                throw new RuntimeException("异步通知中的金额和数据库里的不一致，orderNo=" + payInfo.getOrderNo());
            }

            // 3.修改订单状态
            payInfo.setPlatformStatus(OrderStatusEnum.SUCCESS.name());
            // 交易流水号
            payInfo.setPlatformNumber(payResponse.getOutTradeNo());
            payInfoMapper.updateById(payInfo);

        }

        //TODO pay发送MQ消息，mall接收MQ消息
        amqpTemplate.convertAndSend(PayConst.QUEUE_PAY_NOTIFY, new Gson().toJson(payInfo));


        return payResponse;
    }
}
