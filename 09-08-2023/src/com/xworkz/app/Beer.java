package com.xworkz.app;

public class Beer extends Pub {
	
	@Override
	public void dance() {
		System.out.println("invoking dance() in Beer");
		super.dance();
	}
	
	@Override
	public void dance(String pubName) {
		System.out.println("invoking dance(String) in Beer");		
		super.dance(pubName);
	}
	
	@Override
	public void dance(String pubName, int startAt) {
		System.out.println("invoking dance(string,int) in Beer");
		super.dance(pubName, startAt);
	}
	
	@Override
	public void dance(String pubName, int startAt, int endAt) {
		System.out.println("invoking dance(string,int,int) in Beer");
		super.dance(pubName, startAt, endAt);
	}

	@Override
	public void dance(String pubName, int startAt, int endAt, String loc) {
		System.out.println("invoking dance(String,int,int,String) in Beer");
		super.dance(pubName, startAt, endAt, loc);
	}
	
	@Override
	public void dance(String pubName, int startAt, int endAt, String loc, double price) {
		System.out.println("invoking dance(String,int,int,String,double) in Beer");
		super.dance(pubName, startAt, endAt, loc, price);
	}
	
}
