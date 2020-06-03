package io.mosidian.modules.enterprise.service.impl;

import io.mosidian.modules.enterprise.service.EnterpriseService;
import io.mosidian.modules.enterprise.vo.EnterpriseVo;
import io.mosidian.modules.member.Utils.GeneratorMember;
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
 * @createTime 2020/5/30 12:22
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class EnterpriseServiceImplTest {

    @Autowired
    private EnterpriseService enterpriseService;

    @Test
    void saveEnterpriseVoWuliu() {

        BigDecimal balance = new BigDecimal(1218000);

        String bic = "BIC2000-0000-00";

        for (int num = 60 ; num < 70 ; num++) {

            EnterpriseVo enterpriseVo = new EnterpriseVo(
                bic + num,"bic" + num, "bic" + num + "@mosidian.com",
                    "1888888888", "xxxxxx" + num +"号楼", "bic" + num,
                    "www.bic.com","10-100人","物流服务", "物流企业" + num,
                    "需要莫斯蒂恩开放平台提供一些技术支持","物流服务", "物流公司", "bic" + num,
                    "测试部门","测试职位", IDCardGenerator.generator(), "1788888888", "bic" + num + "@mosidian.com",
                    "管理员","91330703350079701" + num, balance,BigDecimal.ZERO,7
            );

            SysUserEntity user = new SysUserEntity();
            user.setFlag(3);
            user.setPassword("2020");
            //sha256加密
            String salt = RandomStringUtils.randomAlphanumeric(20);
            user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
            user.setSalt(salt);

            enterpriseService.saveEnterpriseVo(enterpriseVo, user);
        }

    }

    @Test
    void saveEnterpriseVoQiye() {

        String ci = "CIC2000-0000-0000";
        String cic = "CIC2000-0000-000";

        BigDecimal balance = new BigDecimal(288);
        BigDecimal balance1 = new BigDecimal(1218);
        BigDecimal balance2 = new BigDecimal(12180);
        BigDecimal balance3 = new BigDecimal(121800);
        BigDecimal balance4 = new BigDecimal(1218000);
        BigDecimal balance5 = new BigDecimal(12180000);
        BigDecimal balance6 = new BigDecimal(1218000000);

        for (int num = 30 ; num < 40 ; num++) {
            EnterpriseVo enterpriseVo = new EnterpriseVo(
                    cic + num, "cic" + num,"cic" + num + "@mosidian.com",
                    "1738888888", "北京中关村" + num +"号楼", "测试企业",
                    "www.qiyetest.com","10-100人","企业服务", "测试企业" + num,
                    "需要莫斯蒂恩开放平台提供一些技术支持","企业服务", "测试类型", "cic" + num,
                    "测试部门","测试职位", IDCardGenerator.generator(), "188888888", "company" + num + "@mosidian.com",
                    "管理员","903307033500797" + num,balance3,BigDecimal.ZERO,4
            );

            SysUserEntity user = new SysUserEntity();
            user.setFlag(4);
            //sha256加密
            String salt = RandomStringUtils.randomAlphanumeric(20);
            user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
            user.setSalt(salt);

            enterpriseService.saveEnterpriseVo(enterpriseVo, user);
        }

    }
}