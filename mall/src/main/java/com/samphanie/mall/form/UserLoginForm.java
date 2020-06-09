package com.samphanie.mall.form;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @Classname UserForm
 * 登录表单
 * @Date 2020/3/25 11:07
 * @Author ZSY
 */
@Data
public class UserLoginForm {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

}
