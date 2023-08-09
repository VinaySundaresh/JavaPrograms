package com.xworkz.app;

public class ChurchStreet extends Street {
	@Override
	public void road() {
		System.out.println("invoking road() in ChurchStreet");
		super.road();
	}

	@Override
	public void road(String name) {
		System.out.println("invoking road(String) in ChurchStreet");
		super.road(name);
	}

	@Override
	public void road(String name, String loc) {
		System.out.println("invoking road(String,string) in ChurchStreet");
		super.road(name, loc);
	}

	@Override
	public void road(String name, String loc, boolean streetLight) {
		System.out.println("invoking road(string,string,boolean) in ChurchStreet");
		super.road(name, loc, streetLight);
	}

	@Override
	public void road(String name, String loc, boolean streetLight, int km) {
		System.out.println("invoking road(string,string,boolean,int) in ChurchStreet");
		super.road(name, loc, streetLight, km);
	}

	@Override
	public void road(String name, String loc, boolean streetLight, int km, String city) {
		System.out.println("invoking road(String,String,boolean,int,String) in ChurchStreet");
		super.road(name, loc, streetLight, km, city);
	}
}
