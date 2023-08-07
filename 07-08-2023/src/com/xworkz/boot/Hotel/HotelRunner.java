package com.xworkz.boot.Hotel;

import com.xworkz.app.Hotel.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HotelRunner");
		System.out.println("------------------------------------------------------");
		
		
		Hotel hotel=new Hotel();
		
		//System.out.println("------------------------------------------------------");
		
		hotel.dish("Idli",520.0);

	}

}
