package com.samphanie.mall.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.samphanie.mall.MallApplicationTests;
import com.samphanie.mall.enums.ResponseEnum;
import com.samphanie.mall.form.CartAddForm;
import com.samphanie.mall.form.CartUpdateForm;
import com.samphanie.mall.vo.CartVo;
import com.samphanie.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Classname ICartServiceTest
 * @Date 2020/3/30 18:00
 * @Author ZSY
 */
@Slf4j
class ICartServiceTest extends MallApplicationTests {

    @Autowired
    private ICartService cartService;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();


    private static final Integer UID = 2;
    private static final Integer PRODUCT_ID = 26;
    private static final Integer QUANTITY = 5;

    @BeforeEach
    public void add() {
        CartAddForm form = new CartAddForm();
        form.setProductId(PRODUCT_ID);
        form.setSelected(true);

        ResponseVo<CartVo> responseVo = cartService.add(UID, form);
        log.info("responseVo={}" , gson.toJson(responseVo));
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());

    }

    @Test
    public void list() {

        ResponseVo<CartVo> list = cartService.list(UID);
        log.info("list={}" , gson.toJson(list));
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), list.getCode());

    }

    @Test
    public void update () {

        CartUpdateForm form = new CartUpdateForm();
        form.setQuantity(QUANTITY);
        form.setSelected(false);

        ResponseVo<CartVo> responseVo = cartService.update(UID, PRODUCT_ID, form);
        log.info("responseVo={}" , gson.toJson(responseVo));
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());
    }

    @AfterEach
    public void delete () {
        ResponseVo<CartVo> responseVo = cartService.delete(UID, PRODUCT_ID);
        log.info("responseVo={}" , gson.toJson(responseVo));
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());
    }

    @Test
    public void selectAll () {

        ResponseVo<CartVo> responseVo = cartService.selectAll(UID);
        log.info("responseVo={}" , gson.toJson(responseVo));
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());
    }

    @Test
    public void unSelectAll () {

        ResponseVo<CartVo> responseVo = cartService.unSelectAll(UID);
        log.info("responseVo={}" , gson.toJson(responseVo));
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());
    }

    @Test
    public void sum () {

        ResponseVo<Integer> responseVo = cartService.sum(UID);
        log.info("responseVo={}" , gson.toJson(responseVo));
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());
    }
}