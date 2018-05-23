package com.netsframe.user.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netsframe.user.service.UserService;

@RestController()
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/user/query/{id}")
	public String query(@PathVariable("id") String id) {
		String org = userService.queryOrg(id);
		return "昊哥哥所属组织：" + org;
	}
}
