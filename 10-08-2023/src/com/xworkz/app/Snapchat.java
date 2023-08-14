package com.xworkz.app;

public class Snapchat {

	private String username;
	private String displayName;
	private String bio;
	private int score;
	private int streak;
	private int totalSnapsSent;
	private int totalSnapsReceived;
	private int totalFriends;
	private boolean isPrivate;
	private boolean isVerified;
	private String profilePicture;
	private String website;
	private String currentStatus;
	private String currentFilter;

	// Constructor
	public Snapchat() {
		// Initialize properties if needed
	}

	// Getters and Setters

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getStreak() {
		return streak;
	}

	public void setStreak(int streak) {
		this.streak = streak;
	}

	public int getTotalSnapsSent() {
		return totalSnapsSent;
	}

	public void setTotalSnapsSent(int totalSnapsSent) {
		this.totalSnapsSent = totalSnapsSent;
	}

	public int getTotalSnapsReceived() {
		return totalSnapsReceived;
	}

	public void setTotalSnapsReceived(int totalSnapsReceived) {
		this.totalSnapsReceived = totalSnapsReceived;
	}

	public int getTotalFriends() {
		return totalFriends;
	}

	public void setTotalFriends(int totalFriends) {
		this.totalFriends = totalFriends;
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getCurrentFilter() {
		return currentFilter;
	}

	public void setCurrentFilter(String currentFilter) {
		this.currentFilter = currentFilter;
	}

}
