package com.hy.flowersweb.controller.store;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.annotation.StoreLoginToken;
import com.hy.flowersweb.entity.Store;
import com.hy.flowersweb.service.StoreService;
import com.hy.flowersweb.service.TokenService;
import com.hy.flowersweb.utils.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * Create By hy on 2020/2/25.
 */
@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreService storeServices;

    @Autowired
    TokenService tokenService;

    @PostMapping("/storeRegister")
    public JSONObject storeRegister(@RequestBody Store store) {
        Md5 md5 = new Md5();
        String pass = store.getPassword();
        try {
            store.setPassword(md5.EncoderByMd5(pass));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        store.setCreate_time(new Date());
        JSONObject jsonObject = new JSONObject();
        try {
            storeServices.register(store);
            jsonObject.put("code",200);
            jsonObject.put("msg","店铺注册成功");
            jsonObject.put("data",store);
            return jsonObject;
        } catch (Exception e) {
            e.printStackTrace();
            jsonObject.put("msg","商家名称已被占用");
            return jsonObject;
        }
    }

    @PostMapping("/storeLogin")
    public JSONObject login(@RequestBody Store store) {
        Md5 md5 = new Md5();
        String pass = store.getPassword();
        try {
            store.setPassword(md5.EncoderByMd5(pass));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        JSONObject jsonObject = new JSONObject();
        if(store.getUsername() != null && store.getPhone() == null) {
            Store userlogin = storeServices.userLogin(store.getUsername(),store.getPassword());
            if (userlogin != null) {
                String token = tokenService.getStoreToken(userlogin);
                jsonObject.put("code",200);
                jsonObject.put("msg","登录成功");
                jsonObject.put("token", token);
                jsonObject.put("data",userlogin);
                return jsonObject;
            } else {
                jsonObject.put("code",500);
                jsonObject.put("msg","商家名称或密码错误");
                return jsonObject;
            }
        }
        if (store.getUsername() == null && store.getPhone() != null) {
            Store phonelogin = storeServices.phoneLogin(store.getPhone(),store.getPassword());
            if (phonelogin != null) {
                String token = tokenService.getStoreToken(phonelogin);
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

    @StoreLoginToken
    @PostMapping("/updateStore")
    public JSONObject updateStore (@RequestBody Store store) {
        Md5 md5 = new Md5();
        String pass = store.getPassword();
        try {
            store.setPassword(md5.EncoderByMd5(pass));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        store.setUpdate_time(new Date());
        storeServices.updateStore(store);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","店铺信息修改成功");
        json.put("data",store);
        return json;
    }

    @StoreLoginToken
    @GetMapping("/delStore/{id}")
    public JSONObject delStore (@PathVariable("id") int id) {
        storeServices.deleteStore(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","店铺注销成功");
        return json;
    }

    @StoreLoginToken
    @GetMapping("/storeDetail/{id}")
    public JSONObject storeDetail(@PathVariable("id") int id) {
        Store detail = storeServices.storeDetail(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","店铺详情获取成功");
        json.put("data",detail);
        return json;
    }
}
