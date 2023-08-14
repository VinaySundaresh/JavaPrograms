package com.xworkz.boot;

import com.xworkz.app.Uber;

public class UberRunner {

	public static void main(String[] args) {

	
		// Create an instance of Uber class
		Uber myUber = new Uber();

		// Set properties using setter methods
		myUber.setUsername("uber_user");
		myUber.setFullName("John Doe");
		myUber.setEmail("john@example.com");
		myUber.setMobileNumber("+1234567890");
		myUber.setTotalRides(50);
		myUber.setTotalPassengers(100);
		myUber.setRegistered(true);
		myUber.setLoggedIn(true);
		myUber.setUberX(true);
		myUber.setPool(false);
		myUber.setProfilePicture("profile.jpg");
		myUber.setPreferredLanguage("English");
		myUber.setCurrentRide("City commute");
		myUber.setUpcomingRide("Airport drop-off");

		// Get properties using getter methods
		System.out.println("Username: " + myUber.getUsername());
		System.out.println("Full Name: " + myUber.getFullName());
		System.out.println("Email: " + myUber.getEmail());
		System.out.println("Mobile Number: " + myUber.getMobileNumber());
		System.out.println("Total Rides: " + myUber.getTotalRides());
		System.out.println("Total Passengers: " + myUber.getTotalPassengers());
		System.out.println("Registered: " + myUber.isRegistered());
		System.out.println("Logged In: " + myUber.isLoggedIn());
		System.out.println("UberX: " + myUber.isUberX());
		System.out.println("Pool: " + myUber.isPool());
		System.out.println("Profile Picture: " + myUber.getProfilePicture());
		System.out.println("Preferred Language: " + myUber.getPreferredLanguage());
		System.out.println("Current Ride: " + myUber.getCurrentRide());
		System.out.println("Upcoming Ride: " + myUber.getUpcomingRide());
	}

}
