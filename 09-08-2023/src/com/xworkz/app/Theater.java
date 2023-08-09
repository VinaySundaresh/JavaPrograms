package com.xworkz.app;

public class Theater {
	
	public String tName;
	public String location;
	public double cost;
	public int distance;
	public double budget;
	
	
	public void watch(){
		System.out.println("Invoking  watch() in Theater");
	}
	
	public void watch(String tName){
		System.out.println("Invoking watch(String) in Theater");
	}
	
	public void watch(String bakeryName,String location){
		System.out.println("Invoking watch(string,string) in Theater");
	}
	
	public void watch(String bakeryName,String location,double cost){
		System.out.println("Invoking watch(string,string ,double) in Theater");
	}
	
	public void watch(String bakeryName,String location,double cost,int distance){
		System.out.println("Invoking watch(string,string,string,double) in Theater");
	}
	
	public void watch(String bakeryName,String location,double cost,int distance,double budget){
		System.out.println("Invoking watch(string,string,double,int,double) in Theater");
	}


}
