package io.mosidian.modules.enterprise.service.impl;

import io.mosidian.modules.enterprise.dao.EnterpriseDao;
import io.mosidian.modules.enterprise.entity.EnterpriseEntity;
import io.mosidian.modules.enterprise.service.EnterpriseService;
import io.mosidian.modules.enterprise.vo.EnterpriseVo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.common.utils.Query;

import javax.annotation.Resource;


@Service("enterpriseService")
public class EnterpriseServiceImpl extends ServiceImpl<EnterpriseDao, EnterpriseEntity> implements EnterpriseService {

    @Resource
    private EnterpriseDao enterpriseDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EnterpriseEntity> page = this.page(
                new Query<EnterpriseEntity>().getPage(params),
                new QueryWrapper<EnterpriseEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<EnterpriseVo> queryPageVo() {
        return enterpriseDao.queryPageVo();
    }

}