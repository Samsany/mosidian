package io.mosidian.modules.mall.controller;

import io.mosidian.modules.mall.form.CartAddForm;
import io.mosidian.modules.mall.form.CartUpdateForm;
import io.mosidian.modules.mall.service.ICartService;
import io.mosidian.modules.mall.vo.CartVo;
import io.mosidian.modules.mall.vo.ResponseVo;
import io.mosidian.modules.sys.controller.AbstractController;
import io.mosidian.modules.sys.entity.SysUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @Classname CartController
 * @Date 2020/3/30 16:38
 * @Author ZSY
 */
@RestController
@RequestMapping("/mall")
public class CartController extends AbstractController {

    @Autowired
    private ICartService cartService;

    @GetMapping("/carts")
    public ResponseVo<CartVo> list(){

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());

        return cartService.list(userId);
    }

    @PostMapping("/carts")
    public ResponseVo<CartVo> add(@Valid @RequestBody CartAddForm cartAddForm,
                                  HttpSession session){

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());

        return cartService.add(userId, cartAddForm);
    }

    @PutMapping("/carts/{productId}")
    public ResponseVo<CartVo> update(@PathVariable Integer productId,
                                     @Valid @RequestBody CartUpdateForm form,
                                     HttpSession session){

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());

        return cartService.update(userId, productId, form);
    }

    @DeleteMapping("/carts/{productId}")
    public ResponseVo<CartVo> delete(@PathVariable Integer productId,
                                     HttpSession session){

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());

        return cartService.delete(userId, productId);
    }

    @PutMapping("/carts/selectAll")
    public ResponseVo<CartVo> selectAll(HttpSession session){

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());

        return cartService.selectAll(userId);
    }

    @PutMapping("/carts/unSelectAll")
    public ResponseVo<CartVo> unSelectAll(HttpSession session){

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());

        return cartService.unSelectAll(userId);
    }

    @GetMapping("/carts/products/sum")
    public ResponseVo<Integer> sum(HttpSession session){

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());

        return cartService.sum(userId);
    }


}
