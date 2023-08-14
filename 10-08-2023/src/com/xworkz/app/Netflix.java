package com.xworkz.app;

public class Netflix {

	private String username;
	private String fullName;
	private String email;
	private int totalWatchedShows;
	private int totalWatchedMovies;
	private int totalDevices;
	private int totalProfiles;
	private boolean isPremium;
	private boolean isSubscribed;
	private boolean isKidsMode;
	private boolean isAutoPlayEnabled;
	private String profilePicture;
	private String billingMethod;
	private String currentWatchedItem;

	// Constructor
	public Netflix() {
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

	public int getTotalWatchedShows() {
		return totalWatchedShows;
	}

	public void setTotalWatchedShows(int totalWatchedShows) {
		this.totalWatchedShows = totalWatchedShows;
	}

	public int getTotalWatchedMovies() {
		return totalWatchedMovies;
	}

	public void setTotalWatchedMovies(int totalWatchedMovies) {
		this.totalWatchedMovies = totalWatchedMovies;
	}

	public int getTotalDevices() {
		return totalDevices;
	}

	public void setTotalDevices(int totalDevices) {
		this.totalDevices = totalDevices;
	}

	public int getTotalProfiles() {
		return totalProfiles;
	}

	public void setTotalProfiles(int totalProfiles) {
		this.totalProfiles = totalProfiles;
	}

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean premium) {
		isPremium = premium;
	}

	public boolean isSubscribed() {
		return isSubscribed;
	}

	public void setSubscribed(boolean subscribed) {
		isSubscribed = subscribed;
	}

	public boolean isKidsMode() {
		return isKidsMode;
	}

	public void setKidsMode(boolean kidsMode) {
		isKidsMode = kidsMode;
	}

	public boolean isAutoPlayEnabled() {
		return isAutoPlayEnabled;
	}

	public void setAutoPlayEnabled(boolean autoPlayEnabled) {
		isAutoPlayEnabled = autoPlayEnabled;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getBillingMethod() {
		return billingMethod;
	}

	public void setBillingMethod(String billingMethod) {
		this.billingMethod = billingMethod;
	}

	public String getCurrentWatchedItem() {
		return currentWatchedItem;
	}

	public void setCurrentWatchedItem(String currentWatchedItem) {
		this.currentWatchedItem = currentWatchedItem;
	}

}
