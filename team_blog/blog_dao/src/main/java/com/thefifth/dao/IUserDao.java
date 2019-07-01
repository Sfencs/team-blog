package com.thefifth.dao;


import com.thefifth.bean.UserInfo;

import java.util.List;

public interface IUserDao {
    public boolean addUser(UserInfo user);
    public List<UserInfo> findOneByEmail(String email);
}
