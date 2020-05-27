/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.mosidian.com
 *
 * 版权所有，侵权必究！
 */

package io.mosidian.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mosidian.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
