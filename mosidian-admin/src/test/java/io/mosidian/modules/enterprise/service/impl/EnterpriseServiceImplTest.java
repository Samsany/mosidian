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

        for (int num = 0 ; num < 10 ; num++) {
            EnterpriseVo enterpriseVo = new EnterpriseVo(
                "test0" + num, "test" + num + "@mosidian.com",
                    "1738888888" + num, "北京中关村" + num +"号楼", "测试企业",
                    "www.test.com","10-100人","物流服务", "测试企业" + num,
                    "需要莫斯蒂恩开放平台提供一些技术支持","物流服务", "测试类型", GeneratorMember.getRandomJianHan(3),
                    "测试部门","测试职位", IDCardGenerator.generator(), "1788888888" + num, "poerson" + num + "@mosidian.com",
                    "管理员","91330703350079701" + num
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

        for (int num = 10 ; num < 20 ; num++) {
            EnterpriseVo enterpriseVo = new EnterpriseVo(
                    "qiyetest0" + num, "qiyetest" + num + "@mosidian.com",
                    "1738888888" + num, "北京中关村" + num +"号楼", "测试企业",
                    "www.qiyetest.com","10-100人","企业服务", "测试企业" + num,
                    "需要莫斯蒂恩开放平台提供一些技术支持","企业服务", "测试类型", GeneratorMember.getRandomJianHan(3),
                    "测试部门","测试职位", IDCardGenerator.generator(), "178888888" + num, "company" + num + "@mosidian.com",
                    "管理员","90330703350079701" + num
            );

            SysUserEntity user = new SysUserEntity();
            user.setFlag(4);
            user.setPassword("2020");
            //sha256加密
            String salt = RandomStringUtils.randomAlphanumeric(20);
            user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
            user.setSalt(salt);

            enterpriseService.saveEnterpriseVo(enterpriseVo, user);
        }

    }
}