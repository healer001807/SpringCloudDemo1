package com.example.eurekafeign.controller;

import com.example.eurekafeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloudDemo1
 * @description:
 * @author: kangwei
 * @create: 2023-02-25 16:24
 **/
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping("/getFeignHello")
    public String getFeignHello() {
        return feignService.getFeignHello();
    }
}
