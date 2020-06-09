package com.samphanie.mall.controller;

import com.github.pagehelper.PageInfo;
import com.samphanie.mall.service.IProductService;
import com.samphanie.mall.vo.ProductDetailVo;
import com.samphanie.mall.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname ProductController
 * @Date 2020/3/29 15:22
 * @Author ZSY
 */
@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products")
    public ResponseVo<PageInfo> list(@RequestParam(value = "categoryId", required = false) Integer categoryId,
                                     @RequestParam(defaultValue = "1") Integer pageNum,
                                     @RequestParam(defaultValue = "10") Integer pageSize) {

        ResponseVo<PageInfo> list = productService.list(categoryId, pageNum, pageSize);

        return list;

    }

    @GetMapping("/products/{productId}")
    public ResponseVo<ProductDetailVo> detail(@PathVariable Integer productId) {

        return productService.detail(productId);

    }

}
