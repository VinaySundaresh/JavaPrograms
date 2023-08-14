package com.xworkz.boot;

import com.xworkz.app.Snapchat;

public class SnapchatRunner {

	public static void main(String[] args) {
		// Create an instance of Snapchat class
		Snapchat mySnapchat = new Snapchat();

		// Set properties using setter methods
		mySnapchat.setUsername("snap_user");
		mySnapchat.setDisplayName("Snap User");
		mySnapchat.setBio("Exploring the world through snaps");
		mySnapchat.setScore(1500);
		mySnapchat.setStreak(20);
		mySnapchat.setTotalSnapsSent(500);
		mySnapchat.setTotalSnapsReceived(600);
		mySnapchat.setTotalFriends(200);
		mySnapchat.setPrivate(false);
		mySnapchat.setVerified(true);
		mySnapchat.setProfilePicture("profile.jpg");
		mySnapchat.setWebsite("https://www.snapuser.com");
		mySnapchat.setCurrentStatus("Traveling");
		mySnapchat.setCurrentFilter("Dog Ears");

		// Get properties using getter methods
		System.out.println("Username: " + mySnapchat.getUsername());
		System.out.println("Display Name: " + mySnapchat.getDisplayName());
		System.out.println("Bio: " + mySnapchat.getBio());
		System.out.println("Score: " + mySnapchat.getScore());
		System.out.println("Streak: " + mySnapchat.getStreak());
		System.out.println("Total Snaps Sent: " + mySnapchat.getTotalSnapsSent());
		System.out.println("Total Snaps Received: " + mySnapchat.getTotalSnapsReceived());
		System.out.println("Total Friends: " + mySnapchat.getTotalFriends());
		System.out.println("Private: " + mySnapchat.isPrivate());
		System.out.println("Verified: " + mySnapchat.isVerified());
		System.out.println("Profile Picture: " + mySnapchat.getProfilePicture());
		System.out.println("Website: " + mySnapchat.getWebsite());
		System.out.println("Current Status: " + mySnapchat.getCurrentStatus());
		System.out.println("Current Filter: " + mySnapchat.getCurrentFilter());

	}

}
