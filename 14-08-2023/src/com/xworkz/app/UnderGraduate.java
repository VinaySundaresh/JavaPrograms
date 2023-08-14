package com.xworkz.app;

public class UnderGraduate extends Student {
	public UnderGraduate(String name, int age) {
		super(name, age);
	}

	@Override
	public void study() {
		System.out.println("Undergraduate student is studying");
	}

	@Override
	public void attendClasses() {
		System.out.println("Undergraduate student is attending classes");
	}

	@Override
	public void submitAssignment() {
		System.out.println("Undergraduate student is submitting an assignment");
	}

	@Override
	public void takeExams() {
		System.out.println("Undergraduate student is taking exams");
	}

	@Override
	public String getStudentType() {
		return "Undergraduate";
	}
}
