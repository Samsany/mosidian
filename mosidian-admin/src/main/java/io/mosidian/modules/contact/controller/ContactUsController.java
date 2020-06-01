package io.mosidian.modules.contact.controller;

import java.util.Arrays;
import java.util.Map;

import io.mosidian.modules.contact.entity.ContactUsEntity;
import io.mosidian.modules.contact.service.ContactUsService;
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
 * @date 2020-06-01 10:02:05
 */
@RestController
@RequestMapping("/contact")
public class ContactUsController {
    @Autowired
    private ContactUsService contactUsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("contact:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = contactUsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("contact:info")
    public R info(@PathVariable("id") Integer id){
		ContactUsEntity contactUs = contactUsService.getById(id);

        return R.ok().put("contactUs", contactUs);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("contact:save")
    public R save(@RequestBody ContactUsEntity contactUs){
		contactUsService.save(contactUs);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("contact:update")
    public R update(@RequestBody ContactUsEntity contactUs){
		contactUsService.updateById(contactUs);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("contact:delete")
    public R delete(@RequestBody Integer[] ids){
		contactUsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
