package com.xworkz.boot.seven_level_inheritance;

import com.xworkz.app.seven_Level.PremiumCertifiedOrganicWildMountainBlueberry;

public class FoodRunner {

	public static void main(String[] args) {
		 PremiumCertifiedOrganicWildMountainBlueberry blueberry = new PremiumCertifiedOrganicWildMountainBlueberry("Blueberry", "Blue", true, true, true, true, true, true, true);
	       
		 System.out.println("_____________________________________________________________________________");
		 blueberry.displayInfo();

	}

}
