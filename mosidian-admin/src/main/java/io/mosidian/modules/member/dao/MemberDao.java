package io.mosidian.modules.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mosidian.modules.member.entity.MemberEntity;
import io.mosidian.modules.member.vo.MemberVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 会员表
 * 
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-05-27 18:09:11
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

    List<MemberVo> queryPageVo();

    MemberVo getMemberById(String id);
}
