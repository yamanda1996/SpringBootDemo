package com.yamanda.springbootdemo.service;

import com.yamanda.springbootdemo.pojo.SysUser;

public interface SysUserService {

    public SysUser getUserByUsername(String username);
}
