package com.hy.flowersweb.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.entity.Category;
import com.hy.flowersweb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create By hy on 2020/2/26.
 */
@RestController
@RequestMapping("/user")
public class UCategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categoryList")
    public JSONObject categoryList() {
        List<Category> categoryList = categoryService.categoryList();
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","分类列表获取成功");
        json.put("data",categoryList);
        return json;
    }

}
