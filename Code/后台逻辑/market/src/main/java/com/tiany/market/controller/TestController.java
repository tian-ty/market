package com.tiany.market.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * 用作测试的控制器
     */

    @Value("${server.port}")
    private String port;

    /**
     * 获取端口号
     * @return String
     * @author tiany
     */
    @GetMapping("/getPort")
    public String getPort()
    {
        return "项目的端口号为："+this.port;
    }

}
