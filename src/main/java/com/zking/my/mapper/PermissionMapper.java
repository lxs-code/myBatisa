package com.zking.my.mapper;

import com.zking.my.model.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Long permissionId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Long permissionId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}