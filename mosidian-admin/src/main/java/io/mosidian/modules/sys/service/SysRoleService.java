/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.mosidian.com
 *
 * 版权所有，侵权必究！
 */

package io.mosidian.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.modules.sys.entity.SysRoleEntity;

import java.util.List;
import java.util.Map;


/**
 * 角色
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void saveRole(SysRoleEntity role);

	void update(SysRoleEntity role);

	void deleteBatch(Long[] roleIds);

	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}