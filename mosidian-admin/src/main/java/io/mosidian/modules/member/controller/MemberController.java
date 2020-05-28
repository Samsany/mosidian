package io.mosidian.modules.member.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.mosidian.common.utils.R;
import io.mosidian.modules.member.entity.MemberEntity;
import io.mosidian.modules.member.service.MemberService;
import io.mosidian.modules.member.vo.MemberVo;
import io.mosidian.modules.sys.controller.AbstractController;
import io.mosidian.modules.sys.entity.SysUserEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * 会员表
 *
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-05-28 10:42:41
 */
@RestController
@RequestMapping("/member")
@Slf4j
public class MemberController extends AbstractController {
    @Autowired
    private MemberService memberService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("member:list")
    public R list(@RequestParam(value = "page", defaultValue = "1") Integer pageNum,
                  @RequestParam(value = "limit", defaultValue = "10") Integer pageSize){

        PageHelper.startPage(pageNum,pageSize);
        List<MemberVo> memberVoList = memberService.queryPageVo();
        PageInfo<MemberVo> page = new PageInfo<>(memberVoList);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("member:info")
    public R info(@PathVariable("id") String id){
		MemberVo member = memberService.getMemberById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("member:save")
    public R save(@RequestBody MemberVo member){

        SysUserEntity user = new SysUserEntity();
        user.setPassword("2020");
        //sha256加密
        String salt = RandomStringUtils.randomAlphanumeric(20);
        user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
        user.setSalt(salt);

        return memberService.saveMemberVo(member, user);

    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("member:delete")
    public R delete(@RequestBody String[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
