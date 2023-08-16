package com.xworkz.app;

public class Cave {

	private String name;
	private String type;
	private String size;
	private String shape;
	private String geologicalFeatures;
	private boolean hasBats;
	private double temperature;
	private double humidity;
	private boolean explored;
	private boolean openForTourism;

	
	public Cave() {
		super();
		System.out.println("Invoking no-arg const in Cave");
	}

	

	public Cave(String name, String type, String size, String shape, String geologicalFeatures, boolean hasBats) {
		super();
		this.name = name;
		this.type = type;
		this.size = size;
		this.shape = shape;
		this.geologicalFeatures = geologicalFeatures;
		this.hasBats = hasBats;
	}



	public Cave(String name, String type, String size, String shape, String geologicalFeatures, boolean hasBats,
			double temperature, double humidity, boolean explored, boolean openForTourism) {
		this.name = name;
		this.type = type;
		this.size = size;
		this.shape = shape;
		this.geologicalFeatures = geologicalFeatures;
		this.hasBats = hasBats;
		this.temperature = temperature;
		this.humidity = humidity;
		this.explored = explored;
		this.openForTourism = openForTourism;
	}



	@Override
	public String toString() {
		return "Cave [name=" + name + ", type=" + type + ", size=" + size + ", shape=" + shape + ", geologicalFeatures="
				+ geologicalFeatures + ", hasBats=" + hasBats + ", temperature=" + temperature + ", humidity="
				+ humidity + ", explored=" + explored + ", openForTourism=" + openForTourism + "]";
	}
	
	

}
