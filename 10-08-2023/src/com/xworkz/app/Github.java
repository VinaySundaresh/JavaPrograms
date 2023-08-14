package com.xworkz.app;

public class Github {

	private String username;
	private String fullName;
	private String bio;
	private int repositories;
	private int followers;
	private int following;
	private int contributions;
	private int starsReceived;
	private int starsGiven;
	private boolean isDeveloper;
	private boolean isVerified;
	private String profilePicture;
	private String website;
	private String currentProject;

	// Constructor
	public Github() {
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

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public int getRepositories() {
		return repositories;
	}

	public void setRepositories(int repositories) {
		this.repositories = repositories;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}

	public int getContributions() {
		return contributions;
	}

	public void setContributions(int contributions) {
		this.contributions = contributions;
	}

	public int getStarsReceived() {
		return starsReceived;
	}

	public void setStarsReceived(int starsReceived) {
		this.starsReceived = starsReceived;
	}

	public int getStarsGiven() {
		return starsGiven;
	}

	public void setStarsGiven(int starsGiven) {
		this.starsGiven = starsGiven;
	}

	public boolean isDeveloper() {
		return isDeveloper;
	}

	public void setDeveloper(boolean developer) {
		isDeveloper = developer;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean verified) {
		isVerified = verified;
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

	public String getCurrentProject() {
		return currentProject;
	}

	public void setCurrentProject(String currentProject) {
		this.currentProject = currentProject;
	}
}
