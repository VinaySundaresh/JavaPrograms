package com.xworkz.app;

public class ShoppingMall extends Mall{
	
	@Override
	public void display() {
		System.out.println("invoking display() in ShoppingMall");
		super.display();
	}
	
	@Override
	public void display(String mallName) {
		System.out.println("invoking display(string) in ShoppingMall");
		super.display(mallName);
	}
	
	@Override
	public void display(String mallName, String mallLocation) {
		System.out.println("invoking display(String,String) in ShoppingMall");
		super.display(mallName, mallLocation);
	}
	
	@Override
	public void display(String mallName, String mallLocation, String ShopsAnme) {
		System.out.println("invoking display(string,string,string) in ShoppingMall");
		super.display(mallName, mallLocation, ShopsAnme);
	}
	
	@Override
	public void display(String mallName, String mallLocation, String ShopsAnme, int noOfFloors) {
		System.out.println("invoking display(string,string,string,int) in ShoppingMall");
		super.display(mallName, mallLocation, ShopsAnme, noOfFloors);
	}
	
	@Override
	public void display(String mallName, String mallLocation, String ShopsAnme, int noOfFloors, int noOfShops) {
		System.out.println("invoking display(string,string,string,int,int) in ShoppingMall");
		super.display(mallName, mallLocation, ShopsAnme, noOfFloors, noOfShops);
	}

}
