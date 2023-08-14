package com.xworkz.app;

public class PUBG {

	private String username;
	private String fullName;
	private int level;
	private int totalMatchesPlayed;
	private int totalKills;
	private int totalWins;
	private int totalRevives;
	private int totalTop10;
	private boolean isPremiumPassHolder;
	private boolean isBanned;
	private boolean isSquadUp;
	private boolean isStreamerModeEnabled;
	private String profilePicture;
	private String currentMatch;

	// Constructor
	public PUBG() {
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getTotalMatchesPlayed() {
		return totalMatchesPlayed;
	}

	public void setTotalMatchesPlayed(int totalMatchesPlayed) {
		this.totalMatchesPlayed = totalMatchesPlayed;
	}

	public int getTotalKills() {
		return totalKills;
	}

	public void setTotalKills(int totalKills) {
		this.totalKills = totalKills;
	}

	public int getTotalWins() {
		return totalWins;
	}

	public void setTotalWins(int totalWins) {
		this.totalWins = totalWins;
	}

	public int getTotalRevives() {
		return totalRevives;
	}

	public void setTotalRevives(int totalRevives) {
		this.totalRevives = totalRevives;
	}

	public int getTotalTop10() {
		return totalTop10;
	}

	public void setTotalTop10(int totalTop10) {
		this.totalTop10 = totalTop10;
	}

	public boolean isPremiumPassHolder() {
		return isPremiumPassHolder;
	}

	public void setPremiumPassHolder(boolean premiumPassHolder) {
		isPremiumPassHolder = premiumPassHolder;
	}

	public boolean isBanned() {
		return isBanned;
	}

	public void setBanned(boolean banned) {
		isBanned = banned;
	}

	public boolean isSquadUp() {
		return isSquadUp;
	}

	public void setSquadUp(boolean squadUp) {
		isSquadUp = squadUp;
	}

	public boolean isStreamerModeEnabled() {
		return isStreamerModeEnabled;
	}

	public void setStreamerModeEnabled(boolean streamerModeEnabled) {
		isStreamerModeEnabled = streamerModeEnabled;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getCurrentMatch() {
		return currentMatch;
	}

	public void setCurrentMatch(String currentMatch) {
		this.currentMatch = currentMatch;
	}
}
