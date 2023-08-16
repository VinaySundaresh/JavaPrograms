package com.xworkz.app;

public class Flag {
	private String colour;
	private int cost;
	private int length;

	
	public Flag() {
		super();
		System.out.println("Invoking no-arg const in Flag");
	}

	public Flag(String colour, int cost, int length) {
		System.out.println("Invking string,int,int const in Flag");
		this.colour = colour;
		this.cost = cost;
		this.length = length;
	}

	public Flag(String colour, int cost) {
		super();
		this.colour = colour;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Color :" + this.colour + "Cost : " + this.cost + "Length : " + this.length;
	}

}
