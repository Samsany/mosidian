package io.mosidian.modules.mall.exception;

import io.mosidian.modules.mall.enums.ResponseEnum;

import java.util.Map;

/**
 * @Classname ResourceNotFoundException
 * @Description  自定义异常类型 一般我们处理的都是 RuntimeException ，所以如果你需要自定义异常类型的话直接集成这个类就可以了。
 * @Date 2020/3/23 10:37
 * @Author ZSY
 */
public class ResourceNotFoundException extends BaseException {

    public ResourceNotFoundException(Map<String, Object> data) {
        super(ResponseEnum.RESOUECR_NOT_FOUND, data);
    }
}
