package com.zking.my.model.shh;

import lombok.ToString;

@ToString
public class AppCusRole {
    private int apply_id;
    private Double Money;
    private int pro_periods;
    private String customer_name;
    private Integer customer_id;
    private  String role_name;
    private String customer_tel;
    private String applt_time;
    private String action;

    public int getApplyId() {
        return apply_id;
    }

    public void setApplyId(int applyId) {
        this.apply_id = applyId;
    }

    public String getcustomer_name() {
        return customer_name;
    }

    public void setcustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getrole_name() {
        return role_name;
    }

    public void setrole_name(String role_name) {
        this.role_name = role_name;
    }


    public int getpro_periods() {
        return pro_periods;
    }

    public void setpro_periods(int pro_periods) {
        this.pro_periods = pro_periods;
    }

    public Double getMoney() {
        return Money;
    }

    public void setMoney(Double Money) {
        this.Money = Money;
    }


    public String getcustomer_tel() {
        return customer_tel;
    }

    public void setcustomer_tel(String customer_tel) {
        this.customer_tel = customer_tel;
    }

    public String getapplt_time() {
        return applt_time;
    }

    public void setapplt_time(String applt_time) {
        this.applt_time = applt_time;
    }


    public Integer getcustomer_id() {
        return customer_id;
    }

    public void setcustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String  getaction() {
        return action;
    }

    public void setaction(String action) {
        this.action = action;
    }


    //    public AppCusRole(int apply_id,String customer_name,Double pro_momey, String role_name,String pro_name){
//        this.apply_id=apply_id;
//        this.customer_name=customer_name;
//        this.pro_momey=pro_momey;
//        this.role_name=role_name;
//        this.pro_name=pro_name;
//
//    }



}
