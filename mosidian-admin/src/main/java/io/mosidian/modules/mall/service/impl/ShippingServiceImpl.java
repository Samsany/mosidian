package io.mosidian.modules.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.mosidian.modules.mall.entity.Shipping;
import io.mosidian.modules.mall.enums.ResponseEnum;
import io.mosidian.modules.mall.exception.MallException;
import io.mosidian.modules.mall.form.ShippingForm;
import io.mosidian.modules.mall.mapper.ShippingMapper;
import io.mosidian.modules.mall.service.IShippingService;
import io.mosidian.modules.mall.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Service
public class ShippingServiceImpl extends ServiceImpl<ShippingMapper, Shipping> implements IShippingService {

    @Resource
    private ShippingMapper shippingMapper;

    /**
     * 添加收货地址
     *
     * @param uid
     * @param form
     */
    @Override
    public ResponseVo<Map<String, Integer>> add(Integer uid, ShippingForm form) {
        Shipping shipping = new Shipping();
        BeanUtils.copyProperties(form, shipping);
        shipping.setUserId(uid);
        int insertResult = shippingMapper.insert(shipping);
        if (insertResult == 0) {
            throw new MallException(ResponseEnum.ERROR);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("shippingId", shipping.getId());

        return ResponseVo.successByData(map);
    }

    /**
     * 删除收货地址
     *
     * @param uid
     * @param shippingId
     */
    @Override
    public ResponseVo<Map<String, Integer>> delete(Integer uid, Integer shippingId) {
        QueryWrapper<Shipping> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", shippingId);
        queryWrapper.eq("user_id", uid);
        int deleteResult = shippingMapper.delete(queryWrapper);
        if (deleteResult == 0) {
            throw new MallException(ResponseEnum.DELETE_SHIPPING_FAIL);
        }
        return ResponseVo.success();
    }

    /**
     * 更新收货地址
     *  @param uid
     * @param shippingId
     * @param form
     * @return
     */
    @Override
    public ResponseVo<Map<String, Integer>> update(Integer uid, Integer shippingId, ShippingForm form) {

        Shipping shipping = new Shipping();
        BeanUtils.copyProperties(form, shipping);
        shipping.setUserId(uid);
        shipping.setId(shippingId);
        int updateResult = shippingMapper.updateById(shipping);
        if (updateResult == 0) {
            throw new MallException(ResponseEnum.UPDATE_SHIPPING_FAIL);
        }
        return ResponseVo.success();
    }

    /**
     * 收货地址列表
     *
     * @param uid
     * @param pageNum
     * @param pageSize
     */
    @Override
    public ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum, pageSize);

        QueryWrapper<Shipping> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", uid);
        List<Shipping> shippingList = shippingMapper.selectList(queryWrapper);

        PageInfo pageInfo = new PageInfo<>(shippingList);

        return ResponseVo.successByData(pageInfo);
    }
}
