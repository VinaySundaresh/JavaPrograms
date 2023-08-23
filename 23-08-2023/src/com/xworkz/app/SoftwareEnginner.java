package com.xworkz.app;

public class SoftwareEnginner implements Engineer {

	@Override
	public String devops() {
		System.out.println("Invoking devops() in SoftwareEngineer");
		return null;
	}

	@Override
	public double salary() {
		System.out.println("Invoking salary() in SoftwareEngineer");
		return 0;
	}

	@Override
	public int exp() {
		System.out.println("Invoking exp() in SoftwareEngineer");
		return 0;
	}

}
