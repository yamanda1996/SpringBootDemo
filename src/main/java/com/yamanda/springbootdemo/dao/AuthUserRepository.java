package com.yamanda.springbootdemo.dao;

import com.yamanda.springbootdemo.pojo.AuthUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface AuthUserRepository extends CrudRepository<AuthUser,Integer> {
}
