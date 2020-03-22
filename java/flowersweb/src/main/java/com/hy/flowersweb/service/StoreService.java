package com.hy.flowersweb.service;

import com.hy.flowersweb.entity.Store;

import java.util.List;

/**
 * Create By hy on 2020/2/20.
 */
public interface StoreService {
    int register(Store store) throws Exception;
    Store userLogin(String username,String password);
    Store phoneLogin(String phone,String password);
    int updateStore(Store store);
    int deleteStore(int id);
    List<Store> storeList();
    Store storeDetail(int id);
    List<Store> sDetail(String store_name);
//    List<Store> storesList(Store store);
}

