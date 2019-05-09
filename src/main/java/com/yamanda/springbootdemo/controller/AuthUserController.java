package com.yamanda.springbootdemo.controller;

import com.yamanda.springbootdemo.pojo.AuthUser;
import com.yamanda.springbootdemo.dao.AuthUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@Controller
@RequestMapping("/authuser")
public class AuthUserController {


    @Autowired
    private AuthUserRepository authUserRepository;

    @GetMapping("/add")
    @ResponseBody
    public String addUser(@RequestParam String name,
                          @RequestParam String passwd){
        AuthUser authUser = new AuthUser();
        authUser.setUsername(name);
        authUser.setPassword(passwd);
        authUser.setDate_joined(new Date());
        authUserRepository.save(authUser);
        return "save successfully!!!";
    }

    @GetMapping("/all")
    @ResponseBody
    public Iterable<AuthUser> getAllUser(){
        return authUserRepository.findAll();
    }

}
