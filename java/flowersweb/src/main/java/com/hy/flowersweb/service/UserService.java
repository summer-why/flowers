package com.hy.flowersweb.service;

import com.hy.flowersweb.entity.User;

import java.util.List;

/**
 * Create By hy on 2020/2/21.
 */
public interface UserService {
    int uRegister(User user) throws Exception;
    User uLogin(String username,String password);
    User pLogin(String telephone,String password);
    int updateUser(User user);
    int deleteUser(int id);
    List<User> userList();
    User userDetail(int id);
    List<User> uDetail(String username);
}
