package com.xworkz.boot;

import com.xworkz.app.IRCTC;

public class IRCTCRunner {

	public static void main(String[] args) {
		// Create an instance of IRCTC class
		IRCTC myIRCTC = new IRCTC();

		// Set properties using setter methods
		myIRCTC.setUsername("irctc_user");
		myIRCTC.setFullName("John Doe");
		myIRCTC.setEmail("john@example.com");
		myIRCTC.setMobileNumber("+1234567890");
		myIRCTC.setTotalBookings(10);
		myIRCTC.setTotalPassengers(20);
		myIRCTC.setRegistered(true);
		myIRCTC.setLoggedIn(true);
		myIRCTC.setSpecialTrainBooking(false);
		myIRCTC.setTatkalBooking(true);
		myIRCTC.setProfilePicture("profile.jpg");
		myIRCTC.setPreferredLanguage("English");
		myIRCTC.setCurrentBooking("Rajdhani Express");
		myIRCTC.setUpcomingJourney("Shatabdi Express");

		// Get properties using getter methods
		System.out.println("Username: " + myIRCTC.getUsername());
		System.out.println("Full Name: " + myIRCTC.getFullName());
		System.out.println("Email: " + myIRCTC.getEmail());
		System.out.println("Mobile Number: " + myIRCTC.getMobileNumber());
		System.out.println("Total Bookings: " + myIRCTC.getTotalBookings());
		System.out.println("Total Passengers: " + myIRCTC.getTotalPassengers());
		System.out.println("Registered: " + myIRCTC.isRegistered());
		System.out.println("Logged In: " + myIRCTC.isLoggedIn());
		System.out.println("Special Train Booking: " + myIRCTC.isSpecialTrainBooking());
		System.out.println("Tatkal Booking: " + myIRCTC.isTatkalBooking());
		System.out.println("Profile Picture: " + myIRCTC.getProfilePicture());
		System.out.println("Preferred Language: " + myIRCTC.getPreferredLanguage());
		System.out.println("Current Booking: " + myIRCTC.getCurrentBooking());
		System.out.println("Upcoming Journey: " + myIRCTC.getUpcomingJourney());
	}

}
