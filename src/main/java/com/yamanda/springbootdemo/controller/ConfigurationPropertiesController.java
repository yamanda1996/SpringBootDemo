package com.yamanda.springbootdemo.controller;

import com.yamanda.springbootdemo.pojo.Book;
import com.yamanda.springbootdemo.pojo.HttpEncodingProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigurationPropertiesController {

    @Autowired
    private Book book;


//    @RequestMapping("/")
//    public String index(){
//        return "book : " + book.getAuthor() +
//                book.getPrice();
//    }

//    public static void main(String[] args) {
//        SpringApplication.run(ConfigurationPropertiesController.class,args);
//    }




}
