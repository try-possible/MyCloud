package com.tr.controller;


import com.tr.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tr.entity.Student;

import java.util.Collection;

/**
 * @author BEI on 2021/11/26
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    @Autowired
    @Qualifier("com.tr.feign.FeignProviderClient")
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }
}
