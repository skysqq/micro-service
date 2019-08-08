package com.sqq.eurekademo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDemo01Application.class, args);
    }

}
