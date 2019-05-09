package com.yamanda.springbootdemo.service.impl;

import com.yamanda.springbootdemo.pojo.Person;
import com.yamanda.springbootdemo.dao.PersonRepository;
import com.yamanda.springbootdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    @Transactional(rollbackOn = {IllegalArgumentException.class})
    public Person savePersonWithRollback(Person person) {
        Person save = personRepository.save(person);
        if (save.getName().equals("yamanda")){
            throw new IllegalArgumentException("yamanda is already existed!!!");
        }
        return save;
    }

    @Override
    @Transactional(dontRollbackOn = {IllegalArgumentException.class})
    public Person savePersonWithoutRollback(Person person) {
        Person save = personRepository.save(person);
        if (save.getName().equals("yamanda")){
            throw new IllegalArgumentException("yamanda is already,but it is fine!!!");
        }
        return save;
    }

    @Override
    @CachePut(value = "people",key = "#person.id")
    public Person save(Person person) {
        Person p = personRepository.save(person);
        System.out.println("save cache for person "+person.getId());
        return p;
    }

    @Override
    @CacheEvict(value = "people")
    public void remove(Long id) {
        personRepository.deleteById(id);
        System.out.println("delete cache for person "+id);
    }

    @Override
    @Cacheable(value = "people")
    public Person findOne(Long id) {
        Optional<Person> personOpt = personRepository.findById(id);
        Person p = null;
        if (personOpt.isPresent()){
            p = personOpt.get();
        }
        System.out.println("add cache for person "+p.getId());
        return p;
    }
}
