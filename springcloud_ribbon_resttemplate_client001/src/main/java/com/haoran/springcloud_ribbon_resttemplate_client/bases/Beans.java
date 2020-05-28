package com.haoran.springcloud_ribbon_resttemplate_client.bases;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author haoransun
 */
@Configuration
public class Beans {

    /**
     * RestTemplate 交由 工厂管理，用时直接注入
     * @return
     */
    @Bean
    @LoadBalanced //UnknownHostException: HELLO-SERVICE 1. 用来解决服务的负载均衡问题 2. 用来解决以上问题
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
