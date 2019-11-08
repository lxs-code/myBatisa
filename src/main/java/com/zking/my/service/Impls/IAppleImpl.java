package com.zking.my.service.Impls;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.my.mapper.ApplyMapper;
import com.zking.my.mapper.SYSUserMapper;
import com.zking.my.model.Apply;
import com.zking.my.model.SYSUser;
import com.zking.my.model.Ua;
import com.zking.my.service.Borrowing.IApple;
import com.zking.my.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IAppleImpl implements IApple {

    @Autowired
    private ApplyMapper applyMapper;
    @Autowired
    private SYSUserMapper sysUser;

    @Override
    public int createApply(Apply apply) {
        return applyMapper.insertSelective(apply);
    }

    @Override
    public int shApply(Apply apply) {
        return applyMapper.updateByPrimaryKeySelective(apply);
    }

    @Override
    public List<Apply> getApply(Apply appl, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<Apply> list = applyMapper.getapply(appl);

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }

    @Override
    public List<Ua> getcoun() {
        List<Ua> us = new ArrayList<Ua>();
        List<SYSUser> getcountname = sysUser.getcountname(1l);
        for (SYSUser ds : getcountname) {

            Ua ua = new Ua();
            int a = Integer.parseInt(ds.getUserId() + "");
            int getcount = applyMapper.getcount(a);
            ua.setCount(getcount);
            ua.setSysUser(ds);
            us.add(ua);
        }
        return us;
    }


    @Override
    public int upapply(Apply apply) {
        return applyMapper.updateByPrimaryKeySelective(apply);
    }

    @Override
    public List<Apply> getapplymin(Apply apply, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<Apply> list = applyMapper.getapplymin(apply);

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }
}
