package com.hy.flowersweb.controller.store;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.flowersweb.annotation.StoreLoginToken;
import com.hy.flowersweb.entity.Flowers;
import com.hy.flowersweb.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Create By hy on 2020/2/25.
 */
@RestController
@RequestMapping("/store")
public class SFlowerController {

    @Autowired
    private FlowerService flowerService;

    @StoreLoginToken
    @GetMapping("/flowerListByStore")
    public JSONObject sFlowersList(@RequestParam("store_id") int store_id,
                                   @RequestParam("pageNum") int pageNum,
                                   @RequestParam("pageSize") int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Flowers> sFlowersList = flowerService.sFlowerList(store_id);
        PageInfo<Flowers> pageInfo = new PageInfo<>(sFlowersList);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","店铺鲜花列表查询成功");
        json.put("data",pageInfo);
        return json;
    }

    @StoreLoginToken
    @GetMapping("/flowerDetail/{id}")
    public JSONObject flowerDetail(@PathVariable("id") int id) {
        Flowers flower = flowerService.flowerDetail(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","鲜花详情查询成功");
        json.put("data",flower);
        return json;
    }

    @StoreLoginToken
    @PostMapping("/addFlower")
    public JSONObject addFlower(@RequestBody Flowers flowers) {
        flowers.setCreate_time(new Date());
        flowerService.addFlower(flowers);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","鲜花添加成功");
        json.put("data",flowers);
        return json;
    }

    @StoreLoginToken
    @PostMapping("/updateFlower")
    public JSONObject updateFlower(@RequestBody Flowers flowers) {
        flowers.setUpdate_time(new Date());
        flowerService.updateFlower(flowers);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","鲜花信息修改成功");
        json.put("data",flowers);
        return json;
    }

    @StoreLoginToken
    @GetMapping("/delFlower/{id}")
    public JSONObject delFlower(@PathVariable("id") int id) {
        flowerService.delFlower(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","鲜花删除成功");
        return json;
    }
}
