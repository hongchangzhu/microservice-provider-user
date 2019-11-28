package com.netsframe.user.service;

import com.netsframe.user.service.fallback.UserServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//失败处理放到UserServiceFallback类中处理
@FeignClient(name = "org-service", fallback = UserServiceFallback.class)
public interface UserService {
    @RequestMapping(value = "/org/query", method = RequestMethod.GET)
    String queryOrg(@RequestParam("id") String id);
}
