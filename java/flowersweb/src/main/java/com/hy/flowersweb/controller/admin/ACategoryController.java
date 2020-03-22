package com.hy.flowersweb.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.flowersweb.entity.Category;
import com.hy.flowersweb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Create By hy on 2020/2/26.
 */
@RestController
@RequestMapping("/admin")
public class ACategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categoryList")
    public JSONObject categoryList(@RequestParam int pageNum,@RequestParam int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Category> categoryList = categoryService.categoryList();
        PageInfo<Category> pageInfo = new PageInfo<>(categoryList);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","分类列表获取成功");
        json.put("data",pageInfo);
        return json;
    }

    @GetMapping("/categoryDetail/{id}")
    public JSONObject categoryDetail(@PathVariable("id") int id) {
        Category categoryDetail = categoryService.categoryDetail(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","分类详情获取成功");
        json.put("data",categoryDetail);
        return json;
    }

    @PostMapping("/addCategory")
    public JSONObject addCategory(@RequestBody Category category) {
        category.setCreate_time(new Date());
        categoryService.addCategory(category);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","类别添加成功");
        json.put("data",category);
        return json;
    }

    @PostMapping("/updateCategory")
    public JSONObject updateCategory(@RequestBody Category category) {
        category.setUpdate_time(new Date());
        categoryService.updateCategory(category);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","类别修改成功");
        json.put("data",category);
        return json;
    }

    @GetMapping("/delCategory/{id}")
    public JSONObject delCategory(@PathVariable("id") int id) {
        categoryService.delCategory(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","类别删除成功");
        return json;
    }
}
