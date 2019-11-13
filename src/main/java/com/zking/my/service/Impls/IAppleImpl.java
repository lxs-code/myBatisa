package com.zking.my.service.Impls;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.my.mapper.ApplyMapper;
import com.zking.my.mapper.CustomerMapper;
import com.zking.my.mapper.SYSUserMapper;
import com.zking.my.model.Apply;
import com.zking.my.model.Customer;
import com.zking.my.model.SYSUser;
import com.zking.my.model.Ua;
import com.zking.my.service.Borrowing.IApple;
import com.zking.my.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class IAppleImpl implements IApple {

    @Autowired
    private ApplyMapper applyMapper;
    @Autowired
    private SYSUserMapper sysUser;
    @Autowired
    private CustomerMapper Customers;

    @Override
    public int createApply(Apply apply) {
        int i = applyMapper.insertSelective(apply);
        Customer customer1 = Customers.selectByPrimaryKey(apply.getCustomerId());


        Float money = apply.getMoney();
        BigDecimal b = new BigDecimal(String.valueOf(money));
        double d = b.doubleValue();
        double c=customer1.getCustmoerTotalMoney();
        BigDecimal b1 = new BigDecimal(Double.toString(d));
        BigDecimal b2 = new BigDecimal(Double.toString(customer1.getCustmoerTotalMoney()));
        BigDecimal b3 = new BigDecimal(Double.toString(customer1.getCustmoerConsumptionMoney()));

        customer1.setCustmoerTotalMoney(b2.subtract(b1).doubleValue());
        customer1.setCustmoerConsumptionMoney(b1.add(b3).doubleValue());
            Customers.updateByPrimaryKeySelective(customer1);



        return i;
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

    @Override
    public Apply getApply(Long appid) {
        return applyMapper.selectByPrimaryKey(appid);
    }
    @Override
    public int createAPPLY(Apply apply) {
        return applyMapper.insertSelective(apply);
    }

    @Override
    public List<Apply> fj(Apply apply,PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<Apply> list = applyMapper.fj(apply);

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }
}
