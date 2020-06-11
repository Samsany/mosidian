package io.mosidian.modules.mall.enums;

import lombok.Getter;

/**
 * @Classname PaymentTypeEnum
 * @Date 2020/4/7 17:13
 * @Author ZSY
 */
@Getter
public enum PaymentTypeEnum {

    PAY_ONLINE(1, "在线支付"),
    ;

    private Integer code;
    private String desc;

    PaymentTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
