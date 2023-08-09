package com.xworkz.app;

public class Police extends PoliceStation {

	@Override
	public void arrest() {
		System.out.println("invoking arrest() in PoliceStation");
		super.arrest();
	}
	
	@Override
	public void arrest(String stationName) {
		System.out.println("invoking arrest(string) in PoliceStation");
		super.arrest(stationName);
	}
	
	@Override
	public void arrest(String stationName, int noOfpolice) {
		System.out.println("invoking arrest(string,int) in PoliceStation");
		super.arrest(stationName, noOfpolice);
	}
	
	@Override
	public void arrest(String stationName, int noOfpolice, String location) {
		System.out.println("invoking arrest(string,int,string) in PoliceStation");
		super.arrest(stationName, noOfpolice, location);
	}
	
	@Override
	public void arrest(String stationName, int noOfpolice, String location, int noOfcells) {
		System.out.println("invoking arrest(string,int,string,int) in PoliceStation");
		super.arrest(stationName, noOfpolice, location, noOfcells);
	}
	
	@Override
	public void arrest(String stationName, int noOfpolice, String location, int noOfcells, double time) {
		System.out.println("invoking arrest(string,int,string,int,double) in PoliceStation");
		super.arrest(stationName, noOfpolice, location, noOfcells, time);
	}
}
