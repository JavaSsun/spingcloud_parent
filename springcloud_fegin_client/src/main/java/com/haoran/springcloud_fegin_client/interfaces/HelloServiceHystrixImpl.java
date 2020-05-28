package com.haoran.springcloud_fegin_client.interfaces;

import org.springframework.stereotype.Component;

/**
 * @author haoransun
 */
@Component
public class HelloServiceHystrixImpl implements HelloServiceInterface{
    @Override
    public String hello(String namexyze) {
        return "service is shutdowm,name  " + namexyze;
    }
}
