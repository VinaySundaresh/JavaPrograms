package com.xworkz.boot;

import com.xworkz.app.Country;
import com.xworkz.app.HomeMinister;
import com.xworkz.app.PersonalAssistant;
import com.xworkz.app.President;
import com.xworkz.app.PrimeMinister;
import com.xworkz.app.SecurityHead;

public class CountryRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in CountryRunner");
		System.out.println("--------------------------------------------------------------");
		Country country=new Country();
		String name=country.name;
		int code=country.code;
		System.out.println("name of the country is "+name);
		System.out.println("Country code is "+code);
		System.out.println("--------------------------------------------------------------");
		President president= country.president;
		String stateFrom=president.stateFrom;
		System.out.println("state of country "+stateFrom);
		System.out.println("--------------------------------------------------------------");
		
	    PrimeMinister primeMinister= country.primeMinister;
	    int noOfYears=primeMinister.noOfYears;
		String education=primeMinister.education;
		
		System.out.println("Number of years :"+noOfYears);
		System.out.println("Education is "+education);
		System.out.println("--------------------------------------------------------------");
		SecurityHead securityHead=primeMinister.securityHead;
		boolean respondtoEmergencies= securityHead.respondtoEmergencies;
		String responsibilities=securityHead.responsibilities;
		
		System.out.println("Responding to emergencies "+respondtoEmergencies);
		System.out.println("Responsibilities "+responsibilities);
		System.out.println("--------------------------------------------------------------");
		
		HomeMinister homeMinister=primeMinister.homeMinister;
		String type=homeMinister.powerType;
		System.out.println("Power type :"+type);
		boolean securityGaurds=homeMinister.securtyGaurds;
		System.out.println("Security gaurds :"+securityGaurds);
		System.out.println("--------------------------------------------------------------");
		
		
		PersonalAssistant personalAssistance=primeMinister.personalAssistance;
		
		boolean iseducated=personalAssistance.iseducated;
		boolean personalAssistant=personalAssistance.personalAssistant;
		
		System.out.println("Is educated  : "+iseducated);
		System.out.println("Have assistance : "+personalAssistance);
		System.out.println("--------------------------------------------------------------");
		
		

	}

}
