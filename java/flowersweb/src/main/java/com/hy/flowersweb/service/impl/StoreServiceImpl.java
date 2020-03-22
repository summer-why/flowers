package com.hy.flowersweb.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.dao.StoreMapper;
import com.hy.flowersweb.entity.Store;
import com.hy.flowersweb.entity.StoreExample;
import com.hy.flowersweb.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


/**
 * Create By hy on 2020/2/20.
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    private boolean isExistsUsername(String username) {
        StoreExample example = new StoreExample();
        example.createCriteria().andUsernameEqualTo(username);
        long count = storeMapper.countByExample(example);
        return count > 0 ? true : false;
    }

    @Override
    public List<Store> storeList() {
        StoreExample example = new StoreExample();
        List<Store> storeList = storeMapper.selectByExample(example);
        return storeList;
    }

    @Override
    public int register(Store store) throws Exception {
        if (isExistsUsername(store.getUsername())) {
            throw new Exception("用户名已被占用");
        }
        int count = storeMapper.insertSelective(store);
        return count > 0 ? 1 : 0 ;
    }

    @Override
    public Store userLogin(String username,String password) {
        StoreExample example = new StoreExample();
        example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<Store> list = storeMapper.selectByExample(example);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public Store phoneLogin(String phone,String password) {
        StoreExample example = new StoreExample();
        example.or().andPhoneEqualTo(phone).andPasswordEqualTo(password);
        List<Store> list = storeMapper.selectByExample(example);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public int updateStore(Store store) {
        StoreExample example = new StoreExample();
        example.createCriteria().andIdEqualTo(store.getId());
        return storeMapper.updateByExampleSelective(store,example);
    }

    @Override
    public int deleteStore(int id) {
        return storeMapper.deleteByPrimaryKey(id);
    }



    @Override
    public Store storeDetail(int id) {
        Store store = storeMapper.selectByPrimaryKey(id);
        return store;
    }

    @Override
    public List<Store> sDetail(String store_name) {
        StoreExample example = new StoreExample();
        example.createCriteria().andStore_nameEqualTo(store_name);
        return storeMapper.selectByExample(example);
    }

//    @Override
//    public List<Store> storesList(Store store) {
//        StoreExample example = new StoreExample();
//        example.createCriteria().andIdEqualTo(store.getId());
//        example.or().andUsernameEqualTo(store.getUsername());
//        example.or().andPhoneEqualTo(store.getPhone());
//        List<Store> storesList = storeMapper.selectByExample(example);
//        return storesList;
//    }
}


