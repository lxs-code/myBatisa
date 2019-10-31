package com.zking.my.model;

import java.util.Date;

public class Repayment {
    private Long repaymentId;

    private Long customerId;

    private Long applyId;

    private Date repaymentTime;

    private Float repaymentMoney;

    private Float residueMoney;

    private Long adminId;

    public Repayment(Long repaymentId, Long customerId, Long applyId, Date repaymentTime, Float repaymentMoney, Float residueMoney, Long adminId) {
        this.repaymentId = repaymentId;
        this.customerId = customerId;
        this.applyId = applyId;
        this.repaymentTime = repaymentTime;
        this.repaymentMoney = repaymentMoney;
        this.residueMoney = residueMoney;
        this.adminId = adminId;
    }

    public Repayment() {
        super();
    }

    public Long getRepaymentId() {
        return repaymentId;
    }

    public void setRepaymentId(Long repaymentId) {
        this.repaymentId = repaymentId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public Date getRepaymentTime() {
        return repaymentTime;
    }

    public void setRepaymentTime(Date repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    public Float getRepaymentMoney() {
        return repaymentMoney;
    }

    public void setRepaymentMoney(Float repaymentMoney) {
        this.repaymentMoney = repaymentMoney;
    }

    public Float getResidueMoney() {
        return residueMoney;
    }

    public void setResidueMoney(Float residueMoney) {
        this.residueMoney = residueMoney;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }
}