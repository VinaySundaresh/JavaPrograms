package com.xworkz.boot;

import com.xworkz.app.ApartmentRule;
import com.xworkz.app.BuildApartmentRule;
import com.xworkz.app.CommonApartmentRule;
import com.xworkz.app.PurchaseApartmentRule;
import com.xworkz.app.Class.PrestigeApartmentRule;

public class ApartmentRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main() in ApartmentRunner");
		
		ApartmentRule rule=new PrestigeApartmentRule();
		PurchaseApartmentRule rule1=new PrestigeApartmentRule();
		CommonApartmentRule rule3=new PrestigeApartmentRule();
		BuildApartmentRule rule4=new PrestigeApartmentRule();
		
		rule1.construct();
		rule.construct();
		rule3.construct();
		rule4.construct();


		

	}

}
