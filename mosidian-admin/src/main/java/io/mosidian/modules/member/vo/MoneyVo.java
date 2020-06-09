package io.mosidian.modules.member.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 一些声明信息
 * ClassName: sean <br/>
 * Description: <br/>
 * date: 2020/6/5 14:03<br/>
 *
 * @author 19684<br />
 * @since JDK 1.8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoneyVo {

    private Long userId;

    /**
     * 排名
     */
    private Long moneyid;

    /**
     * 昵称
     */
    private String nickname;
    /**
     * 消费金额
     */
    private BigDecimal monetary;
}
