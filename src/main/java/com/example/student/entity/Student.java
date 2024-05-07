package com.example.student.entity;

import java.time.LocalDateTime;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private LocalDateTime DOB;
	private int age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String lastName, String email, LocalDateTime dOB, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		DOB = dOB;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDOB() {
		return DOB;
	}

	public void setDOB(LocalDateTime dOB) {
		DOB = dOB;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
