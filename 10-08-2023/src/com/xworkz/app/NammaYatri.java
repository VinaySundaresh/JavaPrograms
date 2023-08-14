package com.xworkz.app;

public class NammaYatri {

	private String username;
	private String fullName;
	private String email;
	private String mobileNumber;
	private int totalTrips;
	private int totalPassengers;
	private boolean isRegistered;
	private boolean isLoggedIn;
	private boolean isEcoFriendly;
	private boolean isRoundTrip;
	private String profilePicture;
	private String preferredLanguage;
	private String currentTrip;
	private String upcomingTrip;

	// Constructor
	public NammaYatri() {
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

	public int getTotalTrips() {
		return totalTrips;
	}

	public void setTotalTrips(int totalTrips) {
		this.totalTrips = totalTrips;
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

	public boolean isEcoFriendly() {
		return isEcoFriendly;
	}

	public void setEcoFriendly(boolean ecoFriendly) {
		isEcoFriendly = ecoFriendly;
	}

	public boolean isRoundTrip() {
		return isRoundTrip;
	}

	public void setRoundTrip(boolean roundTrip) {
		isRoundTrip = roundTrip;
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

	public String getCurrentTrip() {
		return currentTrip;
	}

	public void setCurrentTrip(String currentTrip) {
		this.currentTrip = currentTrip;
	}

	public String getUpcomingTrip() {
		return upcomingTrip;
	}

	public void setUpcomingTrip(String upcomingTrip) {
		this.upcomingTrip = upcomingTrip;
	}

}
