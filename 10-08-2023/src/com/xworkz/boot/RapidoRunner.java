package com.xworkz.boot;

import com.xworkz.app.Rapido;

public class RapidoRunner {

	public static void main(String[] args) {
		  // Create an instance of Rapido class
        Rapido myRapido = new Rapido();

        // Set properties using setter methods
        myRapido.setUsername("rapido_user");
        myRapido.setFullName("John Doe");
        myRapido.setEmail("john@example.com");
        myRapido.setMobileNumber("+1234567890");
        myRapido.setTotalRides(30);
        myRapido.setTotalPassengers(40);
        myRapido.setRegistered(true);
        myRapido.setLoggedIn(true);
        myRapido.setBikeTaxi(true);
        myRapido.setShareRide(false);
        myRapido.setProfilePicture("profile.jpg");
        myRapido.setPreferredLanguage("English");
        myRapido.setCurrentRide("Bike taxi");
        myRapido.setUpcomingRide("Office commute");

        // Get properties using getter methods
        System.out.println("Username: " + myRapido.getUsername());
        System.out.println("Full Name: " + myRapido.getFullName());
        System.out.println("Email: " + myRapido.getEmail());
        System.out.println("Mobile Number: " + myRapido.getMobileNumber());
        System.out.println("Total Rides: " + myRapido.getTotalRides());
        System.out.println("Total Passengers: " + myRapido.getTotalPassengers());
        System.out.println("Registered: " + myRapido.isRegistered());
        System.out.println("Logged In: " + myRapido.isLoggedIn());
        System.out.println("Bike Taxi: " + myRapido.isBikeTaxi());
        System.out.println("Share Ride: " + myRapido.isShareRide());
        System.out.println("Profile Picture: " + myRapido.getProfilePicture());
        System.out.println("Preferred Language: " + myRapido.getPreferredLanguage());
        System.out.println("Current Ride: " + myRapido.getCurrentRide());
        System.out.println("Upcoming Ride: " + myRapido.getUpcomingRide());
    }
	

}
