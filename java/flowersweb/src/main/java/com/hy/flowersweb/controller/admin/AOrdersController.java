package com.hy.flowersweb.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.entity.Orders;
import com.hy.flowersweb.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Create By hy on 2020/2/28.
 */
@RestController
@RequestMapping("/admin")
public class AOrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/ordersList")
    public JSONObject ordersList() {
        List<Orders> ordersList = ordersService.ordersList();
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","订单列表获取成功");
        json.put("data",ordersList);
        return json;
    }

    @PostMapping("/uOrdersList")
    public JSONObject uOrdersList(@RequestBody Orders orders) {
        List<Orders> uOrdersList = ordersService.uOrdersList(orders);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户订单获取成功");
        json.put("data",uOrdersList);
        return json;
    }

}
