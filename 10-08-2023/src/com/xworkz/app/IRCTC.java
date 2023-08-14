package com.xworkz.app;

public class IRCTC {

	private String username;
	private String fullName;
	private String email;
	private String mobileNumber;
	private int totalBookings;
	private int totalPassengers;
	private boolean isRegistered;
	private boolean isLoggedIn;
	private boolean isSpecialTrainBooking;
	private boolean isTatkalBooking;
	private String profilePicture;
	private String preferredLanguage;
	private String currentBooking;
	private String upcomingJourney;

	// Constructor
	public IRCTC() {
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

	public int getTotalBookings() {
		return totalBookings;
	}

	public void setTotalBookings(int totalBookings) {
		this.totalBookings = totalBookings;
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

	public boolean isSpecialTrainBooking() {
		return isSpecialTrainBooking;
	}

	public void setSpecialTrainBooking(boolean specialTrainBooking) {
		isSpecialTrainBooking = specialTrainBooking;
	}

	public boolean isTatkalBooking() {
		return isTatkalBooking;
	}

	public void setTatkalBooking(boolean tatkalBooking) {
		isTatkalBooking = tatkalBooking;
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

	public String getCurrentBooking() {
		return currentBooking;
	}

	public void setCurrentBooking(String currentBooking) {
		this.currentBooking = currentBooking;
	}

	public String getUpcomingJourney() {
		return upcomingJourney;
	}

	public void setUpcomingJourney(String upcomingJourney) {
		this.upcomingJourney = upcomingJourney;
	}

}
