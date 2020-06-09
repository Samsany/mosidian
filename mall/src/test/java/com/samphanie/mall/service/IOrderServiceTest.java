package com.samphanie.mall.service;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.samphanie.mall.MallApplicationTests;
import com.samphanie.mall.enums.ResponseEnum;
import com.samphanie.mall.form.CartAddForm;
import com.samphanie.mall.vo.CartVo;
import com.samphanie.mall.vo.OrderVo;
import com.samphanie.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Classname IOrderServiceTest
 * @Date 2020/4/7 16:16
 * @Author ZSY
 */
@Slf4j
@Transactional
class IOrderServiceTest extends MallApplicationTests {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private ICartService cartService;

    private static final Integer PRODUCT_ID = 27;

    private static final Integer UID = 2;

    private Integer shippingId = 7;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @BeforeEach
    void before() {
        CartAddForm form = new CartAddForm();
        form.setProductId(PRODUCT_ID);
        form.setSelected(true);

        ResponseVo<CartVo> responseVo = cartService.add(UID, form);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());
    }

    @Test
    void create() {
        ResponseVo<OrderVo> responseVo = orderService.create(UID, shippingId);
        log.info("reponseVo = {}", gson.toJson(responseVo));
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());
    }

    @Test
    void list() {
        ResponseVo<PageInfo> responseVo = orderService.list(UID, 1, 10);
        log.info("reponseVo = {}", gson.toJson(responseVo));
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());

    }

    @Test
    void detail() {
        ResponseVo<OrderVo> orderVoResponseVo = orderService.create(UID, shippingId);
        ResponseVo<OrderVo> responseVo = orderService.detail(UID, orderVoResponseVo.getData().getOrderNo());
        log.info("reponseVo = {}", gson.toJson(responseVo));
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());
    }

    @Test
    void cancel() {
        ResponseVo<OrderVo> orderVoResponseVo = orderService.create(UID, shippingId);
        ResponseVo responseVo = orderService.cancel(UID, orderVoResponseVo.getData().getOrderNo());
        log.info("reponseVo = {}", gson.toJson(responseVo));
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());
    }

}