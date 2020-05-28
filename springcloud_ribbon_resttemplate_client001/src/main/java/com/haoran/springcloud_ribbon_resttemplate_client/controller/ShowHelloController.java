package com.haoran.springcloud_ribbon_resttemplate_client.controller;

import com.netflix.loadbalancer.IRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author haoransun
 */
@RestController
@RequestMapping("/show")
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
    public String showHello(String name){

        IRule irule;

        // 第三种方式调用（推荐）
        String forObject = restTemplate.getForObject("http://HELLO-SERVICE/hello/hello?name=" + name, String.class);
        return forObject;
    }

}
