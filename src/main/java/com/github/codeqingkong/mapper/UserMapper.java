package com.github.codeqingkong.mapper;

import com.github.codeqingkong.model.User;

/**
 * @author qingkong
 * @date 2021/12/8
 */
public interface UserMapper {
    int insertUser(User user);
    int deleteUser(Integer userId);
    int updateUser(User user);
    User getOneUserById(Integer userId);

    User getOneUserByUsername(String username);
}
