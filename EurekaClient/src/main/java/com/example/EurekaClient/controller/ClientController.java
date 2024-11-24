package com.example.EurekaClient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EurekaClient.external.StudentService;
import com.example.EurekaClient.model.Student;
import com.example.EurekaClient.model.StudentResponse;

@RestController
public class ClientController {
	
	@Autowired
	StudentService sr;
	
	@GetMapping("/fetch-students")
	public ResponseEntity<StudentResponse> fetchStudents(){
		ResponseEntity<List<Student>> sList = sr.getAllStudents();
		StudentResponse SR = new StudentResponse("fetched all", sList.getBody());
		
		return ResponseEntity.status(200).body(SR);
	}
}
