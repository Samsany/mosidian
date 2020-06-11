package io.mosidian.modules.mall.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author ZSY
 * @createTime 2020/6/10 17:05
 */
@Data
public class RechargeCreateFrom {

    @NotNull
    private String recharge;

}
