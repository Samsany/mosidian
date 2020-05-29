package io.mosidian.modules.enterprise.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author ZSY
 * @createTime 2020/5/29 16:04
 */
@Data
public class EnterpriseVo {

    /*** 用户ID*/
    private Long userId;
    /*** 用户名*/
    private String username;
    private String email;
    private String mobile;
    private Integer status;
    /*** 会员卡号（如：BIC2020-0000-0000）*/
    private String enId;
    /*** 注册地址*/
    private String domicile;
    /*** 头像*/
    private String avatar;
    /*** 等级：1- Cu（铜），2-Ag（银），3-Au（金），4-Pt（铂），5-Zu（钻），6-MS（曜【白】），6-MS（曜【黑】），7-Ti（晶）*/
    private Integer level;
    /*** 信誉分（默认：600）*/
    private Integer credits;
    private Date createTime;
    private Date updateTime;
    /*** 企业全称*/
    private String name;
    /*** 企业官网*/
    private String website;
    /*** 企业规模*/
    private String scale;
    /*** 企业简介*/
    private String synopsis;
    /*** 法人*/
    private String corporation;
    /*** 认证理由*/
    private String reason;
    /*** 提供的服务*/
    private String eserver;
    /*** 企业类型*/
    private String companies;
    /*** 负责人*/
    private String headName;
    /*** 部门*/
    private String sector;
    /*** 职位*/
    private String eposition;
    /*** 负责人身份证号*/
    private String headCard;
    /*** 负责人电话*/
    private String emobile;
    /*** 负责人邮箱*/
    private String eemail;
    /***   审核人*/
    private String modifier;
    /*** 统一社会信用代码*/
    private String enlicenseId;
    /*** 营业执照*/
    private String enlicense;


}
