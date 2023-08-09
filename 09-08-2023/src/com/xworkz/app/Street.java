package com.xworkz.app;

public class Street {
	
	public String name;
	public String loc;
	public boolean streetLight;
	public int km;
	public String city;
	
	public void road()
	{
		System.out.println("invoking road() in Street");
		
	}
	
	public void road(String name)
	{
		System.out.println("invoking road(string) in Street");
		
	}
	
	public void road(String name,String loc)
	{
		System.out.println("invoking road(string,string) in Street");
		
	}
	
	public void road(String name,String loc,boolean streetLight)
	{
		System.out.println("invoking road(string,string,boolean) in Street");
		
	}
	
	public void road(String name,String loc,boolean streetLight,int km)
	{
		System.out.println("invoking road(string,string,boolean,int) in Street");
		
	}
	
	public void road(String name,String loc,boolean streetLight,int km,String city)
	{
		System.out.println("invoking road(string,string,boolean,int,String) in Street");
		
	}
	


}
