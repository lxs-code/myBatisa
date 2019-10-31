package com.zking.my.service.Impls;

import com.zking.my.mapper.SYSNodeMapper;
import com.zking.my.mapper.SYSUserMapper;
import com.zking.my.model.SYSNode;
import com.zking.my.model.SYSUser;
import com.zking.my.service.Borrowing.ISNode;
import com.zking.my.service.Borrowing.ISUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
@Service
public class ISUserImpl implements ISUser {
    @Autowired
    private SYSUserMapper sysuser;
    @Autowired
    private ISNode sysNodeMapper;

    @Override
    public String doLogin(SYSUser user) {
        return null;
    }

    @Override
    public SYSUser loadByUsername(SYSUser user) {
        return sysuser.GetUSER(user);
    }

    @Override
    public Set<String> listPermissionsByUserName(SYSUser user) {
        return sysuser.listPermissionsByUserName(user);
    }

    @Override
    public List<SYSNode> listRolesByUserName(SYSUser user) {

        List<SYSNode> sysNodes = sysuser.listRolesByUserName(user);
        for ( SYSNode ss :sysNodes) {
          List<SYSNode>  ssa= sysNodeMapper.getnode(ss.getTreeNodeId());



          ss.setNodes(ssa);
        }


        return sysNodes;
    }
}
