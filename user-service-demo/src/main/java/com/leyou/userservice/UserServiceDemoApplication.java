package com.leyou.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Scanner;

@SpringBootApplication
@EnableDiscoveryClient   //开启client服务
public class UserServiceDemoApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String port = scanner.nextLine();
        new SpringApplicationBuilder(UserServiceDemoApplication.class)
                .properties("server.port=" + port).run(args);
//        SpringApplication.run(UserServiceDemoApplication.class, args);
    }

}
