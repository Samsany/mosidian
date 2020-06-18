package io.mosidian.modules.web.controller;

import io.mosidian.common.utils.R;
import io.mosidian.modules.contact.entity.ContactUsEntity;
import io.mosidian.modules.contact.service.ContactUsService;
import io.mosidian.modules.enterprise.service.EnterpriseService;
import io.mosidian.modules.enterprise.vo.EnterpriseVo;
import io.mosidian.modules.logistics.service.LogisticsService;
import io.mosidian.modules.logistics.vo.LogisticsVo;
import io.mosidian.modules.member.service.MemberService;
import io.mosidian.modules.member.vo.MemberVo;
import io.mosidian.modules.sys.entity.SysUserEntity;
import io.mosidian.modules.sys.service.SysCaptchaService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

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
    private LogisticsService logisticsService;

    @Resource
    private ContactUsService contactUsService;

    @RequestMapping("/upload")
    public R upload(@RequestParam("file") MultipartFile uploadFile, HttpServletRequest req){

        String os = System.getProperty("os.name");
        //  如果是Windows系统
        if (os.toLowerCase().startsWith("win")) {
            //实际地址
            File folder=new File("E://upload");
            if (!folder.isDirectory()){
                folder.mkdirs();
            }
            String oldName=uploadFile.getOriginalFilename();
            String newName= UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."),oldName.length());
            try {
                uploadFile.transferTo(new File(folder,newName));
                String filePath=req.getScheme()+"://"+req.getServerName()+
                        ":"+req.getServerPort()+"/mosidian/upload/"+newName;

                return R.ok().put("imgUrl",filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return R.error("上传失败");
        } else {
            //实际地址
            File folder=new File("/data/www/upload/images/");
            if (!folder.isDirectory()){
                folder.mkdirs();
            }
            String oldName=uploadFile.getOriginalFilename();
            String newName= UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."),oldName.length());
            try {
                uploadFile.transferTo(new File(folder,newName));
                String filePath=req.getScheme()+"://"+req.getServerName()+
                        ":"+req.getServerPort()+"/mosidian/upload/images/"+newName;

                return R.ok().put("imgUrl",filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return R.error("上传失败");
        }
    }

    @PostMapping(value = "/contact/us")
    @ResponseBody
    public Object contactUpdate(@RequestParam(name = "ticket") String ticket,
                                @RequestParam(name = "randstr") String randstr,
                                @RequestParam(name = "clients", required = false) String clients,
                                @RequestParam(name = "name", required = false) String name,
                                @RequestParam(name = "email", required = false) String email,
                                @RequestParam(name = "phone", required = false) String phone,
                                @RequestParam(name = "feedbackMessage", required = false) String feedbackMessage) {

        if (ticket != null && randstr != null) {
            ContactUsEntity contactUs = new ContactUsEntity();
            contactUs.setCreatedate(new Date());
            contactUs.setName(name);
            contactUs.setClients(Integer.parseInt(clients));
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
                       @RequestParam(value = "enlicenseId") String enlicenseId,
                       @RequestParam(value = "avatar") String avatar,
                       @RequestParam(value = "enlicense") String enlicense) {
        SysUserEntity user = new SysUserEntity();
        user.setFlag(3);
        user.setPassword("2020");
        //sha256加密
        String salt = RandomStringUtils.randomAlphanumeric(20);
        user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
        user.setSalt(salt);
        LogisticsVo logisticsVo = new LogisticsVo(
                username, website, scale, corporation, reason, eserver, companies, name, headName, sector, eposition, headCard, emobile, eemail,enlicenseId,avatar,enlicense
        );
        logisticsVo.setSynopsis("物流服务");
        return logisticsService.saveLogisticsVo(logisticsVo, user);
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
                       @RequestParam(value = "enlicenseId") String enlicenseId,
                       @RequestParam(value = "avatar") String avatar,
                       @RequestParam(value = "enlicense") String enlicense) {
        SysUserEntity user = new SysUserEntity();
        user.setFlag(4);
        user.setPassword("2020");
        //sha256加密
        String salt = RandomStringUtils.randomAlphanumeric(20);
        user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
        user.setSalt(salt);
        EnterpriseVo enterpriseVo = new EnterpriseVo(username, website, scale, corporation, reason, eserver, companies, name, headName, sector, eposition, headCard, emobile, eemail,enlicenseId,avatar,enlicense);
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
