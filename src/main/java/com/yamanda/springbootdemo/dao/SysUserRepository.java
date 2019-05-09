package com.yamanda.springbootdemo.dao;

import com.yamanda.springbootdemo.pojo.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser,Long> {
    SysUser findByUsername(String username);
}
