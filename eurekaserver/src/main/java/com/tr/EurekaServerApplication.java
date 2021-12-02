package com.tr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author BEI on 2021/11/25
 * @SpringBootApplication 声明该类是 Spring Boot 服务的入口
 * @EnableEurekaServer 声明该类是⼀个 Eureka Server 微服务，提供服务注册和服务发现功能，即注册中⼼
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
