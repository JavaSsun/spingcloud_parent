package com.haoran.springcloud_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author haoransun
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServerApplication.class, args);
    }

}
