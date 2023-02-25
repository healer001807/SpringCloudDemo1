package com.example.eurekaribbon.controller;

import com.example.eurekaribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: SpringCloudDemo1
 * @description:
 * @author: kangwei
 * @create: 2023-02-25 13:48
 **/
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("/hello")
    public String hello(){

        return ribbonService.getHello();
    }
}
