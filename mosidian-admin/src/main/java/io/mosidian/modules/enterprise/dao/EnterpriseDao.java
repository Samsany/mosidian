package io.mosidian.modules.enterprise.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mosidian.modules.enterprise.entity.EnterpriseEntity;
import io.mosidian.modules.enterprise.vo.EnterpriseVo;
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
}
