package com.zking.my.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.my.mapper.CustomerMapper;
import com.zking.my.model.Customer;
import com.zking.my.service.ICust;
import com.zking.my.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustImpl implements ICust {



    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Customer load(Customer ds) {
        return null;
    }



    @Override
    public Customer loadCustomer(Customer customer) {
        return null;
    }

    @Override
    public long selectSex() {
        return customerMapper.selectSex();
    }
    @Override
    public long selectSex1() {
        return customerMapper.selectSex1();
    }
    @Override
    public long selectAge1(){
        return customerMapper.selectAge1();
    }
    @Override
    public long selectAge2(){
        return customerMapper.selectAge2();
    }
    @Override
    public long selectAge3(){
        return customerMapper.selectAge3();
    }
    @Override
    public long selectAge4(){
        return customerMapper.selectAge4();
    }



    @Override
    public List<Customer> list2(Customer user, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<Customer> list = customerMapper.list2(user);

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }

    @Override
    public List<Customer> list1(Customer user, PageBean pageBean) {
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<Customer> list = customerMapper.list1(user);

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }


    @Override
    public int updateCust(Customer cust) {
        return customerMapper.updeteMode(cust);
    }
}

