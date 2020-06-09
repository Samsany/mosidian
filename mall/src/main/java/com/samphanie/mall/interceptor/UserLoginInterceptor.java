package com.samphanie.mall.interceptor;

import com.samphanie.mall.consts.MallConst;
import com.samphanie.mall.entity.User;
import com.samphanie.mall.enums.ResponseEnum;
import com.samphanie.mall.exception.MallException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Classname UserLoginInterceptor
 * @Date 2020/3/28 18:11
 * @Author ZSY
 */
@Slf4j
public class UserLoginInterceptor implements HandlerInterceptor {

    /***
     * @Description: preHandle
     * @param: [request, response, handler]
     * @return: boolean
     * @date: 2020/3/28 18:16
     **/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.info("preHandle...");
        User user = (User) request.getSession().getAttribute(MallConst.CURRENT_USER);

        if (user == null) {
            throw new MallException(ResponseEnum.NEED_LOGIN);
        }

        return true;
    }
}
