package com.zking.my.model;

import java.util.Date;

public class Ledger {
    private Long ledgerId;

    private Long customerId;

    private Long adminId;

    private Long applyId;

    private Date startTime;

    private Date endTime;

    private Date deferTime;

    private Date endReturntime;

    private Float applyMoney;

    private String ledgerInterest;

    public Ledger(Long ledgerId, Long customerId, Long adminId, Long applyId, Date startTime, Date endTime, Date deferTime, Date endReturntime, Float applyMoney, String ledgerInterest) {
        this.ledgerId = ledgerId;
        this.customerId = customerId;
        this.adminId = adminId;
        this.applyId = applyId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.deferTime = deferTime;
        this.endReturntime = endReturntime;
        this.applyMoney = applyMoney;
        this.ledgerInterest = ledgerInterest;
    }

    public Ledger() {
        super();
    }

    public Long getLedgerId() {
        return ledgerId;
    }

    public void setLedgerId(Long ledgerId) {
        this.ledgerId = ledgerId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getDeferTime() {
        return deferTime;
    }

    public void setDeferTime(Date deferTime) {
        this.deferTime = deferTime;
    }

    public Date getEndReturntime() {
        return endReturntime;
    }

    public void setEndReturntime(Date endReturntime) {
        this.endReturntime = endReturntime;
    }

    public Float getApplyMoney() {
        return applyMoney;
    }

    public void setApplyMoney(Float applyMoney) {
        this.applyMoney = applyMoney;
    }

    public String getLedgerInterest() {
        return ledgerInterest;
    }

    public void setLedgerInterest(String ledgerInterest) {
        this.ledgerInterest = ledgerInterest;
    }
}