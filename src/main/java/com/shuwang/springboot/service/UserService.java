package com.shuwang.springboot.service;

import com.shuwang.springboot.mapper.UserMapper;
import com.shuwang.springboot.base.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id) {
        return userMapper.Sel(id);
    }
    public List<User> UserAll(){
        return userMapper.UserAll();
    }
}
