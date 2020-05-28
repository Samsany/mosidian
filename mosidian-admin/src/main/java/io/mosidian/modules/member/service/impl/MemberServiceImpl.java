package io.mosidian.modules.member.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import io.mosidian.common.utils.R;
import io.mosidian.modules.member.vo.MemberVo;
import io.mosidian.modules.sys.controller.AbstractController;
import io.mosidian.modules.sys.entity.SysUserEntity;
import io.mosidian.modules.sys.entity.SysUserRoleEntity;
import io.mosidian.modules.sys.service.SysUserRoleService;
import io.mosidian.modules.sys.service.SysUserService;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.common.utils.Query;
import io.mosidian.modules.member.dao.MemberDao;
import io.mosidian.modules.member.entity.MemberEntity;
import io.mosidian.modules.member.service.MemberService;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author ZSY
 */
@Service("memberService")
@Slf4j
public class MemberServiceImpl extends ServiceImpl<MemberDao, MemberEntity> implements MemberService {


    @Resource
    private SysUserService sysUserService;

    @Resource
    private MemberService memberService;

    @Resource
    private MemberDao memberDao;

    @Resource
    private SysUserRoleService sysUserRoleService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberEntity> page = this.page(
                new Query<MemberEntity>().getPage(params),
                new QueryWrapper<MemberEntity>()
        );
        return new PageUtils(page);
    }

    @Override
    public List<MemberVo> queryPageVo() {
        return memberDao.queryPageVo();
    }

    @Override
    public MemberVo getMemberById(String id) {
        return memberDao.getMemberById(id);
    }

    @Transactional
    @Override
    public synchronized R saveMemberVo(MemberVo memberVo,SysUserEntity user) {

        MemberEntity memberEntity = new MemberEntity();

        BeanUtils.copyProperties(memberVo, user);
        BeanUtils.copyProperties(memberVo, memberEntity);

        MemberEntity member = memberService.getMaxMemberByUserId();

        memberEntity.setMemberId(member.getMemberId());

        log.info("【会员卡】========》" + memberEntity.getMemberId());

        boolean save = sysUserService.save(user);
        if (!save) {
            return R.error();
        }
        memberEntity.setUserId(user.getUserId());

        int result = memberDao.insert(memberEntity);
        if (result == 0) {
            return R.error();
        }

        //        默认会员权限
        SysUserRoleEntity userRoleEntity = new SysUserRoleEntity();
        userRoleEntity.setUserId(user.getUserId());
        userRoleEntity.setRoleId(Long.parseLong("2"));

        sysUserRoleService.save(userRoleEntity);

        return R.ok();
    }

    @Override
    public MemberEntity getMaxMemberByUserId() {
        MemberEntity memberEntity = memberDao.getMaxMemberByUserId();
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher matcher = p.matcher(memberEntity.getMemberId());
        String num = matcher.replaceAll("").trim();
        BigInteger b = new BigInteger(num);
        String memberNum = String.valueOf(b.add(BigInteger.ONE));
        String str1 = StrUtil.sub(memberNum,0, 4);
        String str2 = StrUtil.sub(memberNum,4, 8);
        String str3 = StrUtil.sub(memberNum,8, 12);
        String template = "AIC{}-{}-{}";
        String memberId = StrUtil.format(template,str1, str2, str3);
        memberEntity.setMemberId(memberId);

        return memberEntity;
    }

}