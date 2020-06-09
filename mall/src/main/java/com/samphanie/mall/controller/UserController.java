package com.samphanie.mall.controller;

import com.samphanie.mall.consts.MallConst;
import com.samphanie.mall.entity.User;
import com.samphanie.mall.form.UserLoginForm;
import com.samphanie.mall.form.UserRegisterForm;
import com.samphanie.mall.service.IUserService;
import com.samphanie.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@RestController
@Slf4j
//@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/user/register")
    public ResponseVo<User> register(@RequestBody @Valid UserRegisterForm userRegisterForm) {

//        if (bindingResult.hasErrors()) {
//
//            log.error("注册提交的参数有误，{} {}",
//                    Objects.requireNonNull(bindingResult.getFieldError()).getField(),
//                    bindingResult.getFieldError().getDefaultMessage());
//            Map<String, Object> map = new HashMap<>();
//            map.put("userFrom", userRegisterForm);
//            throw new MallException(ResponseEnum.PARAM_ERROR, bindingResult, map);
//
//        }

        User user = new User();
        BeanUtils.copyProperties(userRegisterForm, user);

        return userService.register(user);
    }

    @PostMapping("/user/login")
    public ResponseVo<User> login(@RequestBody @Valid UserLoginForm loginForm,
                                  HttpSession session) {

        ResponseVo<User> userResponseVo = userService.login(loginForm.getUsername(), loginForm.getPassword());
        // 设置session
        session.setAttribute(MallConst.CURRENT_USER, userResponseVo.getData());

        return userResponseVo;
    }

    // session保存在内存，改进版：token + redis
    @GetMapping("/user")
    public ResponseVo<User> userInfo(HttpSession session) {

        User user = (User) session.getAttribute(MallConst.CURRENT_USER);

        return ResponseVo.successByData(user);

    }

    @PostMapping("/user/logout")
    public ResponseVo logout(HttpSession session) {

        session.removeAttribute(MallConst.CURRENT_USER);

        return ResponseVo.success();
    }


//    @GetMapping("/login")
//    public void login() {
//
//        User person = new Person(1, "SnailClimb");
//
//        throw new ResourceNotFoundException(ImmutableMap.of("user id:",person.getId()));
//    }

}
