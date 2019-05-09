package com.yamanda.springbootdemo.controller;


import com.yamanda.springbootdemo.pojo.Person;
import com.yamanda.springbootdemo.dao.PersonRepository;
import com.yamanda.springbootdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    PersonService personService;

    @RequestMapping("/save")
    public Person savePerson(String name,int age){
        Person person = personRepository.save(new Person(null, name, age));
        return person;
    }

    @RequestMapping("/getByAge")
    public List<Person> getPersonByAge(int age){
        List<Person> people = personRepository.findByAge(age);
        return people;
    }

    @RequestMapping("/getByNameAndAge")
    public Person getByNameAndAge(String name,int age){
        Person person = personRepository.withNameAndAgeQuery(name, age);
        return person;
    }


    @RequestMapping("/sort")
    public List<Person> sort(){

        List<Person> people =
                (List<Person>)personRepository.findAll(new Sort(Sort.Direction.DESC, "age"));
        return people;
    }


    @RequestMapping("/page")
    public Page<Person> page(){
        Page<Person> people = personRepository.findAll(new PageRequest(1, 2));
        return people;
    }
}
