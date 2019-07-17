package com.zjj.service.impl;

import com.zjj.mapper.UserMapper;
import com.zjj.model.User;
import com.zjj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: znsh
 * @description: UserService实现类
 * @author: zjj
 * @create: 2019-07-18 00:08:36
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User login(String username, String password) {
        User user = userMapper.login(username, password);
        return user;
    }
}
