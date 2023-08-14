package com.xworkz.boot;

import com.xworkz.app.Phonepe;

public class PhonepeRunner {

	public static void main(String[] args) {
		// Create an instance of PhonePe class
		Phonepe myPhonePe = new Phonepe();

		// Set properties using setter methods
		myPhonePe.setPhoneNumber("+1234567890");
		myPhonePe.setFullName("John Doe");
		myPhonePe.setEmail("john@example.com");
		myPhonePe.setWalletBalance(5000.0);
		myPhonePe.setTotalTransactions(100);
		myPhonePe.setRewardsPoints(250);
		myPhonePe.setKYCVerified(true);
		myPhonePe.setUPIEnabled(true);
		myPhonePe.setNotificationsEnabled(true);
		myPhonePe.setBankLinked(true);
		myPhonePe.setProfilePicture("profile.jpg");
		myPhonePe.setReferralCode("ABCD123");
		myPhonePe.setLinkedBank("XYZ Bank");
		myPhonePe.setCurrentTransaction("Payment to Alice");

		// Get properties using getter methods
		System.out.println("Phone Number: " + myPhonePe.getPhoneNumber());
		System.out.println("Full Name: " + myPhonePe.getFullName());
		System.out.println("Email: " + myPhonePe.getEmail());
		System.out.println("Wallet Balance: " + myPhonePe.getWalletBalance());
		System.out.println("Total Transactions: " + myPhonePe.getTotalTransactions());
		System.out.println("Rewards Points: " + myPhonePe.getRewardsPoints());
		System.out.println("KYC Verified: " + myPhonePe.isKYCVerified());
		System.out.println("UPI Enabled: " + myPhonePe.isUPIEnabled());
		System.out.println("Notifications Enabled: " + myPhonePe.isNotificationsEnabled());
		System.out.println("Bank Linked: " + myPhonePe.isBankLinked());
		System.out.println("Profile Picture: " + myPhonePe.getProfilePicture());
		System.out.println("Referral Code: " + myPhonePe.getReferralCode());
		System.out.println("Linked Bank: " + myPhonePe.getLinkedBank());
		System.out.println("Current Transaction: " + myPhonePe.getCurrentTransaction());
	}

}
