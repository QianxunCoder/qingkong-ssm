package com.github.codeqingkong.mapper;

import com.github.codeqingkong.model.Role;

/**
 * @author qingkong
 * @date 2021/12/15
 */
public interface RoleMapper {
    int insertRole(Role role);
    int deleteRole(Integer roleId);
    int updateRole(Role role);
    Role getOneRoleById(Integer roleId);
}
