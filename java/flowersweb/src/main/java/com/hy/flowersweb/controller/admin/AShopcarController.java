package com.hy.flowersweb.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.entity.Shopcar;
import com.hy.flowersweb.service.ShopcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create By hy on 2020/2/27.
 */
@RestController
@RequestMapping("/admin")
public class AShopcarController {
    @Autowired
    private ShopcarService shopcarService;

    @GetMapping("/shopcarList")
    public JSONObject shopcarList() {
        List<Shopcar> shopcarList = shopcarService.shopcarList();
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","购物车列表获取成功");
        json.put("data",shopcarList);
        return json;
    }
}
