package com.xworkz.app;

public class Hospital {
	
	public String specialisation;
	public String doctorName;
	public int consultancyFee;
	public double roomcharges;
	public boolean near;
	
	public void cureDisease()
	{
		System.out.println("invoking cureDisease in Hospital");
	}
	
	public void cureDisease(String specialisation)
	{
		System.out.println("invoking cureDisease(String) in Hospital");
	}
	
	public void cureDisease(String specialisation, String doctorName)
	{
		System.out.println("invoking cureDisease(String,String) in Hospital");
	}
	
	public void cureDisease(String specialisation, String doctorName, int consultancyFee)
	{
		System.out.println("invoking cureDisease(String,String,int) in Hospital");
	}
	
	public void cureDisease(String specialisation, String doctorName, int consultancyFee,double roomcharges)
	{
		System.out.println("invoking cureDisease(String,String,int,double) in Hospital");
	}
	
	public void cureDisease(String specialisation, String doctorName, int consultancyFee,double roomcharges,boolean cure)
	{
		System.out.println("invoking cureDisease(String,String,int,double,boolean) in Hospital");
	}

}
