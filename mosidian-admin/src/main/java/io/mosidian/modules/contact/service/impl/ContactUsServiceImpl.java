package io.mosidian.modules.contact.service.impl;

import io.mosidian.modules.contact.dao.ContactUsDao;
import io.mosidian.modules.contact.entity.ContactUsEntity;
import io.mosidian.modules.contact.service.ContactUsService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.mosidian.common.utils.PageUtils;
import io.mosidian.common.utils.Query;


@Service("contactUsService")
public class ContactUsServiceImpl extends ServiceImpl<ContactUsDao, ContactUsEntity> implements ContactUsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ContactUsEntity> page = this.page(
                new Query<ContactUsEntity>().getPage(params),
                new QueryWrapper<ContactUsEntity>()
        );

        return new PageUtils(page);
    }

}