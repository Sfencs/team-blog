package com.thefifth.service;

import com.thefifth.bean.UserInfo;

import java.util.HashMap;

public interface IUserService {

    public boolean setup(UserInfo user);
    public HashMap login(UserInfo user);


}
