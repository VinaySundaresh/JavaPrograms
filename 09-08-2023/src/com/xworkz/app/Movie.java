package com.xworkz.app;

public class Movie extends Theater{
	@Override
	public void watch() {
		System.out.println("invoking watch() in Movie");
		super.watch();
	}

	@Override
	public void watch(String tName) {
		System.out.println("invoking watch(String) in Movie");
		super.watch(tName);
	}
	
	@Override
	public void watch(String bakeryName, String location) {
		System.out.println("invoking watch(String,String) in Movie");
		super.watch(bakeryName, location);
	}
	
@Override
	public void watch(String bakeryName, String location, double cost, int distance) {
	System.out.println("invoking watch(String,STring,double,int) in Movie");
		super.watch(bakeryName, location, cost, distance);
	}

@Override
public void watch(String bakeryName, String location, double cost) {
	System.out.println("invoking watch(String,string,string,double) in Movie");
	super.watch(bakeryName, location, cost);
}

@Override
public void watch(String bakeryName, String location, double cost, int distance, double budget) {
	System.out.println("invoking watch(String,string,string,double,int,double) in Movie");
	super.watch(bakeryName, location, cost, distance, budget);
}
}
