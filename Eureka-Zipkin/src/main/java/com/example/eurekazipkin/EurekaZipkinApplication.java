package com.example.eurekazipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class EurekaZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZipkinApplication.class, args);
    }

}
