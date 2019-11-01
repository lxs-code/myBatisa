package com.zking.my.mapper;

import com.zking.my.model.SYSRole;

/**
 * 角色
 */
public interface SYSRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(SYSRole record);

    int insertSelective(SYSRole record);

    SYSRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(SYSRole record);

    int updateByPrimaryKey(SYSRole record);

}