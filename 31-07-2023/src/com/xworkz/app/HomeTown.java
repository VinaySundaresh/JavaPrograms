package com.xworkz.app;

public class HomeTown {

	public String name;
	public int pinCode;
	public Area[] area;
	
	public HomeTown(String name,int pinCode,Area[] area)
	{
		System.out.println("Invoking constructor in HomeTown");
		this.name=name;
		this.pinCode=pinCode;
		this.area=area;
	
	}

	public void printInfo() {
		System.out.println("Name of the home Town is "+this.name);
		System.out.println("Pincode for homeTown is "+this.pinCode);
		
	}
}
