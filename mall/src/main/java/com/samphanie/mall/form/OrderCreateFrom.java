package com.samphanie.mall.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Classname OrderCreateFrom
 * @Date 2020/4/8 15:23
 * @Author ZSY
 */
@Data
public class OrderCreateFrom {

    @NotNull
    private Integer shippingId;

}
