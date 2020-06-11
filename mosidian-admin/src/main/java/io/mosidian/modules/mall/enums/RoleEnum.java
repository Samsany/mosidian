package io.mosidian.modules.mall.enums;

import lombok.Getter;

/**
 * @Classname RoleEnum
 * @Description 角色
 * @Date 2020/3/24 22:04
 * @Author ZSY
 */
@Getter
public enum RoleEnum {

    ADMIN(0, "管理员"),

    CUSTOMER(1, "用户"),
    ;

    private Integer code;

    private String name;

    RoleEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }
}
