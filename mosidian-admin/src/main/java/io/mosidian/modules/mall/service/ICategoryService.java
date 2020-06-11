package io.mosidian.modules.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.mosidian.modules.mall.entity.Category;
import io.mosidian.modules.mall.vo.CategoryVo;
import io.mosidian.modules.mall.vo.ResponseVo;

import java.util.List;
import java.util.Set;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
public interface ICategoryService extends IService<Category> {

    /***
     * @Description: selectAll 查找所有商品类目
     * @return: com.samphanie.mall.vo.ResponseVo<java.util.List<com.samphanie.mall.vo.CategoryVo>>
     * @date: 2020/3/29 9:59
     **/
    ResponseVo<List<CategoryVo>> selectAll();

    void findSubCategoryId(Integer id, Set<Integer> resultSet);

}
