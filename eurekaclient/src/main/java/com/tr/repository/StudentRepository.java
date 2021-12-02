package com.tr.repository;

import com.tr.entity.Student;

import java.util.Collection;

/**
 * @author BEI on 2021/11/25
 */
public interface StudentRepository {
    /**
     * .
     * @return .
     */
    Collection<Student> findAll();

    /**
     * .
     * @param id .
     * @return .
     */
    Student findById(Long id);

    /**
     * .
     * @param student .
     */
    void saveOrUpdate(Student student);

    /**
     * .
     * @param id .
     */
    void deleteById(Long id);
}
