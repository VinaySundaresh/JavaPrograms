package com.xworkz.boot;

import com.xworkz.app.Cred;

public class CredRunner {

	public static void main(String[] args) {
		// Create an instance of Cred class
		Cred myCred = new Cred();

		// Set properties using setter methods
		myCred.setUsername("cred_user");
		myCred.setFullName("John Doe");
		myCred.setEmail("john@example.com");
		myCred.setCreditScore(750);
		myCred.setRewardsPoints(500);
		myCred.setCreditLimit(10000.0);
		myCred.setCurrentBalance(2500.0);
		myCred.setRegistered(true);
		myCred.setActive(true);
		myCred.setRewardsMember(true);
		myCred.setCreditCardHolder(true);
		myCred.setProfilePicture("profile.jpg");
		myCred.setPreferredPaymentMethod("Credit Card");
		myCred.setCurrentTransaction("Purchase at XYZ Store");

		// Get properties using getter methods
		System.out.println("Username: " + myCred.getUsername());
		System.out.println("Full Name: " + myCred.getFullName());
		System.out.println("Email: " + myCred.getEmail());
		System.out.println("Credit Score: " + myCred.getCreditScore());
		System.out.println("Rewards Points: " + myCred.getRewardsPoints());
		System.out.println("Credit Limit: " + myCred.getCreditLimit());
		System.out.println("Current Balance: " + myCred.getCurrentBalance());
		System.out.println("Registered: " + myCred.isRegistered());
		System.out.println("Active: " + myCred.isActive());
		System.out.println("Rewards Member: " + myCred.isRewardsMember());
		System.out.println("Credit Card Holder: " + myCred.isCreditCardHolder());
		System.out.println("Profile Picture: " + myCred.getProfilePicture());
		System.out.println("Preferred Payment Method: " + myCred.getPreferredPaymentMethod());
		System.out.println("Current Transaction: " + myCred.getCurrentTransaction());

	}

}
