package com.xworkz.app;

public class Phonepe {

	private String phoneNumber;
	private String fullName;
	private String email;
	private double walletBalance;
	private int totalTransactions;
	private int rewardsPoints;
	private boolean isKYCVerified;
	private boolean isUPIEnabled;
	private boolean isNotificationsEnabled;
	private boolean isBankLinked;
	private String profilePicture;
	private String referralCode;
	private String linkedBank;
	private String currentTransaction;

	

	// Getters and Setters

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}

	public int getTotalTransactions() {
		return totalTransactions;
	}

	public void setTotalTransactions(int totalTransactions) {
		this.totalTransactions = totalTransactions;
	}

	public int getRewardsPoints() {
		return rewardsPoints;
	}

	public void setRewardsPoints(int rewardsPoints) {
		this.rewardsPoints = rewardsPoints;
	}

	public boolean isKYCVerified() {
		return isKYCVerified;
	}

	public void setKYCVerified(boolean KYCVerified) {
		isKYCVerified = KYCVerified;
	}

	public boolean isUPIEnabled() {
		return isUPIEnabled;
	}

	public void setUPIEnabled(boolean UPIEnabled) {
		isUPIEnabled = UPIEnabled;
	}

	public boolean isNotificationsEnabled() {
		return isNotificationsEnabled;
	}

	public void setNotificationsEnabled(boolean notificationsEnabled) {
		isNotificationsEnabled = notificationsEnabled;
	}

	public boolean isBankLinked() {
		return isBankLinked;
	}

	public void setBankLinked(boolean bankLinked) {
		isBankLinked = bankLinked;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	public String getLinkedBank() {
		return linkedBank;
	}

	public void setLinkedBank(String linkedBank) {
		this.linkedBank = linkedBank;
	}

	public String getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(String currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

}
