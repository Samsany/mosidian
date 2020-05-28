package io.mosidian.modules.member.service;

import io.mosidian.common.utils.R;
import io.mosidian.modules.member.Utils.GeneratorMember;
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

        BigDecimal balance = new BigDecimal(288);
        String randomJianHan;
        for (int i= 0; i< 5; i++) {
            if (i % 2 == 0){
                randomJianHan = GeneratorMember.getRandomJianHan(2);
            } else {
                randomJianHan = GeneratorMember.getRandomJianHan(3);
            }

            SysUserEntity user = new SysUserEntity();
            user.setPassword("2020");
            //sha256加密
            String salt = RandomStringUtils.randomAlphanumeric(20);
            user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
            user.setSalt(salt);

            MemberVo memberVo = new MemberVo(
                    null, GeneratorMember.getStringRandom(6), "test@mosidian.com", "173xxxxxxxx",
                    null, null,
                    randomJianHan, randomJianHan, IDCardGenerator.generator(),"","",
                    0,1,600, balance, BigDecimal.ZERO);
            memberService.saveMemberVo(memberVo, user);
        }

    }
}