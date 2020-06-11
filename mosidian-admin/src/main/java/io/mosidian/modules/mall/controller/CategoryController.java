package io.mosidian.modules.mall.controller;

import io.mosidian.modules.mall.service.ICategoryService;
import io.mosidian.modules.mall.vo.CategoryVo;
import io.mosidian.modules.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname CategoryController
 * @Date 2020/3/29 10:03
 * @Author ZSY
 */
@RestController
@RequestMapping("/mall")
@Slf4j
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/categories")
    public ResponseVo<List<CategoryVo>> categories() {
        return categoryService.selectAll();
    }

}
