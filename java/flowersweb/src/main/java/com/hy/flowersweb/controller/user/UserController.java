package com.hy.flowersweb.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.annotation.UserLoginToken;
import com.hy.flowersweb.entity.User;
import com.hy.flowersweb.service.TokenService;
import com.hy.flowersweb.service.UserService;
import com.hy.flowersweb.utils.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * Create By hy on 2020/2/21.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    TokenService tokenService;

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
            jsonObject.put("msg","用户注册成功");
            jsonObject.put("data",user);
            return jsonObject;
        } catch (Exception e) {
            e.printStackTrace();
            jsonObject.put("msg","用户名已被占用");
            return jsonObject;
        }
    }

    @PostMapping("/login")
    public JSONObject uLogin(@RequestBody User user) {
        Md5 md5 = new Md5();
        String pass = user.getPassword();
        try {
            user.setPassword(md5.EncoderByMd5(pass));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = new JSONObject();
        if(user.getUsername() != null && user.getTelephone() == null) {
            User userlogin = userService.uLogin(user.getUsername(),user.getPassword());
            if (userlogin != null) {
                String token = tokenService.getToken(userlogin);
                jsonObject.put("code",200);
                jsonObject.put("msg","登录成功");
                jsonObject.put("token", token);
                jsonObject.put("data", userlogin);
                return jsonObject;
            } else {
                jsonObject.put("code",500);
                jsonObject.put("msg","用户名或密码错误");
                return jsonObject;
            }
        }
        if (user.getUsername() == null && user.getTelephone() != null) {
            User phonelogin = userService.pLogin(user.getTelephone(),user.getPassword());
            if (phonelogin != null) {
                String token = tokenService.getToken(phonelogin);
                jsonObject.put("code",200);
                jsonObject.put("msg","登录成功");
                jsonObject.put("token", token);
                jsonObject.put("data", phonelogin);
                return jsonObject;
            } else {
                jsonObject.put("code", 500);
                jsonObject.put("msg", "手机号或密码错误");
                return jsonObject;
            }
        }
        jsonObject.put("msg","参数错误");
        return jsonObject;
    }

    @UserLoginToken
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

}
