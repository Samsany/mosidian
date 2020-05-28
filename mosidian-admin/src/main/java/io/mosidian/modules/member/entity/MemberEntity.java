package io.mosidian.modules.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 会员表
 * 
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-05-27 18:09:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_member")
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 会员卡号（如：AIC2020-0000-0000）
	 */
	@TableId
	private String memberId;

	private Long userId;
	/**
	 * 会员真实姓名
	 */
	private String name;
	/**
	 * 昵称
	 */
	private String nickname;

	/**
	 * 头像
	 */
	private String avatar;

	/**
	 * 性别
	 */
	private Integer gender;

	/**
	 * 身份证号
	 */
	private String card;

	/**
	 * 等级：1- Cu（铜），2-Ag（银），3-Au（金），4-Pt（铂），5-Zu（钻），6-MS（曜【白】），6-MS（曜【黑】），7-Ti（晶）
	 */
	private Integer level;
	/**
	 * 信誉分（默认：600）
	 */
	private Integer credits;
	/**
	 * 账户余额（默认：288）
	 */
	private BigDecimal balance;

	/**
	 * 消费总金额（默认：600）
	 */
	private BigDecimal monetary;

	/**
	 * 注册地址
	 */
	private String domicile;

	/**
	 * 修改时间
	 */
	private Date updateTime;

}
