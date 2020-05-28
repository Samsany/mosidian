package io.mosidian.modules.member.service.impl;

import io.mosidian.modules.member.vo.MemberVo;
import io.mosidian.modules.sys.entity.SysUserEntity;
import io.mosidian.modules.sys.service.SysUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
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

@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberDao, MemberEntity> implements MemberService {

    @Resource
    private SysUserService userService;

    @Resource
    private MemberDao memberDao;

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
    public MemberVo saveMemberVo(MemberVo memberVo) {

        SysUserEntity userEntity = new SysUserEntity();
        MemberEntity memberEntity = new MemberEntity();

        BeanUtils.copyProperties(memberVo, userEntity);
        BeanUtils.copyProperties(memberVo, memberEntity);

        boolean save = userService.save(userEntity);
        if (save) {

        }
        int insert = memberDao.insert(memberEntity);

        return null;
    }

}