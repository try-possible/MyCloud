package com.tr.controller;

import com.tr.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author BEI on 2021/11/25
 */
@RestController
@RequestMapping("/rest")
public class RestHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        //return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
        return restTemplate.getForObject("http://localhost:8010/student/findAll", Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id) {
        //return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class).getBody();
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        //restTemplate.postForEntity("http://localhost:8010/student/save",student,null).getBody();
        restTemplate.postForObject("http://localhost:8010/student/save",student,void.class);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}",id);
    }
}
