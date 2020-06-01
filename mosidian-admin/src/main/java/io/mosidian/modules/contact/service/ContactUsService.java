package io.mosidian.modules.contact.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.modules.contact.entity.ContactUsEntity;

import java.util.Map;

/**
 * 
 *
 * @author zsy
 * @email samphsanie@gmail.com
 * @date 2020-06-01 10:02:05
 */
public interface ContactUsService extends IService<ContactUsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

