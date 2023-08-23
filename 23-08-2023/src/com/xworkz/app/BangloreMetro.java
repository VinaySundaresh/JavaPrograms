package com.xworkz.app;

public class BangloreMetro implements Metro {

	@Override
	public String runs() {
		System.out.println("Invoking runs() in BangloreMetro");
		return null;
	}

	@Override
	public int speed() {
		System.out.println("Invoking speed() in BangloreMetro");
		return 0;
	}

	@Override
	public boolean night() {
		System.out.println("Invoking night() in BangloreMetro");
		return false;
	}

}
