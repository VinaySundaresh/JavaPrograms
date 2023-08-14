package com.xworkz.boot;

import com.xworkz.app.RedBus;

public class RedBusRunner {

	public static void main(String[] args) {
		// Create an instance of RedBus class
        RedBus myRedBus = new RedBus();

        // Set properties using setter methods
        myRedBus.setUsername("redbus_user");
        myRedBus.setFullName("John Doe");
        myRedBus.setEmail("john@example.com");
        myRedBus.setMobileNumber("+1234567890");
        myRedBus.setTotalBookings(10);
        myRedBus.setTotalPassengers(20);
        myRedBus.setRegistered(true);
        myRedBus.setLoggedIn(true);
        myRedBus.setRoundTrip(true);
        myRedBus.setSleeper(false);
        myRedBus.setProfilePicture("profile.jpg");
        myRedBus.setPreferredLanguage("English");
        myRedBus.setCurrentBooking("Delhi to Mumbai");
        myRedBus.setUpcomingJourney("Bangalore to Chennai");

        // Get properties using getter methods
        System.out.println("Username: " + myRedBus.getUsername());
        System.out.println("Full Name: " + myRedBus.getFullName());
        System.out.println("Email: " + myRedBus.getEmail());
        System.out.println("Mobile Number: " + myRedBus.getMobileNumber());
        System.out.println("Total Bookings: " + myRedBus.getTotalBookings());
        System.out.println("Total Passengers: " + myRedBus.getTotalPassengers());
        System.out.println("Registered: " + myRedBus.isRegistered());
        System.out.println("Logged In: " + myRedBus.isLoggedIn());
        System.out.println("Round Trip: " + myRedBus.isRoundTrip());
        System.out.println("Sleeper: " + myRedBus.isSleeper());
        System.out.println("Profile Picture: " + myRedBus.getProfilePicture());
        System.out.println("Preferred Language: " + myRedBus.getPreferredLanguage());
        System.out.println("Current Booking: " + myRedBus.getCurrentBooking());
        System.out.println("Upcoming Journey: " + myRedBus.getUpcomingJourney());
	}

}
