package com.bingo.springmvc.entity;

import java.util.Date;

public class User {
    private String id;

    private String email;

    private String tel;

    private String password;

    private String username;

    private String usertype;

    private String status;

    private Date regtime;

    private String regip;

    public User(String id, String email, String tel, String password, String username, String usertype, String status, Date regtime, String regip) {
        this.id = id;
        this.email = email;
        this.tel = tel;
        this.password = password;
        this.username = username;
        this.usertype = usertype;
        this.status = status;
        this.regtime = regtime;
        this.regip = regip;
    }

    public User() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public String getRegip() {
        return regip;
    }

    public void setRegip(String regip) {
        this.regip = regip == null ? null : regip.trim();
    }
}