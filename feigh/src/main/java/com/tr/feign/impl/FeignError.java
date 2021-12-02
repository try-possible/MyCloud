package com.tr.feign.impl;

import com.tr.entity.Student;
import com.tr.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author BEI on 2021/11/27
 */
@Component
public class FeignError implements FeignProviderClient {

    /**
     * .
     *
     * @return .
     */
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public String index() {
        return "服务器维护中。。。。。。";
    }
}
