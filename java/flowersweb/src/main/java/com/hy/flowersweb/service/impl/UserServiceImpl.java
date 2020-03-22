package com.hy.flowersweb.service.impl;

import com.hy.flowersweb.dao.UserMapper;
import com.hy.flowersweb.entity.User;
import com.hy.flowersweb.entity.UserExample;
import com.hy.flowersweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By hy on 2020/2/21.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    private boolean isExistsUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        long count = userMapper.countByExample(example);
        return count > 0 ? true : false;
    }

    @Override
    public int uRegister(User user) throws Exception {
        if (isExistsUsername(user.getUsername())) {
            throw new Exception("用户名已被占用");
        }
        int count = userMapper.insertSelective(user);
        return count > 0 ? 1 : 0 ;
    }

    @Override
    public User uLogin(String username,String password) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<User> list = userMapper.selectByExample(example);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public User pLogin(String telephone,String password) {
        UserExample example = new UserExample();
        example.or().andTelephoneEqualTo(telephone).andPasswordEqualTo(password);
        List<User> list = userMapper.selectByExample(example);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public int updateUser(User user) {
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(user.getId());
        return userMapper.updateByExampleSelective(user,example);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<User> userList() {
        UserExample example = new UserExample();
        List<User> userList = userMapper.selectByExample(example);
        return userList;
    }

    @Override
    public User userDetail(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public List<User> uDetail(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        return userMapper.selectByExample(example);
    }

}
