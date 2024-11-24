package com.example.LearnSpring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.LearnSpring.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
