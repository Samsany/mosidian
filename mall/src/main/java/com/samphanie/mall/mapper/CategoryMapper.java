package com.samphanie.mall.mapper;

import com.samphanie.mall.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Component
public interface CategoryMapper extends BaseMapper<Category> {

    List<Category> selectAll();

}
