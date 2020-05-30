package io.mosidian.modules.enterprise.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.mosidian.common.utils.R;
import io.mosidian.modules.enterprise.entity.EnterpriseEntity;
import io.mosidian.modules.enterprise.service.EnterpriseService;
import io.mosidian.modules.enterprise.vo.EnterpriseVo;
import io.mosidian.modules.member.vo.MemberVo;
import io.mosidian.modules.sys.controller.AbstractController;
import io.mosidian.modules.sys.entity.SysUserEntity;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * 
 *
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-05-29 15:58:45
 */
@RestController
@RequestMapping("/enterprise")
public class EnterpriseController extends AbstractController {

    @Autowired
    private EnterpriseService enterpriseService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("enterprise:list")
    public R list(@RequestParam(value = "page", defaultValue = "1") Integer pageNum,
                  @RequestParam(value = "limit", defaultValue = "10") Integer pageSize){

        PageHelper.startPage(pageNum,pageSize);
        List<EnterpriseVo> enterpriseVos = enterpriseService.queryPageVo();
        PageInfo<EnterpriseVo> page = new PageInfo<>(enterpriseVos);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @GetMapping("/info")
    @RequiresPermissions("member:info")
    public R info(){

        SysUserEntity user = getUser();
        EnterpriseVo enterprise = enterpriseService.getEnterpriseById(String.valueOf(user.getUserId()));

        return R.ok().put("enterprise", enterprise);
    }

    /**
     * 保存
     */
    @RequestMapping("/wuliu/save")
    @RequiresPermissions("enterprise:save")
    public R saveWuliu(@RequestBody EnterpriseVo enterpriseVo){
        SysUserEntity user = new SysUserEntity();
        user.setFlag(3);
        user.setPassword("2020");
        //sha256加密
        String salt = RandomStringUtils.randomAlphanumeric(20);
        user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
        user.setSalt(salt);
        return enterpriseService.saveEnterpriseVo(enterpriseVo, user);
    }

    /**
     * 保存
     */
    @RequestMapping("/qiye/save")
    @RequiresPermissions("enterprise:save")
    public R saveQiye(@RequestBody EnterpriseVo enterpriseVo){

        SysUserEntity user = new SysUserEntity();
        user.setFlag(4);
        user.setPassword("2020");
        //sha256加密
        String salt = RandomStringUtils.randomAlphanumeric(20);
        user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
        user.setSalt(salt);

        return enterpriseService.saveEnterpriseVo(enterpriseVo, user);

    }

    /**
     * 信息
     */
    @RequestMapping("/info/{eId}")
    @RequiresPermissions("enterprise:info")
    public R info(@PathVariable("eId") String eId){
		EnterpriseEntity enterprise = enterpriseService.getById(eId);

        return R.ok().put("enterprise", enterprise);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("enterprise:save")
    public R save(@RequestBody EnterpriseEntity enterprise){
		enterpriseService.save(enterprise);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("enterprise:update")
    public R update(@RequestBody EnterpriseEntity enterprise){
		enterpriseService.updateById(enterprise);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("enterprise:delete")
    public R delete(@RequestBody String[] eIds){
		enterpriseService.removeByIds(Arrays.asList(eIds));

        return R.ok();
    }

}
