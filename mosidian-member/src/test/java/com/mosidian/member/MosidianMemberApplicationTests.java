package com.mosidian.member;

import com.mosidian.member.entity.MemberEntity;
import com.mosidian.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
@Slf4j
class MosidianMemberApplicationTests {

    @Resource
    private MemberService memberService;

    @Test
    void contextLoads() {
    }

    @Test
    void addMember() {
        MemberEntity memberEntity = new MemberEntity(
                "AIC2020-0000-0000","刘纬易","sean","123456","xxxxxxxxxxxxxxxxx", "17354056086","sean@qq.com",
                null, null, null, null, null
        );

        boolean save = memberService.save(memberEntity);

        log.info("【result】->" + save);


    }

}
