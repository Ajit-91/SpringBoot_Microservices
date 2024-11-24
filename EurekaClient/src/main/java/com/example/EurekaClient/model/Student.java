package com.example.EurekaClient.model;

public class Student {
	Integer rollNo;
	String name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{ " +
				"rollNo: " + rollNo +
				" | name: " + name +
				" }";
	}
}
