# SpringCloud 探索与实战

# 项目环境
Java8 + SpringCloud（本地IDEA 多进程启动）

# 项目结构

eureka_server 2个 做集群

eureka_xxx_service 服务提供方 4个 做集群

eureka_xxx_client  服务消费方（RestTemplate+Ribbon 和 Feign）

config_server 统一配置中心（此处是单一节点）

zuul 网关（路由选择+过滤器）

