package com.xworkz.app;

public abstract class Animal {
	
	 private String name;
	    private int age;

	    public Animal(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public abstract void makeSound();
	    public abstract String getSpecies();
	    public abstract String getHabitat();
	    public abstract void eatFood();
	    public abstract void sleepHours();

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Species: " + getSpecies());
	        System.out.println("Habitat: " + getHabitat());
	    }
}
