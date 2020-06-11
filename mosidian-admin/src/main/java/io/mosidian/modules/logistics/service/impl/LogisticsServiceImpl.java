package io.mosidian.modules.logistics.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.common.utils.Query;
import io.mosidian.common.utils.R;
import io.mosidian.modules.logistics.dao.LogisticsDao;
import io.mosidian.modules.logistics.entity.LogisticsEntity;
import io.mosidian.modules.logistics.service.LogisticsService;
import io.mosidian.modules.logistics.vo.LogisticsVo;
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

@Slf4j
@Service("logisticsService")
public class LogisticsServiceImpl extends ServiceImpl<LogisticsDao, LogisticsEntity> implements LogisticsService {

    @Resource
    private LogisticsDao logisticsDao;

    @Resource
    private LogisticsService logisticsService;

    @Resource
    private SysUserService sysUserService;

    @Resource
    private SysUserRoleService sysUserRoleService;


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<LogisticsEntity> page = this.page(
                new Query<LogisticsEntity>().getPage(params),
                new QueryWrapper<LogisticsEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<LogisticsVo> queryPageVo(Integer flag,String key,String value) {
        return logisticsDao.queryPageVo(flag,key,value);
    }

    @Transactional
    @Override
    public synchronized R saveLogisticsVo(LogisticsVo logisticsVo, SysUserEntity user) {
        LogisticsEntity logisticsEntity = new LogisticsEntity();

        BeanUtils.copyProperties(logisticsVo, user);
        BeanUtils.copyProperties(logisticsVo, logisticsEntity);

        LogisticsEntity logistics = logisticsService.getMaxLogisticsByUserId(user.getFlag());

        logisticsEntity.setEnId(logistics.getEnId());

        log.info("【客户卡】========》" + logisticsEntity.getEnId());

        boolean save = sysUserService.save(user);
        if (!save) {
            return R.error("开卡失败");
        }
        logisticsEntity.setUserId(user.getUserId());

        int result = logisticsDao.insert(logisticsEntity);
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
    public LogisticsEntity getMaxLogisticsByUserId(Integer flag) {

        LogisticsEntity logisticsEntity = logisticsDao.getMaxLogisticsByUserId();

        if (logisticsEntity != null) {
            String regEx="[^0-9]";
            Pattern p = Pattern.compile(regEx);
            Matcher matcher = p.matcher(logisticsEntity.getEnId());
            String num = matcher.replaceAll("").trim();
            BigInteger b = new BigInteger(num);
            String enNum = String.valueOf(b.add(BigInteger.ONE));
            String str1 = StrUtil.sub(enNum,0, 4);
            String str2 = StrUtil.sub(enNum,4, 8);
            String str3 = StrUtil.sub(enNum,8, 12);
            String template = "BIC{}-{}-{}";
            String enId = StrUtil.format(template,str1, str2, str3);
            logisticsEntity.setEnId(enId);
            return logisticsEntity;
        } else {
            LogisticsEntity entity = new LogisticsEntity();
            entity.setEnId("BIC2020-0000-0000");
            return entity;
        }
    }

    @Override
    public LogisticsVo getLogisticsById(String id) {
        return logisticsDao.getLogisticsById(id);
    }

    @Override
    public int removeByUserIds(List<String> asList) {
        return logisticsDao.removeByUserIds(asList);
    }

}