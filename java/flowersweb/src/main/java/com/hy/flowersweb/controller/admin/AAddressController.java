package com.hy.flowersweb.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.flowersweb.entity.Address;
import com.hy.flowersweb.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Create By hy on 2020/2/26.
 */
@RestController
@RequestMapping("/admin")
public class AAddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/addressList")
    public JSONObject addressList(@RequestParam("pageNum") int pageNum,
                                  @RequestParam("pageSize") int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Address> addressList = addressService.addressList();
        PageInfo<Address> pageInfo = new PageInfo<>(addressList);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","收货地址列表获取成功");
        json.put("data",pageInfo);
        return json;
    }

    @GetMapping("/uAddressList")
    public JSONObject uAddressList(@RequestParam("user_id") int user_id,@RequestParam("pageNum") int pageNum,
                                   @RequestParam("pageSize") int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Address> uAddressList = addressService.uAddressList(user_id);
        PageInfo<Address> pageInfo = new PageInfo<>(uAddressList);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户收货地址列表获取成功");
        json.put("data",pageInfo);
        return json;
    }

    @GetMapping("/addressListByUsername")
    public JSONObject addressListByUsername(@RequestParam("user_name") String user_name,@RequestParam("pageNum") int pageNum,
                                   @RequestParam("pageSize") int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Address> addressListByUsername = addressService.addressListByUsername(user_name);
        PageInfo<Address> pageInfo = new PageInfo<>(addressListByUsername);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户收货地址列表搜索成功");
        json.put("data",pageInfo);
        return json;
    }

    @GetMapping("/addressDetail/{id}")
    public JSONObject addressDetail(@PathVariable("id") int id) {
        Address addressDetail = addressService.addressDetail(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","收货地址详情获取成功");
        json.put("data",addressDetail);
        return json;
    }

    @PostMapping("/addAddress")
    public JSONObject addAddress(@RequestBody Address address) {
        addressService.addAddress(address);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","收货地址添加成功");
        return json;
    }

    @PostMapping("/updateAddress")
    public JSONObject updateAddress(@RequestBody Address address) {
        addressService.updateAddress(address);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","收货地址修改成功");
        json.put("data",address);
        return json;
    }

    @GetMapping("/delAddress/{id}")
    public JSONObject delAddress(@PathVariable("id") int id) {
        addressService.delAddress(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","收货地址删除成功");
        return json;
    }
}
