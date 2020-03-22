package com.hy.flowersweb.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.entity.Flowers;
import com.hy.flowersweb.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Create By hy on 2020/2/25.
 */
@RestController
@RequestMapping("/user")
public class UFlowerController {

    @Autowired
    private FlowerService flowerService;

    @GetMapping("/flowerList")
    public JSONObject flowersList() {
        List<Flowers> flowers = flowerService.flowersList();
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","鲜花列表查询成功");
        json.put("data",flowers);
        return json;
    }

    @GetMapping("/flowerListByStore")
    public JSONObject sFlowersList(@RequestParam("store_id") int store_id) {
        List<Flowers> sFlowersList = flowerService.sFlowerList(store_id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","店铺鲜花列表查询成功");
        json.put("data",sFlowersList);
        return json;
    }

    @GetMapping("/listByCategory")
    public JSONObject listByCategory(@RequestParam("category_id") int category_id) {
        List<Flowers> listByCategory = flowerService.listByCategory(category_id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","分类鲜花列表查询成功");
        json.put("data",listByCategory);
        return json;
    }

    @GetMapping("/flowerDetail/{id}")
    public JSONObject flowerDetail(@PathVariable("id") int id) {
        Flowers flower = flowerService.flowerDetail(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","鲜花详情查询成功");
        json.put("data",flower);
        return json;
    }
}
