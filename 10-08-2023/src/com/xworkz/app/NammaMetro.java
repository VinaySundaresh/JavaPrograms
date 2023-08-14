package com.xworkz.app;

public class NammaMetro {

	private String username;
	private String fullName;
	private String email;
	private String mobileNumber;
	private int totalJourneys;
	private int totalPassengers;
	private boolean isRegistered;
	private boolean isLoggedIn;
	private boolean isAirConditioned;
	private boolean isWheelchairAccessible;
	private String profilePicture;
	private String preferredLanguage;
	private String currentJourney;
	private String upcomingJourney;

	// Constructor
	public NammaMetro() {
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

	public int getTotalJourneys() {
		return totalJourneys;
	}

	public void setTotalJourneys(int totalJourneys) {
		this.totalJourneys = totalJourneys;
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

	public boolean isAirConditioned() {
		return isAirConditioned;
	}

	public void setAirConditioned(boolean airConditioned) {
		isAirConditioned = airConditioned;
	}

	public boolean isWheelchairAccessible() {
		return isWheelchairAccessible;
	}

	public void setWheelchairAccessible(boolean wheelchairAccessible) {
		isWheelchairAccessible = wheelchairAccessible;
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

	public String getCurrentJourney() {
		return currentJourney;
	}

	public void setCurrentJourney(String currentJourney) {
		this.currentJourney = currentJourney;
	}

	public String getUpcomingJourney() {
		return upcomingJourney;
	}

	public void setUpcomingJourney(String upcomingJourney) {
		this.upcomingJourney = upcomingJourney;
	}

}
