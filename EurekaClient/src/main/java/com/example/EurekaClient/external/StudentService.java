package com.example.EurekaClient.external;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.EurekaClient.model.Student;

@FeignClient(name = "LearnSpring")
public interface StudentService {
	@GetMapping("/api/v1/students")
	public ResponseEntity<List<Student>> getAllStudents();
}
