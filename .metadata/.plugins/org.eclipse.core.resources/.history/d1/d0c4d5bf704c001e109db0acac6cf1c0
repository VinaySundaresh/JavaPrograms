package com.xworkz.Runner;

import com.xworkz.implementation.LocationRepository;
import com.xworkz.implementation.LocationRepositoryImpl;
import com.xworkz.services.LocationService;
import com.xworkz.services.LoactionServiceImpl;


public class LocationRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LocationRunner");
		
		LocationRepository locationRepository=new LocationRepositoryImpl();
		LocationService locationService=new LoactionServiceImpl(locationRepository);
		locationService.validateAndStore("Banglore");
		locationService.validateAndStore("Shivamogga");
		locationService.validateAndStore("Badravathi");
		locationService.validateAndStore("Shivamogga");

	}

}
