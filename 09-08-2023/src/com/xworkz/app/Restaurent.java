package com.xworkz.app;

public class Restaurent extends Hotel {
	
	@Override
	public void dish() {
		System.out.println("Invoking dish() in Restaurent ");
		super.dish();
	}
	
	@Override
	public void dish(String name) {
		System.out.println("Invoking  dish(String) in Restaurent");
		super.dish(name);
	}

	@Override
	public void dish(String name, String location) {
		System.out.println("Invoking  dish(String,String) in Restaurent ");
		super.dish(name, location);
	}
	
	@Override
	public void dish(String name, String location, int noOfDishes) {
		System.out.println("Invoking  dish(String,String,int) in Restaurent");
		super.dish(name, location, noOfDishes);
	}
	
	@Override
	public void dish(String name, String location, int noOfDishes, double price) {
		System.out.println("Invoking  dish(string,string,int,double) in Restaurent");
		super.dish(name, location, noOfDishes, price);
	}
	
	@Override
	public void dish(String name, String location, int noOfDishes, double price, int distance) {
		System.out.println("Invokingdish(string,string,int,double,int) in Restaurent");
		super.dish(name, location, noOfDishes, price, distance);
	}
}
