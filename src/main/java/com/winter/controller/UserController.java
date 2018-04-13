package com.winter.controller;


import com.github.pagehelper.PageInfo;
import com.winter.model.User;
import com.winter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/test")
    public PageInfo<User> getUsers(){
        return service.findAllUser(1,1);
    }
}
