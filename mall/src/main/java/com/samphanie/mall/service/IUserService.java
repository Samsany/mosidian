package com.samphanie.mall.service;

import com.samphanie.mall.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.mall.vo.ResponseVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
public interface IUserService extends IService<User> {

    /**
     * 用户注册
     * @return
     */
    ResponseVo<User> register(User user);

    /**
     * 用户登录
     */
    ResponseVo<User> login(String username, String password);
}
