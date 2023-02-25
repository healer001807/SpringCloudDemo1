package com.example.eurekafeign.service;

import org.springframework.stereotype.Component;

/**
 * @program: SpringCloudDemo1
 * @description:
 * @author: kangwei
 * @create: 2023-02-25 17:32
 **/
@Component
public class FeignServiceHystrix implements FeignService {
    @Override
    public String getFeignHello() {
        return "feign " + "error";
    }
}
