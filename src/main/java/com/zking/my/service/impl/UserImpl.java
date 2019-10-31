package com.zking.my.service.impl;

import com.zking.my.mapper.BookMapper;
import com.zking.my.mapper.UserMapper;
import com.zking.my.model.User;
import com.zking.my.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("User")
public class UserImpl implements IUser {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int doRegister(User user) {
        return userMapper.insert(user);
    }

    @Override
    public String doLogin(User user) {
        return null;
    }

    @Override
    public int updatePassword(User user) {
        return 0;
    }

    @Override
    public int doResetPassword(User user) {
        return 0;
    }

    @Override
    public User loadByUsername(User user) {
        return null;
    }

    @Override
    public Set<String> listPermissionsByUserName(User user) {
        return userMapper.listPermissionsByUserName(user);
    }

    @Override
    public Set<String> listRolesByUserName(User user) {
        return userMapper.listRolesByUserName(user);
    }
}
