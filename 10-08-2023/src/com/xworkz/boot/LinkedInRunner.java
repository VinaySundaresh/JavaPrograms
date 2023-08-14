package com.xworkz.boot;

import com.xworkz.app.LinkedIn;

public class LinkedInRunner {

	public static void main(String[] args) {
		// Create an instance of LinkedIn class
		LinkedIn myLinkedIn = new LinkedIn();

		// Set properties using setter methods
		myLinkedIn.setUsername("linkedin_user");
		myLinkedIn.setFullName("John Doe");
		myLinkedIn.setHeadline("Software Engineer");
		myLinkedIn.setAboutMe("Passionate about coding and technology.");
		myLinkedIn.setConnectionsCount(500);
		myLinkedIn.setPostsCount(50);
		myLinkedIn.setEndorsementsCount(100);
		myLinkedIn.setRecommendationsCount(10);
		myLinkedIn.setPremiumMember(true);
		myLinkedIn.setVerified(true);
		myLinkedIn.setFollowing(true);
		myLinkedIn.setJobSeeker(true);
		myLinkedIn.setProfilePicture("profile.jpg");
		myLinkedIn.setCurrentJob("Software Developer at ABC Tech");

		// Get properties using getter methods
		System.out.println("Username: " + myLinkedIn.getUsername());
		System.out.println("Full Name: " + myLinkedIn.getFullName());
		System.out.println("Headline: " + myLinkedIn.getHeadline());
		System.out.println("About Me: " + myLinkedIn.getAboutMe());
		System.out.println("Connections Count: " + myLinkedIn.getConnectionsCount());
		System.out.println("Posts Count: " + myLinkedIn.getPostsCount());
		System.out.println("Endorsements Count: " + myLinkedIn.getEndorsementsCount());
		System.out.println("Recommendations Count: " + myLinkedIn.getRecommendationsCount());
		System.out.println("Premium Member: " + myLinkedIn.isPremiumMember());
		System.out.println("Verified: " + myLinkedIn.isVerified());
		System.out.println("Following: " + myLinkedIn.isFollowing());
		System.out.println("Job Seeker: " + myLinkedIn.isJobSeeker());
		System.out.println("Profile Picture: " + myLinkedIn.getProfilePicture());
		System.out.println("Current Job: " + myLinkedIn.getCurrentJob());
	}

}
