package com.haoran.springcloud_eureka_hello_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haoransun
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/hello")
    public String helloName(String name){
        System.out.println("姓名：  "+name);
        return "service3----hello： "+name;
    }
}
