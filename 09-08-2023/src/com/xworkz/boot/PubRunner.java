package com.xworkz.boot;

import com.xworkz.app.Beer;
import com.xworkz.app.Pub;

public class PubRunner {

	public static void main(String[] args) {
		System.out.println("inovoking main in PubRunner");
		
		Pub pub=new Pub();
		pub.dance();
		pub.dance("Babylonia");
		pub.dance("BABYLONIA", 6);
		pub.dance("BABYLONIA", 6,5);
		pub.dance("BABYLONIA", 6, 5, "RajajiNAGAR");
		pub.dance("BABYLONIA", 6, 5, "RajajiNAGAR",1000.0);		
		
		System.out.println("----------------------------------------------------------");
		
		Beer b=new Beer();
		b.dance();
		b.dance("Babylonia");
		b.dance("BABYLONIA", 6);
		b.dance("BABYLONIA", 6,5);
		b.dance("BABYLONIA", 6, 5, "RajajiNAGAR");
		b.dance("BABYLONIA", 6, 5, "RajajiNAGAR",1000.0);		
	}

}
