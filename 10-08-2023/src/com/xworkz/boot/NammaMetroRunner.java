package com.xworkz.boot;

import com.xworkz.app.NammaMetro;

public class NammaMetroRunner {

	public static void main(String[] args) {
		// Create an instance of NammaMetro class
		NammaMetro myNammaMetro = new NammaMetro();

		// Set properties using setter methods
		myNammaMetro.setUsername("nammametro_user");
		myNammaMetro.setFullName("John Doe");
		myNammaMetro.setEmail("john@example.com");
		myNammaMetro.setMobileNumber("+1234567890");
		myNammaMetro.setTotalJourneys(50);
		myNammaMetro.setTotalPassengers(100);
		myNammaMetro.setRegistered(true);
		myNammaMetro.setLoggedIn(true);
		myNammaMetro.setAirConditioned(true);
		myNammaMetro.setWheelchairAccessible(false);
		myNammaMetro.setProfilePicture("profile.jpg");
		myNammaMetro.setPreferredLanguage("English");
		myNammaMetro.setCurrentJourney("Daily commute");
		myNammaMetro.setUpcomingJourney("Weekend outing");

		// Get properties using getter methods
		System.out.println("Username: " + myNammaMetro.getUsername());
		System.out.println("Full Name: " + myNammaMetro.getFullName());
		System.out.println("Email: " + myNammaMetro.getEmail());
		System.out.println("Mobile Number: " + myNammaMetro.getMobileNumber());
		System.out.println("Total Journeys: " + myNammaMetro.getTotalJourneys());
		System.out.println("Total Passengers: " + myNammaMetro.getTotalPassengers());
		System.out.println("Registered: " + myNammaMetro.isRegistered());
		System.out.println("Logged In: " + myNammaMetro.isLoggedIn());
		System.out.println("Air Conditioned: " + myNammaMetro.isAirConditioned());
		System.out.println("Wheelchair Accessible: " + myNammaMetro.isWheelchairAccessible());
		System.out.println("Profile Picture: " + myNammaMetro.getProfilePicture());
		System.out.println("Preferred Language: " + myNammaMetro.getPreferredLanguage());
		System.out.println("Current Journey: " + myNammaMetro.getCurrentJourney());
		System.out.println("Upcoming Journey: " + myNammaMetro.getUpcomingJourney());
	}

}
