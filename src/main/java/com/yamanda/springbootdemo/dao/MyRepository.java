package com.yamanda.springbootdemo.dao;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

@NoRepositoryBean
public interface MyRepository<T,ID extends Serializable>
        extends PagingAndSortingRepository <T,ID>{

    public void doSomething(ID id);
}
