package com.hy.flowersweb.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By hy on 2020/2/20.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/111")
    public JSONObject test1() {
        JSONObject json = new JSONObject();
        json.put("msg","ok");
        json.put("status",0);
        return json;
    }
}

