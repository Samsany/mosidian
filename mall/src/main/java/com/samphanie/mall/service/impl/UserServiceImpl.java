package com.samphanie.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.samphanie.mall.entity.User;
import com.samphanie.mall.enums.ResponseEnum;
import com.samphanie.mall.exception.MallException;
import com.samphanie.mall.mapper.UserMapper;
import com.samphanie.mall.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.mall.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @Override
    public ResponseVo<User> register(User user) {

        // username不能重复
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("username", user.getUsername());
        Integer countByUsername = userMapper.selectCount(userQueryWrapper);
        if (countByUsername > 0) {
            throw new MallException(ResponseEnum.USERNAME_EXIST);
        }

        // email不能重复
        QueryWrapper<User> emailQueryWrapper = new QueryWrapper<>();
        emailQueryWrapper.eq("email", user.getEmail());
        Integer countByEmail = userMapper.selectCount(emailQueryWrapper);
        if (countByEmail > 0) {
            throw new MallException(ResponseEnum.EMAIL_ERROR);
        }

        // MD5摘要算法（spring自带）
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes(StandardCharsets.UTF_8)));

        // 写入数据库
        int result = userMapper.insert(user);
        if (result == 0) {
            throw new MallException(ResponseEnum.REGISTRATION_FAILURE);
        }

        return ResponseVo.success();

    }

    /**
     * 用户登录
     *
     * @param username, password
     * @return
     */
    @Override
    public ResponseVo<User> login(String username, String password) {

        User user = userMapper.selectByUsername(username);
        if (user == null) {
            // 用户不存在
            throw new MallException(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }

        if (!user.getPassword().equalsIgnoreCase(DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8)))){
            // 密码错误
            throw new MallException(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }

        user.setPassword("");
        return ResponseVo.successByData(user);
    }
}
