package com.tr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author BEI on 2021/11/25
 * @EnableZuulProxy 包含了 @EnableZuulServer ，设置该类是网关的启动类
 * @EnableAutoConfiguration 可以帮助 Spring Boot 应用将所有符合条件的 @Configuration 配
 * 置加载到当前 Spring Boot 创建并使用的 IoC 容器中
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
