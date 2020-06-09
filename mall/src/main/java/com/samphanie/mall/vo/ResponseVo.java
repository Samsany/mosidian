package com.samphanie.mall.vo;

import com.samphanie.mall.enums.ResponseEnum;
import lombok.Data;

/**
 * @Classname ResponseVo
 * @Description TODO
 * @Date 2020/3/25 10:05
 * @Author ZSY
 */
@Data
public class ResponseVo<T> {

    private Integer code;

    private String msg;

    private T data;

    public ResponseVo(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseVo(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public ResponseVo(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseVo<T> success() {
        return new ResponseVo<>(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMessage());
    }

    public static <T> ResponseVo<T> successByData(T data) {
        return new ResponseVo<>(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMessage(), data);
    }

    public static <T> ResponseVo<T> success(String msg) {
        return new ResponseVo<>(ResponseEnum.SUCCESS.getCode(), msg);
    }

    public static <T> ResponseVo<T> error() {
        return new ResponseVo<>(ResponseEnum.ERROR.getCode(), ResponseEnum.ERROR.getMessage());
    }

    public static <T> ResponseVo<T> error(Integer code, String msg) {
        return new ResponseVo<>(code, msg);
    }

}
