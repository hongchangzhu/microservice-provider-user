package com.netsframe.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netsframe.user.service.fallback.UserServiceFallback;

//失败处理放到UserServiceFallback类中处理
@FeignClient(name = "org-service", fallback = UserServiceFallback.class)
public interface UserService {
	@RequestMapping("/org/query/{id}")
	public String queryOrg(@PathVariable("id") String id);
}
