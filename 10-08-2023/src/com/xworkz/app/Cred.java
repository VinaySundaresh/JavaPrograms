package com.xworkz.app;

public class Cred {

	private String username;
	private String fullName;
	private String email;
	private int creditScore;
	private int rewardsPoints;
	private double creditLimit;
	private double currentBalance;
	private boolean isRegistered;
	private boolean isActive;
	private boolean isRewardsMember;
	private boolean isCreditCardHolder;
	private String profilePicture;
	private String preferredPaymentMethod;
	private String currentTransaction;

	// Constructor
	public Cred() {
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

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public int getRewardsPoints() {
		return rewardsPoints;
	}

	public void setRewardsPoints(int rewardsPoints) {
		this.rewardsPoints = rewardsPoints;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean registered) {
		isRegistered = registered;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}

	public boolean isRewardsMember() {
		return isRewardsMember;
	}

	public void setRewardsMember(boolean rewardsMember) {
		isRewardsMember = rewardsMember;
	}

	public boolean isCreditCardHolder() {
		return isCreditCardHolder;
	}

	public void setCreditCardHolder(boolean creditCardHolder) {
		isCreditCardHolder = creditCardHolder;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getPreferredPaymentMethod() {
		return preferredPaymentMethod;
	}

	public void setPreferredPaymentMethod(String preferredPaymentMethod) {
		this.preferredPaymentMethod = preferredPaymentMethod;
	}

	public String getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(String currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

}
