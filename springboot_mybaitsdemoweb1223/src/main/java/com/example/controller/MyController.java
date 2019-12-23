package com.example.controller;

import com.example.domain.User;
import com.example.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private Mapper mapper;
    @RequestMapping("/hello")
    @ResponseBody
    public List<User> hello(){
        List<User> all = mapper.findAll();
        return all;
    }
}
