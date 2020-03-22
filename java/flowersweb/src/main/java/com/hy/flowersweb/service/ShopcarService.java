package com.hy.flowersweb.service;

import com.hy.flowersweb.entity.Shopcar;

import java.util.List;

/**
 * Create By hy on 2020/2/25.
 */
public interface ShopcarService {
    List<Shopcar> shopcarList();
    List<Shopcar> uShopcarList(int user_id);
    int addShopcar(Shopcar shopcar);
    int updateShopcar(Shopcar shopcar);
    int delShopcar(int id);
    Shopcar shopcarDetail(int id);

}
