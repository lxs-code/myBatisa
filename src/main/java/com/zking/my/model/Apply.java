package com.zking.my.model;

import java.util.Date;

public class Apply {
    private Long applyId;

    private Long customerId;

    private Long productId;

    private Long adminId;

    private Date appltTime;

    private String approveTime;

    private Integer minId;

    private String interest;

    private Float perMoney;

    public Apply(Long applyId, Long customerId, Long productId, Long adminId, Date appltTime, String approveTime, Integer minId, String interest, Float perMoney) {
        this.applyId = applyId;
        this.customerId = customerId;
        this.productId = productId;
        this.adminId = adminId;
        this.appltTime = appltTime;
        this.approveTime = approveTime;
        this.minId = minId;
        this.interest = interest;
        this.perMoney = perMoney;
    }

    public Apply() {
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
}