package com.xworkz.implementation;

public interface CountryRepository {
	
	int NO_OF_COUNTRY=5;
	void storeCountry(String country);
	
	boolean isExist(String country);
	

}
