package com.example.productclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  熔断器
 *  负载均衡
 *  客户端
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableHystrix
public class ProductClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductClientApplication.class, args);
    }
}
