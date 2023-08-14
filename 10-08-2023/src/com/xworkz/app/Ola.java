package com.xworkz.app;

public class Ola {

	private String username;
	private String fullName;
	private String email;
	private String mobileNumber;
	private int totalRides;
	private int totalPassengers;
	private boolean isRegistered;
	private boolean isLoggedIn;
	private boolean isPrimeMember;
	private boolean isRentalBooking;
	private String profilePicture;
	private String preferredLanguage;
	private String currentRide;
	private String upcomingRide;

	// Constructor
	public Ola() {
		// Initialize properties if needed
	}

	// Getters and Setters

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getTotalRides() {
		return totalRides;
	}

	public void setTotalRides(int totalRides) {
		this.totalRides = totalRides;
	}

	public int getTotalPassengers() {
		return totalPassengers;
	}

	public void setTotalPassengers(int totalPassengers) {
		this.totalPassengers = totalPassengers;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean registered) {
		isRegistered = registered;
	}

	public boolean isLoggedIn() {
		return isLoggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		isLoggedIn = loggedIn;
	}

	public boolean isPrimeMember() {
		return isPrimeMember;
	}

	public void setPrimeMember(boolean primeMember) {
		isPrimeMember = primeMember;
	}

	public boolean isRentalBooking() {
		return isRentalBooking;
	}

	public void setRentalBooking(boolean rentalBooking) {
		isRentalBooking = rentalBooking;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getCurrentRide() {
		return currentRide;
	}

	public void setCurrentRide(String currentRide) {
		this.currentRide = currentRide;
	}

	public String getUpcomingRide() {
		return upcomingRide;
	}

	public void setUpcomingRide(String upcomingRide) {
		this.upcomingRide = upcomingRide;
	}

}
