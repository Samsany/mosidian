package io.mosidian.modules.web.controller;

import io.mosidian.common.utils.R;
import io.mosidian.modules.member.service.MemberService;
import io.mosidian.modules.member.vo.MemberVo;
import io.mosidian.modules.sys.entity.SysUserEntity;
import io.mosidian.modules.sys.service.SysCaptchaService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @Author ZSY
 * @createTime 2020/5/30 14:41
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class ApiController {

    @Resource
    private MemberService memberService;

    @Resource
    private SysCaptchaService sysCaptchaService;

    @PostMapping(value = "/member/save")
    @ResponseBody
    public R memberSave(@RequestParam(value = "uuid") String uuid,
                        @RequestParam(value = "code") String code,
                        @RequestParam(value = "username") String username,
                        @RequestParam(value = "nickname") String nickname,
                        @RequestParam(value = "mobile") String mobile,
                        @RequestParam(value = "domicile") String domicile,
                        @RequestParam(value = "card") String card) {

        log.info("=========================>" + uuid);

        boolean validate = sysCaptchaService.validate(uuid, code);
        if (!validate) {
            return R.error("验证码错误");
        }

        MemberVo member = new MemberVo(username, mobile, nickname, card, domicile);
        SysUserEntity user = new SysUserEntity();
        user.setPassword("2020");
        //sha256加密
        String salt = RandomStringUtils.randomAlphanumeric(20);
        user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
        user.setSalt(salt);

        return memberService.saveMemberVo(member, user);

    }

    /**
     * 验证码
     */
    @GetMapping("/captcha")
    public void captcha(HttpServletResponse response, String uuid) throws IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");

        //获取图片验证码
        BufferedImage image = sysCaptchaService.getCaptcha(uuid);

        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        IOUtils.closeQuietly(out);
    }

}
