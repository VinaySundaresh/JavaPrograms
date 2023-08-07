package com.xworkz.app.Umbrella;

public class Umbrella {
	
	public String color;
	public double price;
	public char size;
	
	public void rain()
	{
		System.out.println("invoking rain() in Umbrella");
		rain("Green");
	}
	
	public void rain(String color)
	{
		System.out.println("invoking rain(String) in umbrella");
		System.out.println("Color of the umbrella is "+this.color);
	}
	
	public void rain(double price)
	{
		System.out.println("Invoking rain(double) in Umbrella");
		System.out.println("Pric eof the umbrella is "+this.price);
	}
	
	public void rain(char size)
	{
		System.out.println("invoking rain(char) in umbrella");
		System.out.println("Size of the umbrella is "+this.size);
		rain(color);
		rain(price);
	}

}
