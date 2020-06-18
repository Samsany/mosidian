package io.mosidian.modules.logistics.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.mosidian.common.utils.R;
import io.mosidian.modules.logistics.entity.LogisticsEntity;
import io.mosidian.modules.logistics.service.LogisticsService;
import io.mosidian.modules.logistics.vo.LogisticsVo;
import io.mosidian.modules.sys.controller.AbstractController;
import io.mosidian.modules.sys.entity.SysUserEntity;
import io.mosidian.modules.sys.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


/**
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-06-04 15:36:46
 */
@RestController
@RequestMapping("/logistics")
@Slf4j
public class LogisticsController extends AbstractController {
    @Autowired
    private LogisticsService logisticsService;

    @Autowired
    private SysUserService sysUserService;

//    @RequestMapping("/list")
//    @RequiresPermissions("logistics:logistics:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = logisticsService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("logistics:list")
    public R list(@RequestParam(value = "page", defaultValue = "1") Integer pageNum,
                  @RequestParam(value = "limit", defaultValue = "10") Integer pageSize,
                  @RequestParam(value = "key", required = false) String key,
                  @RequestParam(value = "value", required = false) String value,
                  @RequestParam(value = "flag") Integer flag) {

        PageHelper.startPage(pageNum, pageSize);
        List<LogisticsVo> logisticsVos = logisticsService.queryPageVo(flag, key, value);
        PageInfo<LogisticsVo> page = new PageInfo<>(logisticsVos);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @GetMapping("/info")
    @RequiresPermissions("logistics:info")
    public R info() {

        SysUserEntity user = getUser();
        LogisticsVo logistics = logisticsService.getLogisticsById(String.valueOf(user.getUserId()));

        return R.ok().put("logistics", logistics);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("logistics:save")
    public R saveWuliu(@RequestBody LogisticsVo logisticsVo) {
        SysUserEntity user = new SysUserEntity();
        user.setFlag(3);
        user.setPassword("2020");
        //sha256加密
        String salt = RandomStringUtils.randomAlphanumeric(20);
        user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
        user.setSalt(salt);
        return logisticsService.saveLogisticsVo(logisticsVo, user);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("logistics:info")
    public R info(@PathVariable("id") String enId){
        LogisticsVo logistics = logisticsService.getLogisticsById(enId);

        return R.ok().put("logistics", logistics);
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("logistics:update")
    public R update(@RequestBody LogisticsEntity logistics) {
        logisticsService.updateById(logistics);

        return R.ok();
    }

    @Transactional
    @RequestMapping("/delete")
    @RequiresPermissions("logistics:delete")
    public R delete(@RequestBody String[] ids) {

        boolean b = sysUserService.removeByIds(Arrays.asList(ids));

        int result = logisticsService.removeByUserIds(Arrays.asList(ids));

        if (b && result != 0) {
            return R.ok();
        } else {
            return R.error("删除失败");
        }

    }

}
