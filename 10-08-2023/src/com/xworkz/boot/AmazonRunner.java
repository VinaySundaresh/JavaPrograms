package com.xworkz.boot;

import com.xworkz.app.YouTube;

public class AmazonRunner {

	public static void main(String[] args) {
		// Create an instance of YouTube class
		YouTube myYouTube = new YouTube();

		// Set properties using setter methods
		myYouTube.setChannelName("MyChannel");
		myYouTube.setOwnerName("John Doe");
		myYouTube.setDescription("Tech and tutorials");
		myYouTube.setSubscribers(10000);
		myYouTube.setVideosUploaded(50);
		myYouTube.setTotalViews(500000);
		myYouTube.setTotalLikes(20000);
		myYouTube.setTotalDislikes(1000);
		myYouTube.setVerified(true);
		myYouTube.setMonetized(true);
		myYouTube.setSubscribed(false);
		myYouTube.setProfilePicture("profile.jpg");
		myYouTube.setWebsite("https://www.youtube.com/mychannel");
		myYouTube.setCurrentVideo("Java Programming Tutorial");

		// Get properties using getter methods
		System.out.println("Channel Name: " + myYouTube.getChannelName());
		System.out.println("Owner Name: " + myYouTube.getOwnerName());
		System.out.println("Description: " + myYouTube.getDescription());
		System.out.println("Subscribers: " + myYouTube.getSubscribers());
		System.out.println("Videos Uploaded: " + myYouTube.getVideosUploaded());
		System.out.println("Total Views: " + myYouTube.getTotalViews());
		System.out.println("Total Likes: " + myYouTube.getTotalLikes());
		System.out.println("Total Dislikes: " + myYouTube.getTotalDislikes());
		System.out.println("Verified: " + myYouTube.isVerified());
		System.out.println("Monetized: " + myYouTube.isMonetized());
		System.out.println("Subscribed: " + myYouTube.isSubscribed());
		System.out.println("Profile Picture: " + myYouTube.getProfilePicture());
		System.out.println("Website: " + myYouTube.getWebsite());
		System.out.println("Current Video: " + myYouTube.getCurrentVideo());

	}

}
