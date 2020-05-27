package io.mosidian.modules.sys.controller;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author ZSY
 * @createTime 2020/5/27 18:40
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){

        return  restTemplate.getForObject("http://localhost:8083/member/list", R.class, params);
    }

}
