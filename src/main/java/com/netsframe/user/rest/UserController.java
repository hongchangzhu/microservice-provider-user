package com.netsframe.user.rest;

import com.netsframe.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UserController {
    @Autowired
    private UserService userService;
//	@Autowired
//	OrgServiceClient orgServiceClient;

    @GetMapping("/user/query/{id}")
    public String query(@PathVariable("id") String id) {
        System.out.println("id=" + id);
        String org = userService.queryOrg(id);
//		String org = orgServiceClient.queryOrg(id);
        return "昊哥哥所属组织：" + org;
    }
}
