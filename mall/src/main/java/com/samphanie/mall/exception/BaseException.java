package com.samphanie.mall.exception;

import com.samphanie.mall.enums.ResponseEnum;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Classname BaseException
 * @Description 继承自 RuntimeException 的抽象类，可以看做系统中其他异常类的父类
 * @Date 2020/3/23 11:01
 * @Author ZSY
 */
@Getter
public abstract class BaseException extends RuntimeException {

    private final ResponseEnum error;

    private BindingResult bindingResult;

    private final HashMap<String, Object> data = new HashMap<>();

    public BaseException(ResponseEnum error) {
        super(error.getMessage());
        this.error = error;
    }

    public BaseException(ResponseEnum error, Map<String, Object> data) {
        super(error.getMessage());
        this.error = error;
        if (!ObjectUtils.isEmpty(data)) {
            this.data.putAll(data);
        }
    }

}
