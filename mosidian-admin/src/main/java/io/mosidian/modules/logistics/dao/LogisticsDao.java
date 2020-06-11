package io.mosidian.modules.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mosidian.modules.logistics.entity.LogisticsEntity;
import io.mosidian.modules.logistics.vo.LogisticsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-06-04 15:36:46
 */
@Mapper
public interface LogisticsDao extends BaseMapper<LogisticsEntity> {

    List<LogisticsVo> queryPageVo(Integer flag,String key,String value);

    LogisticsEntity getMaxLogisticsByUserId();

    LogisticsVo getLogisticsById(String id);

    int removeByUserIds(List<String> asList);
}
