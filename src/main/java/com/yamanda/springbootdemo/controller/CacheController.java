package com.yamanda.springbootdemo.controller;

import com.yamanda.springbootdemo.pojo.Person;
import com.yamanda.springbootdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @Autowired
    public PersonService personService;

    @RequestMapping("/saveCache")
    public Person saveWithCache(Person person){
        Person p = personService.save(person);
        return p;
    }

    @RequestMapping("/evitCache")
    public String removeWithCache(Long id){
        personService.remove(id);
        return "remove " + id + "with cache";
    }

    @RequestMapping("/findOne")
    public Person findOne(Long id){
        System.out.println(id);
        Person p = personService.findOne(id);
        return p;
    }

}
