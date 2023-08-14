package com.xworkz.app;

public class YouTube {

	private String channelName;
	private String ownerName;
	private String description;
	private int subscribers;
	private int videosUploaded;
	private int totalViews;
	private int totalLikes;
	private int totalDislikes;
	private boolean isVerified;
	private boolean isMonetized;
	private boolean isSubscribed;
	private String profilePicture;
	private String website;
	private String currentVideo;

	// Constructor
	public YouTube() {
		// Initialize properties if needed
	}

	// Getters and Setters

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(int subscribers) {
		this.subscribers = subscribers;
	}

	public int getVideosUploaded() {
		return videosUploaded;
	}

	public void setVideosUploaded(int videosUploaded) {
		this.videosUploaded = videosUploaded;
	}

	public int getTotalViews() {
		return totalViews;
	}

	public void setTotalViews(int totalViews) {
		this.totalViews = totalViews;
	}

	public int getTotalLikes() {
		return totalLikes;
	}

	public void setTotalLikes(int totalLikes) {
		this.totalLikes = totalLikes;
	}

	public int getTotalDislikes() {
		return totalDislikes;
	}

	public void setTotalDislikes(int totalDislikes) {
		this.totalDislikes = totalDislikes;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean verified) {
		isVerified = verified;
	}

	public boolean isMonetized() {
		return isMonetized;
	}

	public void setMonetized(boolean monetized) {
		isMonetized = monetized;
	}

	public boolean isSubscribed() {
		return isSubscribed;
	}

	public void setSubscribed(boolean subscribed) {
		isSubscribed = subscribed;
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

	public String getCurrentVideo() {
		return currentVideo;
	}

	public void setCurrentVideo(String currentVideo) {
		this.currentVideo = currentVideo;
	}

}
