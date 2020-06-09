package com.samphanie.mall.service;

import com.github.pagehelper.PageInfo;
import com.samphanie.mall.MallApplicationTests;
import com.samphanie.mall.enums.ResponseEnum;
import com.samphanie.mall.form.ShippingForm;
import com.samphanie.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @Classname IShippingServiceTest
 * @Date 2020/4/7 11:34
 * @Author ZSY
 */
@Slf4j
class IShippingServiceTest extends MallApplicationTests {

    @Autowired
    private IShippingService shppingService;

    private static final Integer UID = 1;
    private Integer shippingId = 7;

    private ShippingForm form;

    @BeforeEach
    public void shippingForm() {
        ShippingForm shippingForm = new ShippingForm();
        shippingForm.setReceiverName("陌离");
        shippingForm.setReceiverAddress("司空山村");
        shippingForm.setReceiverDistrict("岳西县");
        shippingForm.setReceiverCity("安庆市");
        shippingForm.setReceiverMobile("");
        shippingForm.setReceiverPhone("17354056086");
        shippingForm.setReceiverProvince("安徽省");
        shippingForm.setReceiverZip("246671");

        this.form = shippingForm;

        add();
    }

    void add() {

        ResponseVo<Map<String, Integer>> responseVo = shppingService.add(UID, form);

        log.info("reponseVo = {}", responseVo);
        this.shippingId = responseVo.getData().get("shippingId");
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());
    }

    @AfterEach
    void delete() {

        ResponseVo<Map<String, Integer>> responseVo = shppingService.delete(UID, shippingId);

        log.info("reponseVo = {}", responseVo);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());

    }

    @Test
    void update() {

        form.setReceiverName("zxx");

        ResponseVo<Map<String, Integer>> responseVo = shppingService.update(UID, shippingId, form);

        log.info("reponseVo = {}", responseVo);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());

    }

    @Test
    void list() {

        ResponseVo<PageInfo> responseVo = shppingService.list(UID, 1, 10);

        log.info("reponseVo = {}", responseVo);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());

    }
}