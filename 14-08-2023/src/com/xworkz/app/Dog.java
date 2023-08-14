package com.xworkz.app;

public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Dog is barking");
	}

	@Override
	public String getSpecies() {
		return "Canine";
	}

	@Override
	public String getHabitat() {
		return "Domestic";
	}

	@Override
	public void eatFood() {
		System.out.println("Dog is eating dog food");
	}

	@Override
	public void sleepHours() {
		System.out.println("Dog sleeps about 12-14 hours");
	}
}
