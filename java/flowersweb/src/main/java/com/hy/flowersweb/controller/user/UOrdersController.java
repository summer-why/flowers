package com.hy.flowersweb.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.annotation.UserLoginToken;
import com.hy.flowersweb.entity.Orders;
import com.hy.flowersweb.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Create By hy on 2020/2/27.
 */
@RestController
@RequestMapping("/user")
public class UOrdersController {
    @Autowired
    private OrdersService ordersService;

    @UserLoginToken
    @PostMapping("/uOrdersList")
    public JSONObject uOrdersList(@RequestBody Orders orders) {
        List<Orders> uOrdersList = ordersService.uOrdersList(orders);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户订单获取成功");
        json.put("data",uOrdersList);
        return json;
    }

    @UserLoginToken
    @PostMapping("/addOrders")
    public JSONObject addOrders(@RequestBody Orders orders) {
        orders.setCreate_time(new Date());
        ordersService.addOrders(orders);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户订单添加成功");
        return json;
    }

    @UserLoginToken
    @PostMapping("/updateOrders")
    public JSONObject updateOrders(@RequestBody Orders orders) {
        orders.setUpdate_time(new Date());
        ordersService.updateOrders(orders);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户订单更新成功");
        json.put("data",orders);
        return json;
    }

    @UserLoginToken
    @GetMapping("/delOrders/{order_number}")
    public JSONObject delOrders(@PathVariable("order_number") int order_number) {
        ordersService.delOrders(order_number);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户订单删除成功");
        return json;
    }

    @UserLoginToken
    @GetMapping("/ordersDetail/{order_number}")
    public JSONObject ordersDetail(@PathVariable("order_number") int order_number) {
        Orders ordersDetail = ordersService.ordersDetail(order_number);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","订单详情获取成功");
        json.put("data",ordersDetail);
        return json;
    }
}
