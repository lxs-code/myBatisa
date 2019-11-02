package com.zking.my.controller;

import com.zking.my.model.Customer;
import com.zking.my.service.Borrowing.ICustomer;
import com.zking.my.shiro.PasswordHelper;
import com.zking.my.util.JsonData;
import com.zking.my.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 客户
 */
@Controller
public class CustomerContrillers {
    @Autowired
    private ICustomer customerMappers;


    @RequestMapping("/createCutome")
    @ResponseBody
    public JsonData createCutome(String cname, String passwerd, String tel) {
        String salt = PasswordHelper.createSalt();
        String credentials = PasswordHelper.createCredentials(passwerd, salt);
        Customer customer = new Customer();
        customer.setCustomerName(cname);
        customer.setCustomerPassword(credentials);
        customer.setCustomerSalt(salt);
        customer.setCustomerTel(tel);
        JsonData jsonData = new JsonData();
        int i = customerMappers.adduser(customer);
        if (i > 0) {
            jsonData.setCode(0);
            jsonData.setMessage("注册成功");
        } else {
            jsonData.setCode(1);
            jsonData.setMessage("注册失败");
        }
        return jsonData;
    }

    //
    @RequestMapping("/Cutomelogin")
    @ResponseBody
    public JsonData login(String username, String password1) {

        JsonData jsonData = new JsonData();
        Customer customer = new Customer();
        if (username.length() == 11) {
            customer.setCustomerTel(username);
        } else {
            customer.setCustomerName(username);
        }
        Customer longuser = customerMappers.longuser(customer);

        boolean b = PasswordHelper.checkCredentials(password1, longuser.getCustomerSalt(), longuser.getCustomerPassword());


        if (b) {
            jsonData.setResult(longuser);
            jsonData.setCode(0);
            jsonData.setMessage("登录成功");
        } else {
            jsonData.setCode(1);
            jsonData.setMessage("密码或用户名错误");
        }


        return jsonData;
    }

    //
    @RequestMapping("/Cutomelogintel")
    @ResponseBody
    public JsonData logintel(String tel) {

        JsonData jsonData = new JsonData();
        Customer customer = new Customer();
        customer.setCustomerTel(tel);
        Customer longuser = customerMappers.longuser(customer);
        if (null != longuser) {
            jsonData.setResult(longuser);
            jsonData.setCode(0);
            jsonData.setMessage("登录成功");
        } else {
            jsonData.setCode(1);
            jsonData.setMessage("密码或用户名错误");
        }


        return jsonData;
    }

    @RequestMapping("/list")
    @ResponseBody
    public JsonData list(Customer customer) {
        Customer customers = new Customer();
        JsonData jsonData = new JsonData();
        PageBean pageBean = new PageBean();
        pageBean.setPage(2);
        customers.setCustomerName("");
        List<Customer> list = customerMappers.list(customers, pageBean);

        jsonData.setResult(list);
        jsonData.setTotal(pageBean.getTotal());
        jsonData.setRows(pageBean.getRows());
        jsonData.setCode(0);
        jsonData.setMessage("登录成功");
        return jsonData;
    }

}
