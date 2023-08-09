package com.xworkz.app;

public class Mall {
	
	public String mallName;
	public String mallLocation;
	public String ShopsAnme;
	public int noOfFloors;
	public int noOfShops;
	
	public void display()
	{
		System.out.println("invoking display() in Mall");
	}
	
	public void display(String mallName)
	{
		System.out.println("invoking display(string) in Mall");
	}

	public void display(String mallName,String mallLocation)
	{
		System.out.println("invoking display(string,string) in Mall");
	}
	
	public void display(String mallName,String mallLocation,String ShopsAnme)
	{
		System.out.println("invoking display(string,string,string) in Mall");
	}
	
	public void display(String mallName,String mallLocation,String ShopsAnme,int noOfFloors)
	{
		System.out.println("invoking display(string,string,string,int) in Mall");
	}
	
	public void display(String mallName,String mallLocation,String ShopsAnme,int noOfFloors,int noOfShops)
	{
		System.out.println("invoking display(string,string,string,int,int) in Mall");
	}

}
