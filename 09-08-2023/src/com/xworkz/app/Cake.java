package com.xworkz.app;

public class Cake extends Bakery {

	@Override
	public void bake() {
		System.out.println("Invoking bake() in Cake");
		super.bake();
	}

	@Override
	public void bake(String bakeryName) {
		System.out.println("Invoking bake(String) in Cake");
		super.bake(bakeryName);
	}

	@Override
	public void bake(String bakeryName, String location) {
		System.out.println("Invoking bake(String,String) in Cake");
		super.bake(bakeryName, location);
	}

	@Override
	public void bake(String bakeryName, String location, String gstNo) {
		System.out.println("Invoking bake(String,String,String) in Cake");
		super.bake(bakeryName, location, gstNo);
	}

	@Override
	public void bake(String bakeryName, String location, String gstNo, int distance) {
		System.out.println("Invoking bake(String,String,String) in Cake");

		super.bake(bakeryName, location, gstNo, distance);
	}

	@Override
	public void bake(String bakeryName, String location, String gstNo, int distance, double budget) {
		System.out.println("Invoking bake(String,String,int) in Cake");
		super.bake(bakeryName, location, gstNo, distance, budget);
	}

}
