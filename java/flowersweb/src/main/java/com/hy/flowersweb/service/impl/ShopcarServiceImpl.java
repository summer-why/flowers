package com.hy.flowersweb.service.impl;

import com.hy.flowersweb.dao.ShopcarMapper;
import com.hy.flowersweb.entity.Shopcar;
import com.hy.flowersweb.entity.ShopcarExample;
import com.hy.flowersweb.service.ShopcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By hy on 2020/2/27.
 */
@Service
public class ShopcarServiceImpl implements ShopcarService {
    @Autowired
    private ShopcarMapper shopcarMapper;

    @Override
    public List<Shopcar> shopcarList() {
        ShopcarExample example = new ShopcarExample();
        List<Shopcar> shopcarList = shopcarMapper.selectByExample(example);
        return shopcarList;
    }

    @Override
    public List<Shopcar> uShopcarList(int user_id) {
        ShopcarExample example = new ShopcarExample();
        example.createCriteria().andUser_idEqualTo(user_id);
        List<Shopcar> uShopcarList = shopcarMapper.selectByExample(example);
        return uShopcarList;
    }

    @Override
    public int addShopcar(Shopcar shopcar) {
        return shopcarMapper.insertSelective(shopcar);
    }

    @Override
    public int updateShopcar(Shopcar shopcar) {
        ShopcarExample example = new ShopcarExample();
        example.or().andIdEqualTo(shopcar.getId());
        return shopcarMapper.updateByExampleSelective(shopcar,example);
    }

    @Override
    public int delShopcar(int id) {
        return shopcarMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Shopcar shopcarDetail(int id) {
        return shopcarMapper.selectByPrimaryKey(id);
    }
}
