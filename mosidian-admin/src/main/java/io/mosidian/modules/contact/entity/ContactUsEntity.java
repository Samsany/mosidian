package io.mosidian.modules.contact.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-06-01 10:02:05
 */
@Data
@TableName("sys_contact_us")
public class ContactUsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 手机号
	 */
	private String phone;
	/**
	 * 反馈消息
	 */
	private String feedbackMessage;
	/**
	 * 提交时间
	 */
	private Date createdate;
	/**
	 * 记录状态
	 */
	private String recordstatus;
	/**
	 * 状态 0 正常
	 */
	private Integer status;

}
