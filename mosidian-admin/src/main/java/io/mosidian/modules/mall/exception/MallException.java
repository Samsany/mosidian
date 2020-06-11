package io.mosidian.modules.mall.exception;


import io.mosidian.modules.mall.enums.ResponseEnum;

import java.util.Map;

/**
 * @Classname MallException
 * @Description TODO
 * @Date 2020/3/24 20:17
 * @Author ZSY
 */
public class MallException extends BaseException {

    public MallException(ResponseEnum error) {
        super(error);
    }

    public MallException(ResponseEnum error, Map<String, Object> data) {
        super(error, data);
    }

}
