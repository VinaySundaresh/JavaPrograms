package com.xworkz.app;

public class College extends Hostel{
	
	@Override
	public void rooms() {
		System.out.println("invoking rooms() in College");
		super.rooms();
	}
	
	@Override
	public void rooms(String loc) {
		System.out.println("invoking rooms(string) in College");
		super.rooms(loc);
	}
	
	@Override
	public void rooms(String loc, String collegeName) {
		System.out.println("invoking rooms(String,string) in College");
		super.rooms(loc, collegeName);
	}
	
	@Override
	public void rooms(String loc, String collegeName, int noOfRooms) {
		System.out.println("invoking rooms(String,String,int) in College");
		super.rooms(loc, collegeName, noOfRooms);
	}
	
	@Override
	public void rooms(String loc, String collegeName, int noOfRooms, int noOfFloors) {
		System.out.println("invoking rooms(String,String,int,int) in College");
		super.rooms(loc, collegeName, noOfRooms, noOfFloors);
	}

	@Override
	public void rooms(String loc, String collegeName, int noOfRooms, int noOfFloors, int sharing) {
		System.out.println("invoking rooms(String,String,int,int,int,int) in College");
		super.rooms(loc, collegeName, noOfRooms, noOfFloors, sharing);
	}
}
