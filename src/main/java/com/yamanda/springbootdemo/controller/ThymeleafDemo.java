package com.yamanda.springbootdemo.controller;

import com.yamanda.springbootdemo.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafDemo {

//    @RequestMapping("/")
//    public String index(Model model){
//
//        Person single = new Person("yamanda",11);
//
//        List<Person> people = new ArrayList<Person>();
//
//        Person p1 = new Person("p1",1);
//        Person p2 = new Person("p2",2);
//        Person p3 = new Person("p3",3);
//        people.add(p1);
//        people.add(p2);
//        people.add(p3);
//
//        model.addAttribute("singlePerson",single);
//        model.addAttribute("people",people);
//        return "index";
//    }

}
