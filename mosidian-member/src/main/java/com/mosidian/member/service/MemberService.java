package com.mosidian.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mosidian.member.entity.MemberEntity;
import com.mosidian.common.utils.PageUtils;

import java.util.Map;

/**
 * 会员表
 *
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-05-27 18:09:11
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

