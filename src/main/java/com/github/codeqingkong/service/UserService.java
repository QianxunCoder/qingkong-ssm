package com.github.codeqingkong.service;

import com.github.codeqingkong.model.User;

/**
 * @author qingkong
 * @date 2021/12/7
 */
public interface UserService {
    /**
     * 新增用户
     * @param user
     * @return
     */
    boolean insertUser(User user);

    /**
     * 根据 userId 删除一个用户
     * @param userId
     * @return
     */
    boolean deleteUser(Integer userId);

    /**
     * 修改用户
     * @param user
     * @return
     */
    boolean updateUser(User user);

    /**
     * 根据 userId 查询用户
     * @param userId
     * @return
     */
    boolean getOneUser(Integer userId);

    /**
     * 根据 username 获取 user
     * @param username
     * @return
     */
    User getOneUserByUsername(String username);

}
