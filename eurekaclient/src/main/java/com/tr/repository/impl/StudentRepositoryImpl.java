package com.tr.repository.impl;

import com.tr.entity.Student;
import com.tr.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author BEI on 2021/11/25
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static final Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 22));
        studentMap.put(2L, new Student(2L, "张四", 27));
        studentMap.put(3L, new Student(3L, "张无", 28));
    }

    /**
     * .
     *
     * @return .
     */
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    /**
     * .
     *
     * @param id .
     * @return .
     */
    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    /**
     * .
     *
     * @param student .
     */
    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    /**
     * .
     *
     * @param id .
     */
    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }
}
