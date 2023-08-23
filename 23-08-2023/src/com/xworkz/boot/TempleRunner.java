package com.xworkz.boot;

import com.xworkz.app.GanapathiTemple;
import com.xworkz.app.Temple;

public class TempleRunner {

	public static void main(String[] args) {
		System.out.println("invking main() in TmTempleRunner");
		
		Temple temple=new GanapathiTemple();
		temple.distance();
		temple.pray();
		temple.templeName();
	}

}
