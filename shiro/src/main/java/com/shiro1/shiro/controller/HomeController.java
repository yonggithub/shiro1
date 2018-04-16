package com.shiro1.shiro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {

    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String login(){
        return "login";
    }
}
