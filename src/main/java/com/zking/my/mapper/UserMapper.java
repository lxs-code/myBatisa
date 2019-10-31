package com.zking.my.mapper;

import com.zking.my.model.User;

import java.util.Set;

public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    //查询指定用户的角色
Set<String>  listRolesByUserName(User user);


Set<String> listPermissionsByUserName(User user);
}