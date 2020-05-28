package io.mosidian.modules.member.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.mosidian.common.validator.group.AddGroup;
import io.mosidian.common.validator.group.UpdateGroup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author ZSY
 * @createTime 2020/5/28 11:48
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVo {

    /*** 用户ID*/
    private Long userId;
    /*** 用户名*/
    private String username;
    private String email;
    private String mobile;
    private Integer status;
    /*** 会员卡号（如：AIC2020-0000-0000）*/
    private String memberId;
    private String name;
    private String nickname;
    private String card;
    /*** 注册地址*/
    private String domicile;
    /*** 头像*/
    private String avatar;
    /*** 性别*/
    private Integer gender;
    /*** 等级：1- Cu（铜），2-Ag（银），3-Au（金），4-Pt（铂），5-Zu（钻），6-MS（曜【白】），6-MS（曜【黑】），7-Ti（晶）*/
    private Integer level;
    /*** 信誉分（默认：600）*/
    private Integer credits;
    private Date createTime;
    private Date updateTime;
    /*** 账户余额（默认：288）*/
    private BigDecimal balance;
    /*** 消费总金额（默认：600）*/
    private BigDecimal monetary;

}