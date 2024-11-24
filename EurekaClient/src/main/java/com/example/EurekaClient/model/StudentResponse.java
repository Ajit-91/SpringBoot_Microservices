package com.example.EurekaClient.model;

import java.util.List;

public class StudentResponse {
    private String message;
    private List<Student> students;

    // Constructors
    public StudentResponse() {}

    public StudentResponse(String message, List<Student> students) {
        this.message = message;
        this.students = students;
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
