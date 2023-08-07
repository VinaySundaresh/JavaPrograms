package com.xworkz.app.Specs;

public class Specs {
	
	public String type;
	public int thickness;
	
	public void lens()
	{
		System.out.println("Invoking lens() in Specs");
	}
	
	public void lens(String type)
	{
		System.out.println("invoking lens(String) in Specs");
		System.out.println("Type of the lens "+this.type);
		lens();
	}
	
	public void lens(String type,int thickness)
	{
		System.out.println("invoking lens(String,int ) in Specs");
		System.out.println("Type of the lens "+this.type);
		System.out.println("Thickness of the lens "+this.thickness);
		lens(type);
	}
	
	public void lens(int thickness)
	{
		System.out.println("invoking lens(int) in lens");
		lens(type);
	}

}
