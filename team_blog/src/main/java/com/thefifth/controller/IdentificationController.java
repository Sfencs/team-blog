package com.thefifth.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thefifth.bean.UserInfo;
import com.thefifth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("identify")
public class IdentificationController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login.do")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();;
        mv.setViewName("login");
        return mv;
    }

    @ResponseBody
    @RequestMapping("/setup.do")
    public String setup(UserInfo user,String password){
            String ss=DigestUtils.md5DigestAsHex(password.getBytes());
            user.setPassword_hash(ss);
            boolean success = userService.setup(user);
            Map result = new HashMap();
            result.put("status",success);
            Gson gson = new GsonBuilder().create();
            String result_str = gson.toJson(result);
            return result_str;


    }
}
