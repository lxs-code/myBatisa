package com.zking.my.mapper;

import com.zking.my.model.SYSNode;
import com.zking.my.model.SYSUser;

import java.util.List;
import java.util.Set;

/**
 * 管理员
 */
public interface SYSUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(SYSUser record);

    int insertSelective(SYSUser record);

    SYSUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(SYSUser record);

    int updateByPrimaryKey(SYSUser record);


    SYSUser GetUSER(SYSUser sysUser);




     Set<String> listPermissionsByUserName(SYSUser user);


    List<SYSNode> listRolesByUserName(SYSUser user);






}