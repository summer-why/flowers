package com.hy.flowersweb.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.flowersweb.entity.User;
import com.hy.flowersweb.service.UserService;
import com.hy.flowersweb.utils.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

/**
 * Create By hy on 2020/2/25.
 */
@RestController
@RequestMapping("/admin")
public class AUserController {
    @Autowired
    private UserService userService;

    @GetMapping("/userList")
    public JSONObject userList(@RequestParam int pageNum,@RequestParam int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> userList = userService.userList();
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户信息列表获取成功");
        json.put("data",pageInfo);
        return json;
    }

    @GetMapping("/userListByUsername")
    public JSONObject userListByUsername (@RequestParam String username,
                                          @RequestParam int pageNum,
                                          @RequestParam int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> userListByUsername = userService.uDetail(username);
        PageInfo<User> pageInfoByUsername = new PageInfo<>(userListByUsername);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户信息列表获取成功");
        json.put("data",pageInfoByUsername);
        return json;
    }

    @PostMapping("/register")
    public JSONObject uRegister(@RequestBody User user) {
        Md5 md5 = new Md5();
        String pass = user.getPassword();
        try {
            user.setPassword(md5.EncoderByMd5(pass));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        user.setCreate_time(new Date());
        JSONObject jsonObject = new JSONObject();
        try {
            userService.uRegister(user);
            jsonObject.put("code",200);
            jsonObject.put("msg","用户添加成功");
            jsonObject.put("data",user);
            return jsonObject;
        } catch (Exception e) {
            e.printStackTrace();
            jsonObject.put("msg","用户名已被占用");
            return jsonObject;
        }
    }

    @PostMapping("/updateUser")
    public JSONObject updateUser (@RequestBody User user) {
        Md5 md5 = new Md5();
        String pass = user.getPassword();
        try {
            user.setPassword(md5.EncoderByMd5(pass));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        user.setUpdate_time(new Date());
        userService.updateUser(user);

        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","个人信息修改成功");
        json.put("data",user);
        return json;
    }

    @GetMapping("/delUser/{id}")
    public JSONObject delUser (@PathVariable("id") int id) {
        userService.deleteUser(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户删除成功");
        return json;
    }

    @GetMapping("/userDetail/{id}")
    public JSONObject userDetail(@PathVariable("id") int id) {
        User detail = userService.userDetail(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户详情获取成功");
        json.put("data",detail);
        return json;
    }
}
