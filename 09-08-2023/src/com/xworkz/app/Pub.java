package com.xworkz.app;

public class Pub {
	
	public String pubName;
	public int startAt;
	public int endAt;
	public String loc;
	public double price;
	
	public void dance()
	{
		System.out.println("invoking dance() in Pub");
	}
	
	public void dance(String pubName)
	{
		System.out.println("invoking dance(String) in Pub");
	}

	public void dance(String pubName,int startAt)
	{
		System.out.println("invoking dance(String,int) in Pub");
	}
	
	public void dance(String pubName,int startAt,int endAt)
	{
		System.out.println("invoking dance(String,int,int) in Pub");
	}
	
	public void dance(String pubName,int startAt,int endAt,String loc)
	{
		System.out.println("invoking dance(String,int,int,string) in Pub");
	}
	
	public void dance(String pubName,int startAt,int endAt,String loc,double price)
	{
		System.out.println("invoking dance(String,int,int,string,double) in Pub");
	}
	

}
