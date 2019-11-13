package com.zking.my.model.shh;

import lombok.ToString;

@ToString
public class AppCusRoles {


private   Integer  apply_id;

private   double  money;
private  Integer  action;
private  Integer  customer_id;
private  String   customer_name;
private  String username;
private   Integer  product_id;
private String   customer_tel;
private   String  applt_time;


private  String   customer_zname;


    public String getCustomer_zname() {
        return customer_zname;
    }

    public void setCustomer_zname(String customer_zname) {
        this.customer_zname = customer_zname;
    }

    public Integer getApply_id() {
        return apply_id;
    }

    public void setApply_id(Integer apply_id) {
        this.apply_id = apply_id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getCustomer_tel() {
        return customer_tel;
    }

    public void setCustomer_tel(String customer_tel) {
        this.customer_tel = customer_tel;
    }

    public String getApplt_time() {
        return applt_time;
    }

    public void setApplt_time(String applt_time) {
        this.applt_time = applt_time;
    }

    public AppCusRoles() {
    }

}
