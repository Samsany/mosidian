package com.samphanie.mall.form;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @Classname UserForm
 * 注册表单
 * @Date 2020/3/25 11:07
 * @Author ZSY
 */
@Data
public class UserRegisterForm {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    @NotBlank
    @Email
    private String email;

}
