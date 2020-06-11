package io.mosidian.modules.enterprise.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.common.utils.Query;
import io.mosidian.common.utils.R;
import io.mosidian.modules.enterprise.dao.EnterpriseDao;
import io.mosidian.modules.enterprise.entity.EnterpriseEntity;
import io.mosidian.modules.enterprise.service.EnterpriseService;
import io.mosidian.modules.enterprise.vo.EnterpriseVo;
import io.mosidian.modules.sys.entity.SysUserEntity;
import io.mosidian.modules.sys.entity.SysUserRoleEntity;
import io.mosidian.modules.sys.service.SysUserRoleService;
import io.mosidian.modules.sys.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service("enterpriseService")
@Slf4j
public class EnterpriseServiceImpl extends ServiceImpl<EnterpriseDao, EnterpriseEntity> implements EnterpriseService {

    @Resource
    private EnterpriseDao enterpriseDao;

    @Resource
    private EnterpriseService enterpriseService;

    @Resource
    private SysUserService sysUserService;

    @Resource
    private SysUserRoleService sysUserRoleService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EnterpriseEntity> page = this.page(
                new Query<EnterpriseEntity>().getPage(params),
                new QueryWrapper<EnterpriseEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<EnterpriseVo> queryPageVo(Integer flag,String key,String value) {
        return enterpriseDao.queryPageVo(flag,key,value);
    }

    @Transactional
    @Override
    public synchronized R saveEnterpriseVo(EnterpriseVo enterpriseVo, SysUserEntity user) {
        EnterpriseEntity enterpriseEntity = new EnterpriseEntity();

        BeanUtils.copyProperties(enterpriseVo, user);
        BeanUtils.copyProperties(enterpriseVo, enterpriseEntity);

        EnterpriseEntity enterprise = enterpriseService.getMaxEnterpriseByUserId();

        enterpriseEntity.setEnId(enterprise.getEnId());

        log.info("【客户卡】========》" + enterpriseEntity.getEnId());

        boolean save = sysUserService.save(user);
        if (!save) {
            return R.error("开卡失败");
        }
        enterpriseEntity.setUserId(user.getUserId());

        int result = enterpriseDao.insert(enterpriseEntity);
        if (result == 0) {
            return R.error("开卡失败");
        }

        //        默认会员权限
        SysUserRoleEntity userRoleEntity = new SysUserRoleEntity();
        userRoleEntity.setUserId(user.getUserId());
        userRoleEntity.setRoleId(Long.valueOf(user.getFlag()));

        sysUserRoleService.save(userRoleEntity);

        return R.ok("开卡成功");

    }

    @Override
    public EnterpriseEntity getMaxEnterpriseByUserId() {

        EnterpriseEntity enterpriseEntity = enterpriseDao.getMaxEnterpriseByUserId();

        if (enterpriseEntity != null) {
            String regEx="[^0-9]";
            Pattern p = Pattern.compile(regEx);
            Matcher matcher = p.matcher(enterpriseEntity.getEnId());
            String num = matcher.replaceAll("").trim();
            BigInteger b = new BigInteger(num);
            String enNum = String.valueOf(b.add(BigInteger.ONE));
            String str1 = StrUtil.sub(enNum,0, 4);
            String str2 = StrUtil.sub(enNum,4, 8);
            String str3 = StrUtil.sub(enNum,8, 12);
            String template;
            template = "CIC{}-{}-{}";
            String enId = StrUtil.format(template,str1, str2, str3);
            enterpriseEntity.setEnId(enId);
            return enterpriseEntity;
        } else {
            EnterpriseEntity entity = new EnterpriseEntity();
            entity.setEnId("CIC2020-0000-0000");
            return entity;
        }
    }

    @Override
    public EnterpriseVo getEnterpriseById(String id) {
        return enterpriseDao.getEnterpriseById(id);
    }

    @Override
    public int removeByUserIds(List<String> asList) {
        return enterpriseDao.removeByUserIds(asList);
    }


}