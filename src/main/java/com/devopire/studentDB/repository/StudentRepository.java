package com.devopire.studentDB.repository;

import com.devopire.studentDB.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
