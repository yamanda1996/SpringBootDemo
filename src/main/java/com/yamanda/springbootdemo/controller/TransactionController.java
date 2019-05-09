package com.yamanda.springbootdemo.controller;

import com.yamanda.springbootdemo.pojo.Person;
import com.yamanda.springbootdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    public PersonService personService;

    @RequestMapping("/rollback")
    public Person rollback(Person person){
        return personService.savePersonWithRollback(person);
    }

    @RequestMapping("/noRollback")
    public Person noRollback(Person person){
        return personService.savePersonWithoutRollback(person);
    }

}
