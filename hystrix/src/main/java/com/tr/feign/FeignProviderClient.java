package com.tr.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.tr.entity.Student;
import com.tr.feign.impl.FeignError;

import java.util.Collection;

/**
 * @author BEI on 2021/11/27
 */
@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {
    /**
     * .
     * @return .
     */
    @GetMapping("/student/finAll")
    Collection<Student> findAll();

    /**
     * .
     * @return .
     */
    @GetMapping("/student/index")
    String index();
}
