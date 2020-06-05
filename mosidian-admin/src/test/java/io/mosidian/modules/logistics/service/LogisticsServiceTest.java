package io.mosidian.modules.logistics.service;

import io.mosidian.modules.enterprise.vo.EnterpriseVo;
import io.mosidian.modules.logistics.vo.LogisticsVo;
import io.mosidian.modules.member.Utils.IDCardGenerator;
import io.mosidian.modules.sys.entity.SysUserEntity;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

/**
 * @Author ZSY
 * @createTime 2020/6/4 16:32
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class LogisticsServiceTest {

    @Autowired
    private LogisticsService logisticsService;

    @Test
    void queryPageVo() {
    }

    @Test
    void saveLogisticsVo() {

        BigDecimal balance = new BigDecimal(288);

        for (int num = 100 ; num < 105 ; num++) {

            LogisticsVo logisticsVo = new LogisticsVo(
                    null,"bic" + num, "bic" + num + "@mosidian.com",
                    "1888888888", "xxxxxx" + num +"号楼", "bic" + num,
                    "www.bic.com","10-100人","物流服务", "物流企业" + num,
                    "需要莫斯蒂恩开放平台提供一些技术支持","物流服务", "物流公司", "bic" + num,
                    "测试部门","测试职位", IDCardGenerator.generator(), "1788888888", "bic" + num + "@mosidian.com",
                    "管理员","91330703350079701" + num, balance, BigDecimal.ZERO,1
            );

            SysUserEntity user = new SysUserEntity();
            user.setFlag(3);
            user.setPassword("2020");
            //sha256加密
            String salt = RandomStringUtils.randomAlphanumeric(20);
            user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
            user.setSalt(salt);

            logisticsService.saveLogisticsVo(logisticsVo, user);
        }

    }

    @Test
    void getMaxLogisticsByUserId() {
    }

    @Test
    void getLogisticsById() {
    }

    @Test
    void removeByUserIds() {
    }
}