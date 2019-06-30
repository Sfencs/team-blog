package com.thefifth.bean;

import org.joda.time.DateTime;

public class UserInfo {

    private int id;
    private String nickname;
    private String password_hash;
    private String telphone;
    private boolean sex;
    private String createtime;
    private String email;
    private String gravatar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGravatar() {
        return gravatar;
    }

    public void setGravatar(String gravatar) {
        this.gravatar = gravatar;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", password_hash='" + password_hash + '\'' +
                ", telphone='" + telphone + '\'' +
                ", sex=" + sex +
                ", createtime=" + createtime +
                ", email='" + email + '\'' +
                ", gravatar='" + gravatar + '\'' +
                '}';
    }
}
