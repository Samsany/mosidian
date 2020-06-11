package io.mosidian.modules.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mosidian.modules.mall.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

    List<Category> selectAll();

}
