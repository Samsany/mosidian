package com.samphanie.mall.mapper;

import com.samphanie.mall.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Component
public interface UserMapper extends BaseMapper<User> {

    /**
     * 按用户名查找
     * @param username
     * @return
     */
    User selectByUsername(String username);

}
