package com.xworkz.boot;

import com.xworkz.app.PUBG;

public class PUBGRunner {

	public static void main(String[] args) {
		// Create an instance of PUBG class
		PUBG myPUBG = new PUBG();

		// Set properties using setter methods
		myPUBG.setUsername("pubg_user");
		myPUBG.setFullName("John Doe");
		myPUBG.setLevel(50);
		myPUBG.setTotalMatchesPlayed(1000);
		myPUBG.setTotalKills(500);
		myPUBG.setTotalWins(50);
		myPUBG.setTotalRevives(200);
		myPUBG.setTotalTop10(150);
		myPUBG.setPremiumPassHolder(true);
		myPUBG.setBanned(false);
		myPUBG.setSquadUp(true);
		myPUBG.setStreamerModeEnabled(false);
		myPUBG.setProfilePicture("profile.jpg");
		myPUBG.setCurrentMatch("Erangel");

		// Get properties using getter methods
		System.out.println("Username: " + myPUBG.getUsername());
		System.out.println("Full Name: " + myPUBG.getFullName());
		System.out.println("Level: " + myPUBG.getLevel());
		System.out.println("Total Matches Played: " + myPUBG.getTotalMatchesPlayed());
		System.out.println("Total Kills: " + myPUBG.getTotalKills());
		System.out.println("Total Wins: " + myPUBG.getTotalWins());
		System.out.println("Total Revives: " + myPUBG.getTotalRevives());
		System.out.println("Total Top 10: " + myPUBG.getTotalTop10());
		System.out.println("Premium Pass Holder: " + myPUBG.isPremiumPassHolder());
		System.out.println("Banned: " + myPUBG.isBanned());
		System.out.println("Squad Up: " + myPUBG.isSquadUp());
		System.out.println("Streamer Mode Enabled: " + myPUBG.isStreamerModeEnabled());
		System.out.println("Profile Picture: " + myPUBG.getProfilePicture());
		System.out.println("Current Match: " + myPUBG.getCurrentMatch());
	}

}
