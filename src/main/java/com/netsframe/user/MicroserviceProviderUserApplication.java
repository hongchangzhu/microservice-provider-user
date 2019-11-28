package com.netsframe.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.netsframe.user", "org.mircoservice.org"})
//@EnableEurekaClient // 启动服务注册,只能使用eureka作为注册中心
@EnableFeignClients // 启动feign
@EnableDiscoveryClient //启动服务注册，可以使用eureka、zookeeper、consul作为注册中心
//@EnableCircuitBreaker // 开启Hystrix熔断
//@EnableHystrixDashboard
public class MicroserviceProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderUserApplication.class, args);
    }
}
