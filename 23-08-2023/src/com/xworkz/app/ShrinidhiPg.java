package com.xworkz.app;

public class ShrinidhiPg implements Pg {

	@Override
	public void name() {
		System.out.println("invoking name() in ShrinidhiPg");
	}

	@Override
	public int costEffective() {
		System.out.println("Invoking costEffective() in ShrinidhiPg");
		return 0;
	}

	@Override
	public boolean neat() {
		System.out.println("invoking neat() in  ShrinidhiPg  ");
		return false;
	}

}
