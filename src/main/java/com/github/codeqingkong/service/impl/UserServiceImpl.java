package com.github.codeqingkong.service.impl;

import com.github.codeqingkong.mapper.UserMapper;
import com.github.codeqingkong.model.User;
import com.github.codeqingkong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qingkong
 * @date 2021/12/7
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean insertUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(Integer userId) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean getOneUser(Integer userId) {
        return false;
    }

    @Override
    public User getOneUserByUsername(String username) {
        return userMapper.getOneUserByUsername(username);
    }
}
