package com.example.Fullstack.repository;

import com.example.Fullstack.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositiory extends JpaRepository<Student,Integer> {
}
