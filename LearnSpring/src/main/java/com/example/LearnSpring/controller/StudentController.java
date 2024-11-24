package com.example.LearnSpring.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LearnSpring.model.Student;
import com.example.LearnSpring.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	@Autowired
	StudentService sr;

	@GetMapping("/about")
	public String about() {
		return "Welcome to about";
	}
	
	@GetMapping("")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> studs = sr.getAllStudents();
		return ResponseEntity
				.status(HttpStatus.OK)
				.header("hello", "world")
				.body(studs);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer id){
		Student st = sr.getStudentById(id);
		return ResponseEntity.ok(st);
	}
	
	
	@PostMapping("create")
	public ResponseEntity<String> createStudent(@RequestBody Student s){
		if(s.getName() == null || s.getName().isEmpty()) return ResponseEntity.status(400).body("Name is required");
		sr.createStudent(s); 
		return ResponseEntity.status(200).body("Created Successfully");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student s, @PathVariable Integer id){
		sr.updateStudent(id, s);
		Student s1 = sr.getStudentById(id);
		return ResponseEntity.status(200).body(s1); 
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id){
		sr.deleteStudent(id);
		return ResponseEntity.status(200).body("Deleted Successfully");
	}
}
