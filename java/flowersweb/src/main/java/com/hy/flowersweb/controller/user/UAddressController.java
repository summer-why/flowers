package com.hy.flowersweb.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.annotation.UserLoginToken;
import com.hy.flowersweb.entity.Address;
import com.hy.flowersweb.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Create By hy on 2020/2/26.
 */
@RestController
@RequestMapping("/user")
public class UAddressController {
    @Autowired
    private AddressService addressService;

    @UserLoginToken
    @GetMapping("/uAddressList")
    public JSONObject uAddressList(@RequestParam("user_id") int user_id) {
        List<Address> uAddressList = addressService.uAddressList(user_id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户收货地址列表获取成功");
        json.put("data",uAddressList);
        return json;
    }

    @UserLoginToken
    @GetMapping("/addressDetail/{id}")
    public JSONObject addressDetail(@PathVariable("id") int id) {
        Address addressDetail = addressService.addressDetail(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","收货地址详情获取成功");
        json.put("data",addressDetail);
        return json;
    }

    @UserLoginToken
    @PostMapping("/addAddress")
    public JSONObject addAddress(@RequestBody Address address) {
        addressService.addAddress(address);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","收货地址添加成功");
        return json;
    }

    @UserLoginToken
    @PostMapping("/updateAddress")
    public JSONObject updateAddress(@RequestBody Address address) {
        addressService.updateAddress(address);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","收货地址修改成功");
        json.put("data",address);
        return json;
    }

    @UserLoginToken
    @GetMapping("/delAddress/{id}")
    public JSONObject delAddress(@PathVariable("id") int id) {
        addressService.delAddress(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","收货地址删除成功");
        return json;
    }
}
