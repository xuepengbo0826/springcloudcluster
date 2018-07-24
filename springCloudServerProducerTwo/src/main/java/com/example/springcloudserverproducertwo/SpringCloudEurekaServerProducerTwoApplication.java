package com.example.springcloudserverproducertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Auther: xuepengbo
 * @Date: 2018/7/17 11:32
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaServerProducerTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServerProducerTwoApplication.class, args);
    }
}
