package com.shiro1.shiro.shiro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/f/{name}")
    public String f(@PathVariable String name){
        return "111"+name;
    }
}
