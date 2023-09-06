package com.xworkz.implementation;

public interface PincodeRepository {
	
	int NO_OF_PINCODES=5;
	
	void storePincodes(int pincode);
	
	default boolean isExist(int pincode)
	{
		return false;
	}

}
