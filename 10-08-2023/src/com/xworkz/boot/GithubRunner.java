package com.xworkz.boot;

import com.xworkz.app.Github;

public class GithubRunner {

	public static void main(String[] args) {
		// Create an instance of Github class
		Github myGithub = new Github();

		// Set properties using setter methods
		myGithub.setUsername("github_user");
		myGithub.setFullName("GitHub User");
		myGithub.setBio("Open source enthusiast");
		myGithub.setRepositories(50);
		myGithub.setFollowers(1000);
		myGithub.setFollowing(200);
		myGithub.setContributions(1000);
		myGithub.setStarsReceived(500);
		myGithub.setStarsGiven(300);
		myGithub.setDeveloper(true);
		myGithub.setVerified(true);
		myGithub.setProfilePicture("profile.jpg");
		myGithub.setWebsite("https://www.githubuser.com");
		myGithub.setCurrentProject("AwesomeApp");

		// Get properties using getter methods
		System.out.println("Username: " + myGithub.getUsername());
		System.out.println("Full Name: " + myGithub.getFullName());
		System.out.println("Bio: " + myGithub.getBio());
		System.out.println("Repositories: " + myGithub.getRepositories());
		System.out.println("Followers: " + myGithub.getFollowers());
		System.out.println("Following: " + myGithub.getFollowing());
		System.out.println("Contributions: " + myGithub.getContributions());
		System.out.println("Stars Received: " + myGithub.getStarsReceived());
		System.out.println("Stars Given: " + myGithub.getStarsGiven());
		System.out.println("Developer: " + myGithub.isDeveloper());
		System.out.println("Verified: " + myGithub.isVerified());
		System.out.println("Profile Picture: " + myGithub.getProfilePicture());
		System.out.println("Website: " + myGithub.getWebsite());
		System.out.println("Current Project: " + myGithub.getCurrentProject());

	}

}
