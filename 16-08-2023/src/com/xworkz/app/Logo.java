package com.xworkz.app;

public class Logo {

	private String type;
	private String material;
	private int price;
	private String brand;
	private char size;

	public Logo() {
		super();
		System.out.println("Invoking logo() in Logo");
	}

	public Logo(String type, String material, int price) {
		super();
		this.type = type;
		this.material = material;
		this.price = price;
	}

	public Logo(String type, String material, int price, String brand, char size) {
		super();
		this.type = type;
		this.material = material;
		this.price = price;
		this.brand = brand;
		this.size = size;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Type :"+this.type+" Material :"+this.material+" Price :"+this.price+" Brand : "+this.brand+" Size :"+this.size;
	}

}
