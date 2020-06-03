package io.mosidian.modules.member.service;

import io.mosidian.modules.member.Utils.IDCardGenerator;
import io.mosidian.modules.member.entity.MemberEntity;
import io.mosidian.modules.member.vo.MemberVo;
import io.mosidian.modules.sys.controller.AbstractController;
import io.mosidian.modules.sys.entity.SysUserEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author ZSY
 * @createTime 2020/5/28 15:16
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class MemberServiceTest extends AbstractController {

    @Resource
    private MemberService memberService;

    @Test
    void getMaxMemberByUserId() {
        MemberEntity member = memberService.getMaxMemberByUserId();
        log.info(member.getMemberId());
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher matcher = p.matcher(member.getMemberId());
        String num = matcher.replaceAll("").trim();
        log.info(num);
    }

    @Test
    void addMember() {



        BigDecimal balance = new BigDecimal(1218000000);
        for (int i = 120; i< 140; i++) {
            int sex= 0;
            int level = 0;
            if (i % 2 ==0) {
                sex = 0;
                level= 6;
            } else {
                sex = 1;
                level = 7;
            }



            SysUserEntity user = new SysUserEntity();
            user.setPassword("2020");
            //sha256加密
            String salt = RandomStringUtils.randomAlphanumeric(20);
            user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
            user.setSalt(salt);

            MemberVo memberVo = new MemberVo(
                    null, "cic" + i, "cic" + i + "@mosidian.com", "18888888888",
                    1, null, "cic" + i, "cic" + i, IDCardGenerator.generator(),"","",
                    sex,8,600, balance, BigDecimal.ZERO);
            memberService.saveMemberVo(memberVo, user);
        }

    }
}