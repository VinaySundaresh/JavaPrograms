package com.xworkz.Association.boot;

import com.xworkz.Association.app.Farmer;
import com.xworkz.Association.app.Land;

public class FarmerRunner {

	public static void main(String[] args) {


		System.out.println("ivnoking main() in FarmerRunner");
		
		String name="Vinay";
		Land land=new Land();
		
		Farmer farmer =new Farmer(name);
		farmer.setLand(land);
		
		farmer.farming();
		
	}

}
