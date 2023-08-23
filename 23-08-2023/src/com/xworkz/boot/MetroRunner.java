package com.xworkz.boot;

import com.xworkz.app.BangloreMetro;
import com.xworkz.app.Metro;

public class MetroRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in MetroRunner");
		
		Metro metro=new BangloreMetro();
		metro.runs();
		metro.night();
		metro.speed();
		

	}

}
