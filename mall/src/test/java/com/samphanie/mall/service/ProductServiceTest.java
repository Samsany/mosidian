package com.samphanie.mall.service;

import com.github.pagehelper.PageInfo;
import com.samphanie.mall.MallApplicationTests;
import com.samphanie.mall.enums.ResponseEnum;
import com.samphanie.mall.vo.ProductDetailVo;
import com.samphanie.mall.vo.ResponseVo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Classname IProductServiceTest
 * @Date 2020/3/29 14:06
 * @Author ZSY
 */
class ProductServiceTest extends MallApplicationTests {

    @Autowired
    private IProductService productService;

    @Test
    void list() {
        ResponseVo<PageInfo> responseVo = productService.list(null, 1, 10);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getCode());
    }

    @Test
    void detail() {
        ResponseVo<ProductDetailVo> detail = productService.detail(26);
        Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), detail.getCode());
    }

    @Test
    void getById() {
        productService.getById(26);
    }

}