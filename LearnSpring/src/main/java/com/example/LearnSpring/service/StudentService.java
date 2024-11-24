package com.example.LearnSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.LearnSpring.model.Student;
import com.example.LearnSpring.repo.StudentRepo;
import com.example.LearnSpring.util.CustomException;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo sr;
	
	public void createStudent(Student s) {
		sr.save(s);
	}
	
	public List<Student> getAllStudents(){
		List<Student> studs = sr.findAll();
		return studs;
	}
	
	public Student getStudentById(Integer id){
		return sr.findById(id)
				 .orElseThrow(() -> new CustomException(404, "Student not found"));
	}
	
	public void updateStudent(Integer id, Student s) {
		Student foundStud = sr.findById(id)
				.orElseThrow(() -> new CustomException(404, "Student not found"));
		
		foundStud.setName(s.getName());
		sr.save(foundStud);
	}
	
	public void deleteStudent(Integer id) {
		sr.deleteById(id);
	}
	
}
