package com.example.springcloudeurekaserverthree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudeurekaserverthreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudeurekaserverthreeApplication.class, args);
    }
}
