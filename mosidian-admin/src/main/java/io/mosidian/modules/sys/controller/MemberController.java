package io.mosidian.modules.sys.controller;

import cn.hutool.http.HttpUtil;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.common.utils.R;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZSY
 * @createTime 2020/5/27 18:40
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){

        RestTemplate restTemplate = new RestTemplate();
        PageUtils page = restTemplate.getForObject("http://localhost:8083/member/list", PageUtils.class, params);

        return R.ok().put("page", page);
    }

}
