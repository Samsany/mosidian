package com.samphanie.pay.service;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.samphanie.pay.PayApplicationTests;
import com.samphanie.pay.utils.KeyUtil;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * @Classname IPayServiceTest
 * @Description 支付测试
 * @Date 2020/3/23 14:13
 * @Author ZSY
 */
class IPayServiceImplTest extends PayApplicationTests {

    @Autowired
    private IPayService iPayService;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    void create() {

        iPayService.create("1",KeyUtil.genUniqueKey(), BigDecimal.valueOf(0.01), BestPayTypeEnum.ALIPAY_PC);

    }

    @Test
    void testNotify() {
    }

    @Test
    public void sendMqMsg() {

        amqpTemplate.convertAndSend("payNotify", "hello world!");

    }
}