package com.xworkz.app;

public class GanapathiTemple implements Temple {

	@Override
	public String templeName() {
		System.out.println("Invoking templeName() in GanapathiTemple");
		return null;
	}

	@Override
	public int distance() {
		System.out.println("Invoking distance() in GanapathiTemple");
		return 0;
	}

	@Override
	public void pray() {
		System.out.println("Invoking pray() in GanapathiTemple");
	}



}
