package com.example.loginclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * , 向配置中心读取配置文件
 *  * 注意 : jar : spring-cloud-stream-binder-rabbit
 */
@SpringBootApplication
@EnableEurekaClient
public class LoginClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginClientApplication.class, args);
    }
}
