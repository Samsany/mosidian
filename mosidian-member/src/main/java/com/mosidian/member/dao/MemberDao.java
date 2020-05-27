package com.mosidian.member.dao;

import com.mosidian.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员表
 * 
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-05-27 18:09:11
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
