package com.zking.my.service.Impls;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.my.mapper.CustomerMapper;
import com.zking.my.model.Customer;
import com.zking.my.service.Borrowing.ICustomer;
import com.zking.my.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ICustomerImpl implements ICustomer {


    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public int adduser(Customer user) {
        return customerMapper.insertSelective(user);
    }

    @Override
    public Customer longuser(Customer user) {
        Customer users = new Customer();
        if (user.getCustomerTel() == null || user.getCustomerTel().equals("")) {
            users = customerMapper.namegetCust(user);
        } else {
            users = customerMapper.telgetCust(user);
        }

        return users;
    }


    @Override
    public int uploadcu(Customer customer){


        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        Integer age =0;
        int sa = customer.getCustomerAge();
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        long days;
        long day;
        try{
            Date d2 = df.parse(sa+"");
            String sc =  df1.format(d2);//获取的年份

            String  d1 = df.format(new Date());
            Date d11 = df.parse(d1);

          long diff = d11.getTime() - d2.getTime();
          days = diff / (1000 * 60 * 60 * 24);
          day = days/365;
         age  = (int)day;

        }catch (Exception e){
            e.printStackTrace();
        }

        customer.setCustomerAge(age);
        //这样得到的差值是微秒级别
        return customerMapper.updateByPrimaryKeySelective(customer);
    }

    @Override
    public List<Customer> list(Customer user, PageBean pageBean) {

        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<Customer> list = customerMapper.list(user);

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }

    @Override
    public  List<Customer>getCustomer(Customer customer) {

        return customerMapper.yz(customer);
    }


    @Override
    public List<Customer> getCustomers(Customer customer) {
        return customerMapper.yz1(customer);
    }

    @Override
    public Customer getcustomer(Customer customer) {
        return customerMapper.selectByPrimaryKey(customer.getCustomerId());
    }
}
