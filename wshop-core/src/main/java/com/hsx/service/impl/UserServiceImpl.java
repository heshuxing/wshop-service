package com.hsx.service.impl;

import com.hsx.mapper.UserMapper;
import com.hsx.pojo.User;
import com.hsx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author shuxing.he
 * @date 2022/2/12
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User queryUserByName(String username) {
        return userMapper.queryUserByName(username);
    }
}
