package com.tiany.market.controller;

import com.tiany.market.entity.Admin;
import com.tiany.market.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController extends BaseController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public Admin login()
    {
        String username = getRequest().getParameter("username");
        String password = getRequest().getParameter("password");
        Admin admin = adminService.adminLogin(username,password);
        return admin;
    }

}
