package com.hy.flowersweb.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.annotation.UserLoginToken;
import com.hy.flowersweb.entity.Shopcar;
import com.hy.flowersweb.service.ShopcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Create By hy on 2020/2/27.
 */
@RestController
@RequestMapping("/user")
public class UShopcarController {
    @Autowired
    private ShopcarService shopcarService;

    @UserLoginToken
    @GetMapping("/uShopcarList/{user_id}")
    public JSONObject uShopcarList(@PathVariable("user_id") int user_id) {
        List<Shopcar> uShopcarList = shopcarService.uShopcarList(user_id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户购物车列表获取成功");
        json.put("data",uShopcarList);
        return json;
    }

    @UserLoginToken
    @PostMapping("/addShopcar")
    public JSONObject addShopcar(@RequestBody Shopcar shopcar) {
        shopcar.setCreate_time(new Date());
//        shopcar.setSum_price(shopcar.getPrice() * shopcar.getCount());
        shopcarService.addShopcar(shopcar);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","添加购物车成功");
        return json;
    }

    @UserLoginToken
    @PostMapping("/updateShopcar")
    public JSONObject updateShopcar(@RequestBody Shopcar shopcar) {
        shopcarService.updateShopcar(shopcar);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","购物车修改成功");
        json.put("data",shopcar);
        return json;
    }

    @UserLoginToken
    @GetMapping("/delShopcar/{id}")
    public JSONObject delShopcar(@PathVariable("id") int id) {
        shopcarService.delShopcar(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","商品移除成功");
        return json;
    }

    @UserLoginToken
    @GetMapping("/shopcarDetail/{id}")
    public JSONObject shopcarDetail(@PathVariable("id") int id) {
        Shopcar shopcarDetail = shopcarService.shopcarDetail(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","购物车详情获取成功");
        json.put("data",shopcarDetail);
        return json;
    }
}
