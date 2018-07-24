package com.example.springcloudserverproducertwo.controller;

import com.example.springcloudserverproducertwo.vo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xuepengbo
 * @Date: 2018/7/17 11:34
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public User getUser(){
        System.out.println("222");
        return new User("薛蓬勃1", "男", "28");
    }
}
