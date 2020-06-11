package io.mosidian.modules.mall.enums;

import lombok.Getter;

/**
 * @Classname ProductStatusEnum
 * @Date 2020/3/29 15:58
 * @Author ZSY
 */
@Getter
public enum  ProductStatusEnum {

    ON_SALE(1),

    OFF_SALE(2),

    DELETE(3),
    ;

    Integer code;

    ProductStatusEnum(Integer code) {
        this.code = code;
    }
}
