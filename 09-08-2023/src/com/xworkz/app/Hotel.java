package com.xworkz.app;

public class Hotel {
	
	public String name;
	public String location;
	public int noOfDishes;
	public double price;
	public int distance;
	
	public void dish(){
		System.out.println("Invoking dish() in Hotel");
	}
	
	public void dish(String name){
		System.out.println("Invoking  dish(String) in Hotel");
	}
	
	public void dish(String name,String location){
		System.out.println("Invoking  dish(String,String) in Hotel");
	}
	
	public void dish(String name,String location,int noOfDishes){
		System.out.println("Invoking  dish(String,String,int) in Hotel");
	}
	
	public void dish(String name,String location,int noOfDishes,double price){
		System.out.println("Invoking  dish(string,string,int,double) in Hotel");
	}
	
	public void dish(String name,String location,int noOfDishes,double price,int distance){
		System.out.println("Invokingdish(string,string,int,double,int) in Hotel");
	}


}
