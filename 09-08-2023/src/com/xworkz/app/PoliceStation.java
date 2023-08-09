package com.xworkz.app;

public class PoliceStation {
	
	public String stationName;
	public int noOfpolice;
	public String location;
	public int noOfcells;
	public double time;
	
	public void arrest()
	{
		System.out.println("Invoking arrest () in PoliceStation");
	}
	
	public void arrest(String stationName)
	{
		System.out.println("Invoking arrest (String) in PoliceStation");
	}
	
	public void arrest(String stationName,int noOfpolice)
	{
		System.out.println("Invoking arrest (String,int) in PoliceStation");
	}

	public void arrest(String stationName,int noOfpolice,String location)
	{
		System.out.println("Invoking arrest (String,int,String) in PoliceStation");
	}
	
	public void arrest(String stationName,int noOfpolice,String location,int noOfcells)
	{
		System.out.println("Invoking arrest (String,int,String,int) in PoliceStation");
	}
	public void arrest(String stationName,int noOfpolice,String location,int noOfcells,double time)
	{
		System.out.println("Invoking arrest (String,int,String,int,double) in PoliceStation");
	}

}
