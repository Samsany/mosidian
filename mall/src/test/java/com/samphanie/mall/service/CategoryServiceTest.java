package com.samphanie.mall.service;

import com.samphanie.mall.MallApplicationTests;
import com.samphanie.mall.vo.CategoryVo;
import com.samphanie.mall.vo.ResponseVo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Classname CategoryServiceTest
 * @Date 2020/3/29 11:39
 * @Author ZSY
 */
class CategoryServiceTest extends MallApplicationTests {

    private static final Integer ID = 10001;


    @Autowired
    private ICategoryService categoryService;

    @Test
    void selectAll() {

        ResponseVo<List<CategoryVo>> listResponseVo = categoryService.selectAll();
        Assert.assertEquals(ResponseVo.success().getCode(), listResponseVo.getCode());

    }


    @Test
    void findSubCategoryId() {
        Set<Integer> set = new HashSet<>();
        categoryService.findSubCategoryId(ID, set);
    }
}