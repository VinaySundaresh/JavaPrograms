package com.xworkz.app;

public abstract class Car {

    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    public void accelerate() {
        System.out.println("Accelerating");
    }

    public void brake() {
        System.out.println("Braking");
    }

    public abstract void refuel();

    public abstract void getMileage();

    public abstract String getColor();

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}


