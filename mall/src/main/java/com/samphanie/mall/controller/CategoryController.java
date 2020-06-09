package com.samphanie.mall.controller;

import com.samphanie.mall.service.ICategoryService;
import com.samphanie.mall.vo.CategoryVo;
import com.samphanie.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname CategoryController
 * @Date 2020/3/29 10:03
 * @Author ZSY
 */
@RestController
@Slf4j
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/categories")
    public ResponseVo<List<CategoryVo>> categories() {
        return categoryService.selectAll();
    }

}
