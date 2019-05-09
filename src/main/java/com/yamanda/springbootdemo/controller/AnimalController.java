package com.yamanda.springbootdemo.controller;

import com.yamanda.springbootdemo.pojo.Animal;
import com.yamanda.springbootdemo.dao.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    AnimalRepository animalRepository;

    @RequestMapping("/animalSave")
    public Animal savePerson(Animal animal){
        Animal p = animalRepository.save(animal);
        return p;
    }

    @RequestMapping("/queryAnimalByAge")
    public List<Animal> queryByAge(int age){
        List<Animal> animals = animalRepository.queryByAge(age);
        return animals;
    }
}
