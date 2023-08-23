package com.xworkz.app;

public class IndianMilitary implements Military {

	@Override
	public void protects() {
		System.out.println("invoking protects() in IndianMilitary");
	}

	@Override
	public String sacrifice() {
		System.out.println("Invoking sacrifice() in IndianMilitary");
		return null;
	}

	@Override
	public void lastWar() {
		System.out.println("invoking lastWar() in IndianMilitary");
	}

}
