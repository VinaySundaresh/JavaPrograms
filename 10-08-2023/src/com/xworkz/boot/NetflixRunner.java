package com.xworkz.boot;

import com.xworkz.app.Netflix;

public class NetflixRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Netflix myNetflix = new Netflix();

		// Set properties using setter methods
		myNetflix.setUsername("netflix_user");
		myNetflix.setFullName("John Doe");
		myNetflix.setEmail("john@example.com");
		myNetflix.setTotalWatchedShows(30);
		myNetflix.setTotalWatchedMovies(50);
		myNetflix.setTotalDevices(3);
		myNetflix.setTotalProfiles(2);
		myNetflix.setPremium(true);
		myNetflix.setSubscribed(true);
		myNetflix.setKidsMode(false);
		myNetflix.setAutoPlayEnabled(true);
		myNetflix.setProfilePicture("profile.jpg");
		myNetflix.setBillingMethod("Credit Card");
		myNetflix.setCurrentWatchedItem("Stranger Things");

		// Get properties using getter methods
		System.out.println("Username: " + myNetflix.getUsername());
		System.out.println("Full Name: " + myNetflix.getFullName());
		System.out.println("Email: " + myNetflix.getEmail());
		System.out.println("Total Watched Shows: " + myNetflix.getTotalWatchedShows());
		System.out.println("Total Watched Movies: " + myNetflix.getTotalWatchedMovies());
		System.out.println("Total Devices: " + myNetflix.getTotalDevices());
		System.out.println("Total Profiles: " + myNetflix.getTotalProfiles());
		System.out.println("Premium: " + myNetflix.isPremium());
		System.out.println("Subscribed: " + myNetflix.isSubscribed());
		System.out.println("Kids Mode: " + myNetflix.isKidsMode());
		System.out.println("Auto Play Enabled: " + myNetflix.isAutoPlayEnabled());
		System.out.println("Profile Picture: " + myNetflix.getProfilePicture());
		System.out.println("Billing Method: " + myNetflix.getBillingMethod());
		System.out.println("Current Watched Item: " + myNetflix.getCurrentWatchedItem());
	}

}
