package com.xworkz.boot;

import com.xworkz.app.Watchman;

public class GunRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in GunRunner");
		Watchman watchman=new Watchman();
		watchman.secure();
		
	}

}
