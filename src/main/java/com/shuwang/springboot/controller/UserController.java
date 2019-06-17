package com.shuwang.springboot.controller;

import com.shuwang.springboot.base.User;
import com.shuwang.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;


@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id) {
        User str = userService.Sel(id);
        System.out.println("***************************"+str);
        return userService.Sel(id).toString();
    }

    @RequestMapping("getUser/All")
    public String GetUserAll(){
        List<User> list = userService.UserAll();
        Iterator<User> it = list.iterator();
        while(it.hasNext()){
            System.out.println("******"+it.next());
        }
        return userService.UserAll().toString();
    }

}
