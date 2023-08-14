package com.xworkz.app;

public abstract class Student {

	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public abstract void study();

	public abstract void attendClasses();

	public abstract void submitAssignment();

	public abstract void takeExams();

	public abstract String getStudentType();

	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Student Type: " + getStudentType());
	}
}
