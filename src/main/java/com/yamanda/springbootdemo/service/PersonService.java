package com.yamanda.springbootdemo.service;


import com.yamanda.springbootdemo.pojo.Person;

public interface PersonService {

    public Person savePersonWithRollback(Person person);
    public Person savePersonWithoutRollback(Person person);

    public Person save(Person person);
    public void remove(Long id);
    public Person findOne(Long id);


}
