package com.hy.flowersweb.service;

import com.hy.flowersweb.entity.Flowers;

import java.util.List;

/**
 * Create By hy on 2020/2/25.
 */
public interface FlowerService {
    List<Flowers> flowersList();
    int addFlower(Flowers flowers);
    int updateFlower(Flowers flowers);
    int delFlower(int id);
    Flowers flowerDetail(int id);
    List<Flowers> sFlowerList(int store_id);
    List<Flowers> flowerListByName(String flower_name);
    List<Flowers> listByCategory(int category_id);
}
