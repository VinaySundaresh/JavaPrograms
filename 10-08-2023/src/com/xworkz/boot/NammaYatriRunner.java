package com.xworkz.boot;

import com.xworkz.app.NammaYatri;

public class NammaYatriRunner {

	public static void main(String[] args) {
		// Create an instance of NammaYatri class
        NammaYatri myNammaYatri = new NammaYatri();

        // Set properties using setter methods
        myNammaYatri.setUsername("nammayatri_user");
        myNammaYatri.setFullName("John Doe");
        myNammaYatri.setEmail("john@example.com");
        myNammaYatri.setMobileNumber("+1234567890");
        myNammaYatri.setTotalTrips(20);
        myNammaYatri.setTotalPassengers(30);
        myNammaYatri.setRegistered(true);
        myNammaYatri.setLoggedIn(true);
        myNammaYatri.setEcoFriendly(true);
        myNammaYatri.setRoundTrip(false);
        myNammaYatri.setProfilePicture("profile.jpg");
        myNammaYatri.setPreferredLanguage("English");
        myNammaYatri.setCurrentTrip("Eco-friendly commute");
        myNammaYatri.setUpcomingTrip("City exploration");

        // Get properties using getter methods
        System.out.println("Username: " + myNammaYatri.getUsername());
        System.out.println("Full Name: " + myNammaYatri.getFullName());
        System.out.println("Email: " + myNammaYatri.getEmail());
        System.out.println("Mobile Number: " + myNammaYatri.getMobileNumber());
        System.out.println("Total Trips: " + myNammaYatri.getTotalTrips());
        System.out.println("Total Passengers: " + myNammaYatri.getTotalPassengers());
        System.out.println("Registered: " + myNammaYatri.isRegistered());
        System.out.println("Logged In: " + myNammaYatri.isLoggedIn());
        System.out.println("Eco-Friendly: " + myNammaYatri.isEcoFriendly());
        System.out.println("Round Trip: " + myNammaYatri.isRoundTrip());
        System.out.println("Profile Picture: " + myNammaYatri.getProfilePicture());
        System.out.println("Preferred Language: " + myNammaYatri.getPreferredLanguage());
        System.out.println("Current Trip: " + myNammaYatri.getCurrentTrip());
        System.out.println("Upcoming Trip: " + myNammaYatri.getUpcomingTrip());
    }
	

}
