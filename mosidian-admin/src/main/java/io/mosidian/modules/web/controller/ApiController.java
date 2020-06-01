package io.mosidian.modules.web.controller;

import io.mosidian.common.utils.R;
import io.mosidian.modules.contact.entity.ContactUsEntity;
import io.mosidian.modules.contact.service.ContactUsService;
import io.mosidian.modules.enterprise.service.EnterpriseService;
import io.mosidian.modules.enterprise.vo.EnterpriseVo;
import io.mosidian.modules.member.service.MemberService;
import io.mosidian.modules.member.vo.MemberVo;
import io.mosidian.modules.sys.entity.SysUserEntity;
import io.mosidian.modules.sys.service.SysCaptchaService;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
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
import java.util.Date;

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

    @Resource
    private EnterpriseService enterpriseService;

    @Resource
    private ContactUsService contactUsService;

    @PostMapping(value = "/contact/us")
    @ResponseBody
    public Object contactUpdate(@RequestParam(name = "ticket") String ticket,
                                @RequestParam(name = "randstr") String randstr,
                                @RequestParam(name = "name", required = false) String name,
                                @RequestParam(name = "email", required = false) String email,
                                @RequestParam(name = "phone", required = false) String phone,
                                @RequestParam(name = "feedbackMessage", required = false) String feedbackMessage) {

        if (ticket != null && randstr != null) {
            ContactUsEntity contactUs = new ContactUsEntity();
            contactUs.setCreatedate(new Date());
            contactUs.setName(name);
            contactUs.setEmail(email);
            contactUs.setPhone(phone);
            contactUs.setFeedbackMessage(feedbackMessage);
            boolean save = contactUsService.save(contactUs);
            if (save) {
                return R.ok("反馈成功");
            } else {
                return R.error("反馈失败！");
            }

        } else {
            return R.error("反馈失败！");
        }
    }

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
     * 保存
     */
    @RequestMapping("/wuliu/save")
    @ResponseBody
    public R saveWuliu(@RequestParam(value = "uuid") String uuid,
                       @RequestParam(value = "username") String username,
                       @RequestParam(value = "name") String name,
                       @RequestParam(value = "website") String website,
                       @RequestParam(value = "scale") String scale,
                       @RequestParam(value = "corporation") String corporation,
                       @RequestParam(value = "reason") String reason,
                       @RequestParam(value = "eserver") String eserver,
                       @RequestParam(value = "companies") String companies,
                       @RequestParam(value = "headName") String headName,
                       @RequestParam(value = "sector") String sector,
                       @RequestParam(value = "eposition") String eposition,
                       @RequestParam(value = "headCard") String headCard,
                       @RequestParam(value = "emobile") String emobile,
                       @RequestParam(value = "eemail") String eemail,
                       @RequestParam(value = "enlicenseId") String enlicenseId) {
        SysUserEntity user = new SysUserEntity();
        user.setFlag(3);
        user.setPassword("2020");
        //sha256加密
        String salt = RandomStringUtils.randomAlphanumeric(20);
        user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
        user.setSalt(salt);
        EnterpriseVo enterpriseVo = new EnterpriseVo(username, website, scale, corporation, reason, eserver, companies, name, headName, sector, eposition, headCard, emobile, eemail,enlicenseId);
        enterpriseVo.setSynopsis("物流服务");
        return enterpriseService.saveEnterpriseVo(enterpriseVo, user);
    }


    /**
     * 保存
     */
    @RequestMapping("/qiye/save")
    @ResponseBody
    public R saveQiye(@RequestParam(value = "uuid") String uuid,
                       @RequestParam(value = "username") String username,
                       @RequestParam(value = "name") String name,
                       @RequestParam(value = "website") String website,
                       @RequestParam(value = "scale") String scale,
                       @RequestParam(value = "corporation") String corporation,
                       @RequestParam(value = "reason") String reason,
                       @RequestParam(value = "eserver") String eserver,
                       @RequestParam(value = "companies") String companies,
                       @RequestParam(value = "headName") String headName,
                       @RequestParam(value = "sector") String sector,
                       @RequestParam(value = "eposition") String eposition,
                       @RequestParam(value = "headCard") String headCard,
                       @RequestParam(value = "emobile") String emobile,
                       @RequestParam(value = "eemail") String eemail,
                       @RequestParam(value = "enlicenseId") String enlicenseId) {
        SysUserEntity user = new SysUserEntity();
        user.setFlag(4);
        user.setPassword("2020");
        //sha256加密
        String salt = RandomStringUtils.randomAlphanumeric(20);
        user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
        user.setSalt(salt);
        EnterpriseVo enterpriseVo = new EnterpriseVo(username, website, scale, corporation, reason, eserver, companies, name, headName, sector, eposition, headCard, emobile, eemail,enlicenseId);
        enterpriseVo.setSynopsis("企业服务");
        return enterpriseService.saveEnterpriseVo(enterpriseVo, user);
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
