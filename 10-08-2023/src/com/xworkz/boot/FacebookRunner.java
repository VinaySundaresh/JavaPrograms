package com.xworkz.boot;

import com.xworkz.app.Facebook;

public class FacebookRunner {

	public static void main(String[] args) {
		// Create an instance of Facebook class
		Facebook myFacebook = new Facebook();

		// Set properties using setter methods
		myFacebook.setUsername("facebook_user");
		myFacebook.setFullName("John Doe");
		myFacebook.setBio("Life is beautiful!");
		myFacebook.setFriendsCount(500);
		myFacebook.setPostsCount(100);
		myFacebook.setPhotosCount(300);
		myFacebook.setLikesCount(1500);
		myFacebook.setCommentsCount(500);
		myFacebook.setOnline(true);
		myFacebook.setVerified(true);
		myFacebook.setFollowing(true);
		myFacebook.setProfilePicture("profile.jpg");
		myFacebook.setCoverPhoto("cover.jpg");
		myFacebook.setCurrentStatus("Feeling happy");

		// Get properties using getter methods
		System.out.println("Username: " + myFacebook.getUsername());
		System.out.println("Full Name: " + myFacebook.getFullName());
		System.out.println("Bio: " + myFacebook.getBio());
		System.out.println("Friends Count: " + myFacebook.getFriendsCount());
		System.out.println("Posts Count: " + myFacebook.getPostsCount());
		System.out.println("Photos Count: " + myFacebook.getPhotosCount());
		System.out.println("Likes Count: " + myFacebook.getLikesCount());
		System.out.println("Comments Count: " + myFacebook.getCommentsCount());
		System.out.println("Online: " + myFacebook.isOnline());
		System.out.println("Verified: " + myFacebook.isVerified());
		System.out.println("Following: " + myFacebook.isFollowing());
		System.out.println("Profile Picture: " + myFacebook.getProfilePicture());
		System.out.println("Cover Photo: " + myFacebook.getCoverPhoto());
		System.out.println("Current Status: " + myFacebook.getCurrentStatus());

	}

}
