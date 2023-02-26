package com.example.eurekaconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloudDemo1
 * @description:
 * @author: kangwei
 * @create: 2023-02-26 10:31
 **/
@RestController
public class ConfigClientController {

    @Value("${foo}")
    String foo;

    @GetMapping("/index")
    public String index() {
        return foo;
    }
}
