package com.xworkz.boot;

import com.xworkz.app.Hotel;
import com.xworkz.app.Restaurent;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Hotelrunner");
		
		System.out.println("-----------------------------------------------------------");
		
		Hotel hotel=new Restaurent();
		hotel.dish();
		hotel.dish("Sagar Hotel");
		hotel.dish("Shanti Sagar", "RajajiNAgar");
		hotel.dish("Shanti Sagar", "RajajiNAgar", 4);
		hotel.dish("Shanti sgar", "RajajiNagar", 2, 1200.0);
		

	}

}
