package com.lr.controller;

import com.lr.blog.Blog;
import jdk.nashorn.internal.runtime.linker.Bootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @Autowired
    private Blog blog;
    @RequestMapping("/index")
    public String index(){
        System.out.println(blog.getBigNum());
        return  "Hello Springboot";
    }
}
