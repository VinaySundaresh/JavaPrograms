package com.xworkz.app;

public class Zoo {
	
	public String ZooName;
	public String loc;
	public int noOfcages;
	public int openAt;
	public int closesAt;
	
	
	public void show()
	{
		System.out.println("invoking show() in Zoo");
	}
	
	public void show(String ZooName)
	{
		System.out.println("invoking show(String) in Zoo");
	}
	
	public void show(String ZooName,String loc)
	{
		System.out.println("invoking show(String,String) in Zoo");
	}

	public void show(String ZooName,String loc,int noOfcages)
	{
		System.out.println("invoking show(String,String,int) in Zoo");
	}
	
	public void show(String ZooName,String loc,int noOfcages,int openAt)
	{
		System.out.println("invoking show(String,String,int) in Zoo");
	}
	
	public void show(String ZooName,String loc,int noOfcages,int openAt,int closesAt)
	{
		System.out.println("invoking show(String,String,int,int) in Zoo");
	}

}
