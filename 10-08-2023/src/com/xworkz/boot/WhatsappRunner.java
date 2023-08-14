package com.xworkz.boot;

import com.xworkz.app.Whatsapp;

public class WhatsappRunner {

	public static void main(String[] args) {
		// Create an instance of Whatsapp class
        Whatsapp myWhatsapp = new Whatsapp();

        // Set properties using setter methods
        myWhatsapp.setUsername("john_doe");
        myWhatsapp.setPhoneNumber("+1234567890");
        myWhatsapp.setStatus("Hello, I'm using Whatsapp!");
        myWhatsapp.setAge(25);
        myWhatsapp.setCountry("USA");
        myWhatsapp.setTotalMessages(500);
        myWhatsapp.setTotalContacts(50);
        myWhatsapp.setOnline(true);
        myWhatsapp.setMuted(false);
        myWhatsapp.setBlocked(false);
        myWhatsapp.setVerified(true);
        myWhatsapp.setAbout("Software Engineer");
        myWhatsapp.setCurrentChat("Alice");

        // Get properties using getter methods
        System.out.println("Username: " + myWhatsapp.getUsername());
        System.out.println("Phone Number: " + myWhatsapp.getPhoneNumber());
        System.out.println("Status: " + myWhatsapp.getStatus());
        System.out.println("Age: " + myWhatsapp.getAge());
        System.out.println("Country: " + myWhatsapp.getCountry());
        System.out.println("Total Messages: " + myWhatsapp.getTotalMessages());
        System.out.println("Total Contacts: " + myWhatsapp.getTotalContacts());
        System.out.println("Online: " + myWhatsapp.isOnline());
        System.out.println("Muted: " + myWhatsapp.isMuted());
        System.out.println("Blocked: " + myWhatsapp.isBlocked());
        System.out.println("Verified: " + myWhatsapp.isVerified());
        System.out.println("About: " + myWhatsapp.getAbout());
        System.out.println("Current Chat: " + myWhatsapp.getCurrentChat());

	}

}
