package io.mosidian.modules.enterprise.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mosidian.modules.enterprise.entity.EnterpriseEntity;
import io.mosidian.modules.enterprise.vo.EnterpriseVo;
import io.mosidian.modules.member.entity.MemberEntity;
import io.mosidian.modules.member.vo.MemberVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-05-29 15:58:45
 */
@Mapper
public interface EnterpriseDao extends BaseMapper<EnterpriseEntity> {

    List<EnterpriseVo> queryPageVo();

    EnterpriseEntity getMaxEnterpriseByUserId();

    EnterpriseVo getEnterpriseById(String id);

    int removeByUserIds(List<String> asList);
}
