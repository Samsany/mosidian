package io.mosidian.modules.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.common.utils.R;
import io.mosidian.modules.member.entity.MemberEntity;
import io.mosidian.modules.member.vo.MemberVo;
import io.mosidian.modules.member.vo.MoneyVo;
import io.mosidian.modules.sys.entity.SysUserEntity;

import java.util.List;
import java.util.Map;

/**
 * 会员表
 *
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-05-28 10:42:41
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<MoneyVo> queryMoney();

    List<MoneyVo> queryMoneyById(Long id);

    List<MemberVo> queryPageVo(String key, String value);

    MemberVo getMemberById(String id);

    R saveMemberVo(MemberVo memberVo, SysUserEntity user);

    MemberEntity getMaxMemberByUserId();

    int removeByUserIds(List<String> asList);

    R updateByMember(MemberVo member);

    R updateByUser(MemberVo member);
}


