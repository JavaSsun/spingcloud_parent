package com.haoran.springcloud_ribbon_resttemplate_client.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author haoransun
 */
@RestController
@RequestMapping("/show")
@DefaultProperties(defaultFallback = "defaultError")
public class ShowHelloController {
    /**
     * 第三种方式：交由工厂注入
     */
    @Autowired
    private RestTemplate restTemplate;
    /**
     * 想调用 springcloud_eureka_hello_service中的服务
     * @param name
     * @return
     */
    @RequestMapping("/hello")
    @HystrixCommand
    public String showHello(String name){

        // 第三种方式调用（推荐）
        String forObject = restTemplate.getForObject("http://HELLO-SERVICE/hello/hello?name=" + name, String.class);
        return forObject;
    }
    /**
     * 当上面方法调用的服务不可达时，调用当前本地方法
     * @return
     */
    private String defaultError(){
        return "service is shutdown by defaultError" ;
    }

}
