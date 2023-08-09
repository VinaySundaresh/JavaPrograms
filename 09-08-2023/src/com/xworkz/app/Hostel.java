package com.xworkz.app;

public class Hostel {

	
	public String loc;
	public String collegeName;
	public int noOfRooms;
	public int noOfFloors;
	public int sharing;
	
	public void rooms()
	{
		System.out.println("invoking rooma() in Hostel");
	}
	
	public void rooms(String loc)
	{
		System.out.println("invoking rooma(String ) in Hostel");
	}
	
	public void rooms(String loc,String collegeName)
	{
		System.out.println("invoking rooma(String ,String) in Hostel");
	}
	
	public void rooms(String loc,String collegeName,int noOfRooms)
	{
		System.out.println("invoking rooma(String ,String,int) in Hostel");
	}
	
	public void rooms(String loc,String collegeName,int noOfRooms,int noOfFloors)
	{
		System.out.println("invoking rooma(String ,String,int,int) in Hostel");
	}
	
	
	public void rooms(String loc,String collegeName,int noOfRooms,int noOfFloors,int sharing)
	{
		System.out.println("invoking rooma(String ,String,int,int,int) in Hostel");
	}
	
}
