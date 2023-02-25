package com.example.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: SpringCloudDemo1
 * @description:
 * @author: kangwei
 * @create: 2023-02-25 16:25
 **/
@FeignClient(value = "eureka-client")
public interface FeignService {

    @GetMapping("/hello")
    String getFeignHello();
}
