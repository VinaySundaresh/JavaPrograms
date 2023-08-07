package com.xworkz.app.Gadget;

public class Gadget {

	
	public String type;
	public double price;
	public char size;
	
	
	public void works()
	{
		System.out.println("invoking works() in Gadget");
	}
	
	public void works(String type)
	{
		System.out.println("invoking works(string) in Gadget");
		System.out.println("Type of the gadget is "+this.type);
		works();
	}
	
	public void works(String type,double price)
	{
		System.out.println("Invoking works(string,double) in Gadget");
		works("Technical");
		System.out.println("Price of the gadget is "+this.price);
	}
	
	public void works(String type,double price,char size)
	{
		System.out.println("Invoking works(string,double) in Gadget");
		works("Technical");
		works("Non-Technical",10000.0);
		System.out.println("Size of the Gadget is "+this.size);
	}
	
	
	
}
