package com.xworkz.app.Hotel;

public class Hotel {
	
	public String dishName;
	public double price;
	public String location;
	
	public void dish()
	{
		System.out.println("invoking no-arg dish in Hotel");
		System.out.println("The dish name is "+this.dishName);
		System.out.println("price of the dish is "+this.price);
		System.out.println("Location of the hotel is "+this.location);
		dish("Dosa");
		dish(120.0);
		
	}
	
	public void dish(String dishName)
	{
		System.out.println("invoking string dish in Hotel");
		System.out.println("The dish name is "+this.dishName);
		
	}
	
	public void dish(double price)
	{
		System.out.println("invoking double price in Hotel");
		System.out.println("The price of the dish is"+this.price);
	}
	
	public void dish(String dishName,double price)
	{
		System.out.println("invoking string,double dish in Hotel");
		//System.out.println("The dish name is "+this.dishName);
		//System.out.println("The price of the dish is"+this.price);
		dish(this.price);
		dish(this.dishName);
	}
	

}
