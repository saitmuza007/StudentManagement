package com.muzammilsait.studentsystem.repository;

import com.muzammilsait.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository  extends JpaRepository<Student,Integer> {

}
