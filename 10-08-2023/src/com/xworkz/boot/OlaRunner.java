package com.xworkz.boot;

import com.xworkz.app.Ola;

public class OlaRunner {

	public static void main(String[] args) {
		// Create an instance of Ola class
		Ola myOla = new Ola();

		// Set properties using setter methods
		myOla.setUsername("ola_user");
		myOla.setFullName("John Doe");
		myOla.setEmail("john@example.com");
		myOla.setMobileNumber("+1234567890");
		myOla.setTotalRides(100);
		myOla.setTotalPassengers(200);
		myOla.setRegistered(true);
		myOla.setLoggedIn(true);
		myOla.setPrimeMember(true);
		myOla.setRentalBooking(false);
		myOla.setProfilePicture("profile.jpg");
		myOla.setPreferredLanguage("English");
		myOla.setCurrentRide("Office commute");
		myOla.setUpcomingRide("Airport pickup");

		// Get properties using getter methods
		System.out.println("Username: " + myOla.getUsername());
		System.out.println("Full Name: " + myOla.getFullName());
		System.out.println("Email: " + myOla.getEmail());
		System.out.println("Mobile Number: " + myOla.getMobileNumber());
		System.out.println("Total Rides: " + myOla.getTotalRides());
		System.out.println("Total Passengers: " + myOla.getTotalPassengers());
		System.out.println("Registered: " + myOla.isRegistered());
		System.out.println("Logged In: " + myOla.isLoggedIn());
		System.out.println("Prime Member: " + myOla.isPrimeMember());
		System.out.println("Rental Booking: " + myOla.isRentalBooking());
		System.out.println("Profile Picture: " + myOla.getProfilePicture());
		System.out.println("Preferred Language: " + myOla.getPreferredLanguage());
		System.out.println("Current Ride: " + myOla.getCurrentRide());
		System.out.println("Upcoming Ride: " + myOla.getUpcomingRide());
	}

}
