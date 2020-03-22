package com.hy.flowersweb.service;

import com.hy.flowersweb.entity.Address;

import java.util.List;

/**
 * Create By hy on 2020/2/25.
 */
public interface AddressService {
    List<Address> addressList();
    List<Address> uAddressList(int user_id);
    List<Address> addressListByUsername(String user_name);
    Address addressDetail(int id);
    int addAddress(Address address);
    int updateAddress(Address address);
    int delAddress(int id);
}
