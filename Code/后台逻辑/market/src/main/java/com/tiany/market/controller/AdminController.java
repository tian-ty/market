package com.tiany.market.controller;

import com.alibaba.fastjson.JSONObject;
import com.tiany.market.entity.Admin;
import com.tiany.market.service.AdminService;
import com.tiany.market.util.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/admin")
@Slf4j
public class AdminController extends BaseController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public Object login()
    {
        String username = getRequest().getParameter("username");
        String password = getRequest().getParameter("password");
        Admin admin = adminService.adminLogin(username, password);

        if(admin != null)
        {
            log.info("============");
            JSONObject json = new JSONObject();
            json.put("msg","ok");
            json.put("code",200);
            json.put("data",admin);
            return json;
        }
        else
        {
            JSONObject json = new JSONObject();
            json.put("msg","无此用户");
            json.put("code",203);
            return json;
        }

    }

}
