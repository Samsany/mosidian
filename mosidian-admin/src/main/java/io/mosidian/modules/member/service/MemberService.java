package io.mosidian.modules.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.modules.member.entity.MemberEntity;
import io.mosidian.modules.member.vo.MemberVo;

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

    List<MemberVo> queryPageVo();

    MemberVo getMemberById(String id);

    MemberVo saveMemberVo(MemberVo memberVo);
}


