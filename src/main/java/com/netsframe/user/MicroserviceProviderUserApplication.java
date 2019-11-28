package com.netsframe.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;
//import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication(scanBasePackages = { "com.netsframe.user","org.mircoservice.org" })
@EnableEurekaClient // 启动服务注册
//@EnableFeignClients // 启动feign
//@EnableCircuitBreaker // 开启Hystrix熔断
//@EnableHystrixDashboard
public class MicroserviceProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderUserApplication.class, args);
	}
}
