package com.xworkz.app.ironbox;

public class IronBox {

	public String brand;
	public String options;
	public double price;
	
	public void heater()
	{
		System.out.println("Invoking heater() in IronBox");
		heater("Bajaj");
		heater("Bajaj","L");
	}
	
	public void heater(String brand)
	{
		System.out.println("Invoking string-heater in IronBox");
		System.out.println("brand of the iron box is "+this.brand);
		System.out.println("----------------------------------------------------");
	}
	
	public void heater(String brand,String options)
	{
		System.out.println("Invoking string,string heater in IronBox");
		System.out.println("Brand of the iron box is "+this.brand);
		System.out.println("options provided for iron box is "+this.options);
		this.heater("Nike", "L,M,H",12000.0);
		//System.out.println("----------------------------------------------------");
	}
	
	public void heater(String brand,String options,double price)
	{
		System.out.println("invoking String,string,double heater in IronBox ");
		System.out.println("Brand of the iron box is "+this.brand);
		System.out.println("options provided for iron box is "+this.options);
		System.out.println("Price for the ironBox is "+this.price);
		heater(brand);
		//System.out.println("----------------------------------------------------");
	}
	
	
}
