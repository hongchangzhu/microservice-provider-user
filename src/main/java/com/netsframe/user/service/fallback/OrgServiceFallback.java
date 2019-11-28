package com.netsframe.user.service.fallback;

import com.netsframe.user.service.OrgService;
import org.springframework.stereotype.Component;

@Component
public class OrgServiceFallback implements OrgService {

	@Override
	public String queryOrg(String id) {
		return "调用microservice-provider-org服务失败";
	}

}
