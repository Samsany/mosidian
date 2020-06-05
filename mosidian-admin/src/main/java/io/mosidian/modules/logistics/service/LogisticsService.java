package io.mosidian.modules.logistics.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.common.utils.R;
import io.mosidian.modules.enterprise.entity.EnterpriseEntity;
import io.mosidian.modules.enterprise.vo.EnterpriseVo;
import io.mosidian.modules.logistics.entity.LogisticsEntity;
import io.mosidian.modules.logistics.vo.LogisticsVo;
import io.mosidian.modules.sys.entity.SysUserEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-06-04 15:36:46
 */
public interface LogisticsService extends IService<LogisticsEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<LogisticsVo> queryPageVo(Integer flag);

    R saveLogisticsVo(LogisticsVo logisticsVo, SysUserEntity user);

    LogisticsEntity getMaxLogisticsByUserId(Integer flag);

    LogisticsVo getLogisticsById(String valueOf);

    int removeByUserIds(List<String> asList);
}

