package com.hy.flowersweb.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.entity.Store;
import com.hy.flowersweb.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create By hy on 2020/2/25.
 */
@RestController
@RequestMapping("/user")
public class UStoreController {

    @Autowired
    private StoreService storeServices;

    @GetMapping("/storeList")
    public JSONObject storeList() {
        List<Store> storeList = storeServices.storeList();
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","店铺列表获取成功");
        json.put("data",storeList);
        return json;
    }

    @GetMapping("/storeDetail/{id}")
    public JSONObject storeDetail(@PathVariable("id") int id) {
        Store detail = storeServices.storeDetail(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","店铺详情获取成功");
        json.put("data",detail);
        return json;
    }
}
