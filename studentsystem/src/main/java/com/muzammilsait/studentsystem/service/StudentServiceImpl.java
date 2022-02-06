package com.muzammilsait.studentsystem.service;

import com.muzammilsait.studentsystem.model.Student;
import com.muzammilsait.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements  StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student deleteStudent(Student student) {
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);

    }
}
