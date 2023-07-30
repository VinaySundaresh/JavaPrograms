package com.xworkz.app;

public class Watchman {
	public Gun gun;
	public void secure()
	{
		//System.out.println("Invoking secure in WatchMan");
		if(gun!=null)
		{
			System.out.println("invoking secure in Watchman");
			gun.shoot();
		}
		else{
			System.out.println("Gun is pointing to null ");
		}
	}

}
