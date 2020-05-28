package com.haoran.springcloud_ribbon_resttemplate_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author haoransun
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
public class SpringcloudRibbonResttemplateClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRibbonResttemplateClientApplication.class, args);
    }

}
