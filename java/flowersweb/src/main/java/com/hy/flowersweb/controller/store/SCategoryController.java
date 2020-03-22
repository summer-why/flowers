package com.hy.flowersweb.controller.store;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.annotation.StoreLoginToken;
import com.hy.flowersweb.entity.Category;
import com.hy.flowersweb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Create By hy on 2020/2/26.
 */
@RestController
@RequestMapping("/store")
public class SCategoryController {

    @Autowired
    private CategoryService categoryService;

    @StoreLoginToken
    @GetMapping("/categoryList")
    public JSONObject categoryList() {
        List<Category> categoryList = categoryService.categoryList();
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","分类列表获取成功");
        json.put("data",categoryList);
        return json;
    }

    @StoreLoginToken
    @GetMapping("/categoryDetail/{id}")
    public JSONObject categoryDetail(@PathVariable("id") int id) {
        Category categoryDetail = categoryService.categoryDetail(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","分类详情获取成功");
        json.put("data",categoryDetail);
        return json;
    }

    @StoreLoginToken
    @PostMapping("/addCategory")
    public JSONObject addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","类别添加成功");
        json.put("data",category);
        return json;
    }

}
