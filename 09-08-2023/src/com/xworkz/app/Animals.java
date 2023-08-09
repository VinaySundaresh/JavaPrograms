package com.xworkz.app;

public class Animals extends Zoo {
	@Override
	public void show() {
		System.out.println("invoking display() in Animals");
		super.show();
	}

	@Override
	public void show(String ZooName) {
		System.out.println("invoking show(String) in Animals");
		super.show(ZooName);
	}

	@Override
	public void show(String ZooName, String loc) {
		System.out.println("invoking show(String,string) in Animals");
		super.show(ZooName, loc);
	}

	@Override
	public void show(String ZooName, String loc, int noOfcages) {
		System.out.println("invoking show(String,string,int) in Animals");
		super.show(ZooName, loc, noOfcages);
	}

	@Override
	public void show(String ZooName, String loc, int noOfcages, int openAt) {
		System.out.println("Invoking show(string,string,int,int) in Animals");
		super.show(ZooName, loc, noOfcages, openAt);
	}

	@Override
	public void show(String ZooName, String loc, int noOfcages, int openAt, int closesAt) {
		System.out.println("Invoking show(string,string,int,int,int) in Animals");
		super.show(ZooName, loc, noOfcages, openAt, closesAt);
	}

}
