package com.mosidian.web.service.impl;

import com.mosidian.web.common.security.CommonResult;
import com.mosidian.web.service.IUploadService;
import org.springframework.stereotype.Service;

/**
 * @Author ZSY
 * @createTime 2020/6/7 13:45
 */
@Service
public class UploadServiceImpl implements IUploadService {


    @Override
    public CommonResult uploadImg() {



        return CommonResult.success(null);
    }
}
