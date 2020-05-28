package com.haoran.springcloud_fegin_client.interfaces;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author haoransun
 */
@FeignClient(value = "HELLO-SERVICE",fallback = HelloServiceHystrixImpl.class) //明确该接口对应Eureka中的哪个服务
public interface HelloServiceInterface {

    /**
     * 调用 HELLO-SERVICE 控制器中的 hello/hello方法
     * RequestParam 中的别名要与 服务方中的参数名称一致
     * @param namexyze
     * @return
     */
    @RequestMapping("/hello/hello")
    public String hello(@RequestParam("name") String namexyze);
}
