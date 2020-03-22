package com.hy.flowersweb.service.impl;

import com.hy.flowersweb.dao.AddressMapper;
import com.hy.flowersweb.entity.Address;
import com.hy.flowersweb.entity.AddressExample;
import com.hy.flowersweb.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By hy on 2020/2/26.
 */
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> addressList() {
        AddressExample example = new AddressExample();
        List<Address> addressList = addressMapper.selectByExample(example);
        return addressList;
    }

    @Override
    public List<Address> uAddressList(int user_id) {
        AddressExample example = new AddressExample();
        example.createCriteria().andUser_idEqualTo(user_id);
        List<Address> uAddressList = addressMapper.selectByExample(example);
        return uAddressList;
    }

    @Override
    public List<Address> addressListByUsername(String user_name) {
        AddressExample example = new AddressExample();
        example.createCriteria().andUser_nameEqualTo(user_name);
        List<Address> addressListByUsername = addressMapper.selectByExample(example);
        return addressListByUsername;
    }

    @Override
    public Address addressDetail(int id) {
        return addressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addAddress(Address address) {
        return addressMapper.insertSelective(address);
    }

    @Override
    public int updateAddress(Address address) {
        AddressExample example = new AddressExample();
        example.or().andIdEqualTo(address.getId());
        return addressMapper.updateByExampleSelective(address,example);
    }

    @Override
    public int delAddress(int id) {
        return addressMapper.deleteByPrimaryKey(id);
    }
}
