package com.samphanie.mall.enums;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @Classname ErrorCode
 * @Description 异常的唯一标识、HTTP 状态码以及错误信息
 * @Date 2020/3/23 10:53
 * @Author ZSY
 */
@Getter
public enum ResponseEnum {

    RESOUECR_NOT_FOUND(1001, HttpStatus.NOT_FOUND, "未找到该资源"),

    REQUEST_VALIDATION_FAILED(1002, HttpStatus.BAD_REQUEST, "请求数据格式验证失败"),

    REGISTRATION_FAILURE(1003, HttpStatus.INTERNAL_SERVER_ERROR, "注册失败"),

    ERROR(-1, HttpStatus.BAD_REQUEST,"服务端错误"),

    SUCCESS(0, HttpStatus.BAD_REQUEST,"成功"),

    PASSWORD_ERROR(1, HttpStatus.BAD_REQUEST,"密码错误"),

    USERNAME_EXIST(2, HttpStatus.BAD_REQUEST,"用户名已存在"),

    PARAM_ERROR(3, HttpStatus.BAD_REQUEST,"参数错误"),

    EMAIL_ERROR(4, HttpStatus.BAD_REQUEST,"邮箱已存在"),

    NEED_LOGIN(10, HttpStatus.BAD_REQUEST,"用户未登录,请先登录"),

    USERNAME_OR_PASSWORD_ERROR(11, HttpStatus.BAD_REQUEST, "登录失败，用户名或密码错误"),

    PRODUCT_OFF_SALE_OR_DELETE(12, HttpStatus.INTERNAL_SERVER_ERROR, "商品下架或删除"),

    PRODUCT_NOT_EXIST(13, HttpStatus.INTERNAL_SERVER_ERROR, "商品不存在"),

    PRODUCT_STOCK_ERROR(14, HttpStatus.INTERNAL_SERVER_ERROR, "商品库存不足"),

    CART_PRODUCT_NOT_EXIST(15, HttpStatus.INTERNAL_SERVER_ERROR, "购物车无此商品"),

    DELETE_SHIPPING_FAIL(16, HttpStatus.INTERNAL_SERVER_ERROR, "删除收货地址失败"),

    UPDATE_SHIPPING_FAIL(17, HttpStatus.INTERNAL_SERVER_ERROR, "更新收货地址失败"),

    SHIPPING_NOT_EXIST(18, HttpStatus.INTERNAL_SERVER_ERROR, "收货地址不存在"),

    CART_SELECTED_IS_EMPTY(19, HttpStatus.INTERNAL_SERVER_ERROR, "请选择商品后下单"),

    ORDER_NOT_EXIST(20, HttpStatus.INTERNAL_SERVER_ERROR, "订单不存在"),

    ORDER_STATUS_ERROR(21, HttpStatus.INTERNAL_SERVER_ERROR, "订单状态不正确"),
    ;

    private final Integer code;

    private final HttpStatus status;

    private final String message;

    ResponseEnum(Integer code, HttpStatus status, String message){
        this.code = code;
        this.status = status;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorCode{" +
                "code=" + code +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
