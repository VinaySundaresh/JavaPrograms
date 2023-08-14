package com.xworkz.boot;

import com.xworkz.app.Instagram;

public class InstagramRunner {
	public static void main(String[] args){
	 // Create an instance of Instagram class
    Instagram myInstagram = new Instagram();

    // Set properties using setter methods
    myInstagram.setUsername("jane_doe");
    myInstagram.setFullName("Jane Doe");
    myInstagram.setBio("Travel enthusiast");
    myInstagram.setAge(28);
    myInstagram.setEmail("jane@example.com");
    myInstagram.setPhoneNumber("+1234567890");
    myInstagram.setTotalPosts(150);
    myInstagram.setTotalFollowers(1000);
    myInstagram.setTotalFollowing(500);
    myInstagram.setPrivate(false);
    myInstagram.setVerified(true);
    myInstagram.setProfilePicture("profile.jpg");
    myInstagram.setWebsite("https://www.example.com");
    myInstagram.setCurrentStory("At the beach");

    // Get properties using getter methods
    System.out.println("Username: " + myInstagram.getUsername());
    System.out.println("Full Name: " + myInstagram.getFullName());
    System.out.println("Bio: " + myInstagram.getBio());
    System.out.println("Age: " + myInstagram.getAge());
    System.out.println("Email: " + myInstagram.getEmail());
    System.out.println("Phone Number: " + myInstagram.getPhoneNumber());
    System.out.println("Total Posts: " + myInstagram.getTotalPosts());
    System.out.println("Total Followers: " + myInstagram.getTotalFollowers());
    System.out.println("Total Following: " + myInstagram.getTotalFollowing());
    System.out.println("Private: " + myInstagram.isPrivate());
    System.out.println("Verified: " + myInstagram.isVerified());
    System.out.println("Profile Picture: " + myInstagram.getProfilePicture());
    System.out.println("Website: " + myInstagram.getWebsite());
    System.out.println("Current Story: " + myInstagram.getCurrentStory());
}
}
