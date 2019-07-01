package com.thefifth.dao;


import com.thefifth.bean.UserInfo;

import java.util.List;

public interface IUserDao {
    public boolean addUser(UserInfo user);
    public List<UserInfo> findOneByEmail(String email);
    public List<UserInfo> findOneByEmailAndPasswordHash(UserInfo user);
    public List<UserInfo> findOneById(int id);//根据id查用户，返回的是userinfo列表
    public int insertUserFeedback(UserInfo user);//插入一条到用户反馈
    public int updateUserInfo(UserInfo user);

}
