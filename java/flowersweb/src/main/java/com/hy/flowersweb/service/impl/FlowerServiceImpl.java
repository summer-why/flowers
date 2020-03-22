package com.hy.flowersweb.service.impl;

import com.hy.flowersweb.dao.FlowersMapper;
import com.hy.flowersweb.entity.Flowers;
import com.hy.flowersweb.entity.FlowersExample;
import com.hy.flowersweb.service.FlowerService;
import com.sun.org.apache.xpath.internal.CachedXPathAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By hy on 2020/2/25.
 */
@Service
public class FlowerServiceImpl implements FlowerService {

    @Autowired
    private FlowersMapper flowersMapper;

    @Override
    public List<Flowers> flowersList() {
        FlowersExample example = new FlowersExample();
        List<Flowers> flowersList = flowersMapper.selectByExample(example);
        return flowersList;
    }

    @Override
    public int addFlower(Flowers flowers) {
        return flowersMapper.insertSelective(flowers);
    }

    @Override
    public int updateFlower(Flowers flowers) {
        FlowersExample example = new FlowersExample();
        example.createCriteria().andIdEqualTo(flowers.getId());
        return flowersMapper.updateByExampleSelective(flowers,example);
    }

    @Override
    public int delFlower(int id) {
        int del = flowersMapper.deleteByPrimaryKey(id);
        return del;
    }

    @Override
    public Flowers flowerDetail(int id) {
        Flowers detail = flowersMapper.selectByPrimaryKey(id);
        return detail;
    }

    @Override
    public List<Flowers> sFlowerList(int store_id) {
        FlowersExample example = new FlowersExample();
        example.createCriteria().andStore_idEqualTo(store_id);
        List<Flowers> sFlowersList = flowersMapper.selectByExample(example);
        return sFlowersList;
    }

    @Override
    public List<Flowers> flowerListByName(String flower_name) {
        FlowersExample example = new FlowersExample();
        example.createCriteria().andFlower_nameEqualTo(flower_name);
        List<Flowers> flowerListByName = flowersMapper.selectByExample(example);
        return  flowerListByName;
    }

    @Override
    public List<Flowers> listByCategory(int category_id) {
        FlowersExample example = new FlowersExample();
        example.or().andCategory_idEqualTo(category_id);
        List<Flowers> listByCategory = flowersMapper.selectByExample(example);
        return listByCategory;
    }

}
