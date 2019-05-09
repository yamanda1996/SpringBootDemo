package com.yamanda.springbootdemo.service.impl;

import com.yamanda.springbootdemo.dao.SysUserRepository;
import com.yamanda.springbootdemo.pojo.SysUser;
import com.yamanda.springbootdemo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService,UserDetailsService {

    @Autowired
    SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserRepository.findByUsername(username);
        if (null == sysUser){
            throw new UsernameNotFoundException("username not found!!!");
        }
        return sysUser;
    }

    @Override
    public SysUser getUserByUsername(String username) {
        SysUser sysUser = sysUserRepository.findByUsername(username);
        return sysUser;
    }
}
