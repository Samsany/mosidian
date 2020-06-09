package com.samphanie.pay.service;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;

/**
 * @Classname IPayService
 * @Description 支付接口
 * @Date 2020/3/21 14:48
 * @Author ZSY
 */
public interface IPayService {

    /**
     * 创建/发起支付
     */
    PayResponse create(String userId,String orderId, BigDecimal amount, BestPayTypeEnum bestPayTypeEnum);

    /**
     * 支付异步通知
     */
    PayResponse notify(String notifyData);
}
