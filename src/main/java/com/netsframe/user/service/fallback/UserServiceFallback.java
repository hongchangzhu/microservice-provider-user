package com.netsframe.user.service.fallback;

import org.springframework.stereotype.Component;

import com.netsframe.user.service.UserService;

@Component
public class UserServiceFallback implements UserService {

	@Override
	public String queryOrg(String id) {
		return "调用microservice-provider-org服务失败";
	}

}
