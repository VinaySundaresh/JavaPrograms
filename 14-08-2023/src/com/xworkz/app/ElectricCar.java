package com.xworkz.app;

public class ElectricCar extends Car{
	private String batteryCapacity;

	public ElectricCar(String make, String model, String batteryCapacity) {
		super(make, model);
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public void refuel() {
		System.out.println("Charging the electric car");
	}

	@Override
	public void getMileage() {
		System.out.println("Electric cars have no mileage, they use energy");
	}

	@Override
	public String getColor() {
		return "Electric cars come in various colors";
	}

}
