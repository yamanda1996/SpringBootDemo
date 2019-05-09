package com.yamanda.springbootdemo.dao;

import com.yamanda.springbootdemo.pojo.Animal;
import com.yamanda.springbootdemo.pojo.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AnimalRepository extends MongoRepository<Animal,Long> {

    Person findByName(String name);

    @Query("{'age':?0}")
    List<Animal> queryByAge(int age);
}
