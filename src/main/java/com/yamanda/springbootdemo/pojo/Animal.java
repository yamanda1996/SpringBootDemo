package com.yamanda.springbootdemo.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

@Document
public class Animal {

    @Id
    private Long id;
    private Integer age;
    private String name;

    @Field("locs")
    private Collection<Location> locations = new LinkedHashSet<Location>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {

    }

    public Animal(Long id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
