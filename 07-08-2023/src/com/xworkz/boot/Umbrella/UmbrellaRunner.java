package com.xworkz.boot.Umbrella;

import com.xworkz.app.Umbrella.Umbrella;

public class UmbrellaRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in UmbrellRUnner");
		
		Umbrella umbrella=new Umbrella();
		umbrella.rain('s');

	}

}
