package com.thefifth.service.impl;

import com.thefifth.bean.UserInfo;
import com.thefifth.dao.IUserDao;
import com.thefifth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;
    @Override
    public boolean setup(UserInfo user) {
        String email = user.getEmail();
        List<UserInfo> userInfos = userDao.findOneByEmail(email);
        if (userInfos.size()==0){
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateStr = format.format(date);
            user.setCreatetime(dateStr);
            user.setGravatar("https://gravatar.com/avatar/"+ DigestUtils.md5DigestAsHex(user.getEmail().getBytes())+"?d=wavatar");
            userDao.addUser(user);
            return true;
        }else {
            return false;
        }

    }
}
