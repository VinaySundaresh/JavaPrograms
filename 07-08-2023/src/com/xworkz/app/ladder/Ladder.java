package com.xworkz.app.ladder;

public class Ladder {
	
	public String material;
	public double price;
	public int noOfSteps;
	
	public void purpose()
	{
		System.out.println("invoking purpose() in Ladder");
	}
	
	public void purpose(String material)
	{
		System.out.println("invoking purpose(String) in Ladder");
		System.out.println("material of the ladder is "+this.material);
		purpose();
	}
	
	public void purpose(String material,double price)
	{
		System.out.println("invoking purpose(string,double) in Ladder");
		purpose("Wood");
		System.out.println("Price of the ladder is "+this.price);
	}
	
	public void purpose(String material,double price,int noOfSteps)
	{
		System.out.println("invoking purpose(string,double) in Ladder");
		purpose("Plastic");
		purpose("FIbre",1500);
	}
	
	

}
