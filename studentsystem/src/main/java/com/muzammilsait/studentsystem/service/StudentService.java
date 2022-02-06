package com.muzammilsait.studentsystem.service;

import com.muzammilsait.studentsystem.model.Student;

import java.util.List;

public interface StudentService  {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student deleteStudent(Student student);
}
