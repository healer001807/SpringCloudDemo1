package com.example.eurekaribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: SpringCloudDemo1
 * @description:
 * @author: kangwei
 * @create: 2023-02-25 14:06
 **/
@Service
public class RibbonServiceImpl implements RibbonService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public String getHello() {
                return restTemplate.getForObject("http://eureka-client/hello",String.class);
    }
}
