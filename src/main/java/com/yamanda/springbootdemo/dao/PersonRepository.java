package com.yamanda.springbootdemo.dao;


import com.yamanda.springbootdemo.pojo.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "/people")
public interface PersonRepository extends PagingAndSortingRepository<Person,Long> {


    List<Person> findByAge(int age);

//    @Query("select p from Person p where p.name= :name and p.age= :age")
//    Person withNameAndAgeQuery(@Param("name") String name,
//                               @Param("age") int age);


    @Query("select p from Person p where p.name=?1 and p.age=?2")
    public Person withNameAndAgeQuery(String name,int age);
}
