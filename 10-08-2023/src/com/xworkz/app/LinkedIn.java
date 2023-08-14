package com.xworkz.app;

public class LinkedIn {

	private String username;
	private String fullName;
	private String headline;
	private String aboutMe;
	private int connectionsCount;
	private int postsCount;
	private int endorsementsCount;
	private int recommendationsCount;
	private boolean isPremiumMember;
	private boolean isVerified;
	private boolean isFollowing;
	private boolean isJobSeeker;
	private String profilePicture;
	private String currentJob;

	// Constructor
	public LinkedIn() {
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

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public int getConnectionsCount() {
		return connectionsCount;
	}

	public void setConnectionsCount(int connectionsCount) {
		this.connectionsCount = connectionsCount;
	}

	public int getPostsCount() {
		return postsCount;
	}

	public void setPostsCount(int postsCount) {
		this.postsCount = postsCount;
	}

	public int getEndorsementsCount() {
		return endorsementsCount;
	}

	public void setEndorsementsCount(int endorsementsCount) {
		this.endorsementsCount = endorsementsCount;
	}

	public int getRecommendationsCount() {
		return recommendationsCount;
	}

	public void setRecommendationsCount(int recommendationsCount) {
		this.recommendationsCount = recommendationsCount;
	}

	public boolean isPremiumMember() {
		return isPremiumMember;
	}

	public void setPremiumMember(boolean premiumMember) {
		isPremiumMember = premiumMember;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean verified) {
		isVerified = verified;
	}

	public boolean isFollowing() {
		return isFollowing;
	}

	public void setFollowing(boolean following) {
		isFollowing = following;
	}

	public boolean isJobSeeker() {
		return isJobSeeker;
	}

	public void setJobSeeker(boolean jobSeeker) {
		isJobSeeker = jobSeeker;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getCurrentJob() {
		return currentJob;
	}

	public void setCurrentJob(String currentJob) {
		this.currentJob = currentJob;
	}

}
