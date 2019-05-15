package com.yamanda.springbootdemo;

import com.yamanda.springbootdemo.configuration.ImportConfiguration;
import com.yamanda.springbootdemo.pojo.ImportTest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Import({ImportConfiguration.class})
@SpringBootApplication
@EnableCaching
@EnableJms
public class SpringbootDemoApplication {

//   SpringbootDemoApplication @Value("${book.author}")
//    private String name;
//    @Value("${book.price}")
//    private int price;

//    @ResponseBody
//    @RequestMapping("/")
//    public String index(){
//        return "hello world spring boot" + name + price;
//    }
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootDemoApplication.class);

        ConfigurableApplicationContext context = app.run(args);
//        ImportTest importTest = context.getBean(ImportTest.class);
//        System.out.println(importTest.getName());

    }

}
