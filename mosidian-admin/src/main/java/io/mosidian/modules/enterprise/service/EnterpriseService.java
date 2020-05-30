package io.mosidian.modules.enterprise.service;


import com.baomidou.mybatisplus.extension.service.IService;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.common.utils.R;
import io.mosidian.modules.enterprise.entity.EnterpriseEntity;
import io.mosidian.modules.enterprise.vo.EnterpriseVo;
import io.mosidian.modules.sys.entity.SysUserEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-05-29 15:58:45
 */
public interface EnterpriseService extends IService<EnterpriseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<EnterpriseVo> queryPageVo();

    R saveEnterpriseVo(EnterpriseVo enterpriseVo, SysUserEntity user);

    EnterpriseEntity getMaxEnterpriseByUserId(Integer flag);

    EnterpriseVo getEnterpriseById(String valueOf);
}

