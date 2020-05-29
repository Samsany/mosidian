package io.mosidian.modules.enterprise.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.mosidian.modules.enterprise.entity.EnterpriseEntity;
import io.mosidian.modules.enterprise.service.EnterpriseService;
import io.mosidian.modules.enterprise.vo.EnterpriseVo;
import io.mosidian.modules.member.vo.MemberVo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.common.utils.R;



/**
 * 
 *
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-05-29 15:58:45
 */
@RestController
@RequestMapping("enterprise/enterprise")
public class EnterpriseController {
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
