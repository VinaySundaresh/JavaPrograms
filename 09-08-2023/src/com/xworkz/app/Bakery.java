package com.xworkz.app;

public class Bakery {
	
	public String bakeryName;
	public String location;
	public String gstNo;
	public int distance;
	public double budget;
	
	
	public void bake(){
		System.out.println("Invoking bake() in Bakery");
	}
	
	public void bake(String bakeryName){
		System.out.println("Invoking bake(String) in Bakery");
	}
	
	public void bake(String bakeryName,String location){
		System.out.println("Invoking bake(String,String) in Bakery");
	}
	
	public void bake(String bakeryName,String location,String gstNo){
		System.out.println("Invoking bake(String,String,String) in Bakery");
	}
	
	public void bake(String bakeryName,String location,String gstNo,int distance){
		System.out.println("Invoking bake(String,String,int) in Bakery");
	}
	
	public void bake(String bakeryName,String location,String gstNo,int distance,double budget){
		System.out.println("Invoking bake(String,String,int,double) in Bakery");
	}


}
