package com.samphanie.mall.service.impl;

import com.samphanie.mall.MallApplicationTests;
import com.samphanie.mall.entity.User;
import com.samphanie.mall.service.IUserService;
import com.samphanie.mall.vo.ResponseVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Classname UserServiceImplTest
 * @Description TODO
 * @Date 2020/3/24 21:51
 * @Author ZSY
 */
@Transactional
class UserServiceImplTest extends MallApplicationTests {

    public static final String USERNAME = "zheng2340204";
    public static final String PASSWORD = "123456";
    public static final String EMAIL = "zheng2340204@qq.com";


    @Autowired
    private IUserService userService;

    @BeforeEach
    public void register() {

        User user = new User(USERNAME, PASSWORD, EMAIL);
        userService.register(user);

    }

    @Test
    public void login(){
        ResponseVo<User> user = userService.login(USERNAME, PASSWORD);
        Assert.assertEquals(ResponseVo.success().getCode(), user.getCode());

    }
}