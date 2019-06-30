package com.thefifth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("identify")
public class IdentificationController {

    @RequestMapping("/login.do")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();;
        mv.setViewName("login");
        return mv;
    }
}
