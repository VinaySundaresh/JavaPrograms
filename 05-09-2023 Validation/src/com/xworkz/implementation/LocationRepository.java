package com.xworkz.implementation;

public interface LocationRepository {
	
	int NO_OF_LOCATION=5;
	void storeLocation(String name);
	boolean isExist(String name);

}
