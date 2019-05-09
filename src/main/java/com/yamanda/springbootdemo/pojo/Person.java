package com.yamanda.springbootdemo.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Person implements Serializable {

    //如果使用jackonSerializer的话，必须使用时间序列化接口，
    //因为使用Jackson做序列化需要一个空构造
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person() {
        super();
    }

    public Person(Long id,String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
