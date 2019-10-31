package com.zking.my.model;

import lombok.ToString;

import java.util.Date;
@ToString
public class SYSUser {
    private Long userId;

    private String username;

    private String password;

    private String salt;

    private Integer locked;

    private Date createDatetime;

    public SYSUser(Long userId, String username, String password, String salt, Integer locked, Date createDatetime) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.locked = locked;
        this.createDatetime = createDatetime;
    }

    public SYSUser() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }
}