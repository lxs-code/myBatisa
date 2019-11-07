package com.zking.my.model;

import java.util.Date;

public class Applys {
    private Long applyId;

    private Long customerId;

    private Long productId;

    private Long adminId;

    private Date appltTime;

    private String approveTime;

    private Integer minId;

    private String interest;

    private Float perMoney;

    private Float totalMoney;

    private Float money;

    private Integer action;

    public Applys(Long applyId, Long customerId, Long productId, Long adminId, Date appltTime, String approveTime, Integer minId, String interest, Float perMoney, Float totalMoney, Float money, Integer action) {
        this.applyId = applyId;
        this.customerId = customerId;
        this.productId = productId;
        this.adminId = adminId;
        this.appltTime = appltTime;
        this.approveTime = approveTime;
        this.minId = minId;
        this.interest = interest;
        this.perMoney = perMoney;
        this.totalMoney = totalMoney;
        this.money = money;
        this.action = action;
    }

    public Applys() {
        super();
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Date getAppltTime() {
        return appltTime;
    }

    public void setAppltTime(Date appltTime) {
        this.appltTime = appltTime;
    }

    public String getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(String approveTime) {
        this.approveTime = approveTime;
    }

    public Integer getMinId() {
        return minId;
    }

    public void setMinId(Integer minId) {
        this.minId = minId;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public Float getPerMoney() {
        return perMoney;
    }

    public void setPerMoney(Float perMoney) {
        this.perMoney = perMoney;
    }

    public Float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Float totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }
}