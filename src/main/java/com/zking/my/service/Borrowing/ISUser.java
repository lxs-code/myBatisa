package com.zking.my.service.Borrowing;

import com.zking.my.model.SYSNode;
import com.zking.my.model.SYSRole;
import com.zking.my.model.SYSUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISUser {





    String doLogin(SYSUser user);//用户登陆




    SYSUser loadByUsername(SYSUser user);//根据用户名查询用户






    SYSRole listPermissionsByUserName(SYSUser user);//查询指定用户拥有的权限
    List<SYSNode> listRolesByUserName(SYSUser user);//查询指定用户拥有的角色
}
