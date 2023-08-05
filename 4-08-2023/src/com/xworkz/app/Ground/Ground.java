package com.xworkz.app.Ground;

public class Ground {

	public String name;
	public String location;
	public String nearMetroStation;
	public String shape;
	
	public Ground() {
		this("Nehru stadium","SHivamogga","No","Round");
		System.out.println("invoking no-arg const in Ground");
	}
	
	public Ground(String name,String location,String nearMetroStation,String shape)
	{
		System.out.println("Invoking String,String,String,String const in Ground");
		this.location=location;
		this.nearMetroStation=nearMetroStation;
		this.name=name;
		this.shape=shape;
	}

}
