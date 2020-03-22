package com.hy.flowersweb.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hy.flowersweb.entity.Store;
import com.hy.flowersweb.service.StoreService;
import com.hy.flowersweb.utils.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;

/**
 * Create By hy on 2020/2/20.
 */
//@CrossOrigin(allowCredentials = "true", allowedHeaders = "*", origins = "*")
@RestController
@RequestMapping("/admin")
public class AStoreController {
    @Autowired
    private StoreService storeServices;

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/storeList")
    public JSONObject storeList(@RequestParam("pageNum") int pageNum,@RequestParam("pageSize") int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Store> storeList = storeServices.storeList();
        PageInfo<Store> pageInfo = new PageInfo<>(storeList);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","店铺列表获取成功");
        json.put("data",pageInfo);
        return json;
    }

//    @PostMapping("/selectStoreList")
//    public JSONObject selectStoreList(@RequestBody Store store) {
//        List<Store> selectStoreList = storeServices.storesList(store);
//        JSONObject json = new JSONObject();
//        json.put("code",200);
//        json.put("msg","店铺列表查询成功");
//        json.put("data",selectStoreList);
//        return json;
//    }

    @GetMapping("/storeDetail/{id}")
    public JSONObject storeDetail(@PathVariable("id") int id) {
        Store detail = storeServices.storeDetail(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","店铺详情获取成功");
        json.put("data",detail);
        return json;
    }

    @GetMapping("/storeListByStoreName")
    public JSONObject storeListByStoreName(@RequestParam("store_name") String store_name,
                                           @RequestParam("pageNum") int pageNum,
                                           @RequestParam("pageSize") int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Store> storeListByStoreName = storeServices.sDetail(store_name);
        PageInfo<Store> pageInfoByStoreName = new PageInfo<>(storeListByStoreName);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","店铺列表获取成功");
        json.put("data",pageInfoByStoreName);
        return json;
    }

    @GetMapping("/delStore/{id}")
    public JSONObject delStore (@PathVariable("id") int id) {
        storeServices.deleteStore(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","店铺注销成功");
        return json;
    }



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
                jsonObject.put("code",200);
                jsonObject.put("msg","登录成功");
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
                jsonObject.put("code", 200);
                jsonObject.put("msg", "登录成功");
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

    @PostMapping("/updateStore")
    public JSONObject updateStore (@RequestBody Store store) {
        Md5 md5 = new Md5();
        if(store.getPassword() != null || store.getPassword() != "") {
            String pass = store.getPassword();
            try {
                store.setPassword(md5.EncoderByMd5(pass));
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        store.setUpdate_time(new Date());
        storeServices.updateStore(store);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","店铺信息修改成功");
        json.put("data",store);
        return json;
    }

}
