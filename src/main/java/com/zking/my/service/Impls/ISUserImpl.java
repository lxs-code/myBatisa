package com.zking.my.service.Impls;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.my.mapper.SYSUserMapper;
import com.zking.my.model.SYSNode;
import com.zking.my.model.SYSRole;
import com.zking.my.model.SYSUser;
import com.zking.my.service.Borrowing.ISNode;
import com.zking.my.service.Borrowing.ISUser;
import com.zking.my.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ISUser")
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
    public SYSRole listPermissionsByUserName(SYSUser user) {
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

    @Override
    public List<SYSUser> list(SYSUser user, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<SYSUser> list = sysuser.list(user);

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }

    @Override
    public List<SYSUser> getall(SYSUser user) {
        return null;
    }


    @Override
    public int up(SYSUser user) {
        return sysuser.updateByPrimaryKeySelective(user);
    }

}
