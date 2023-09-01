package com.xworkz.chandrayan.app.implementation;

import com.xworkz.chandrayan.app.repository.HistoricalPlaces;

public class HistoricalPlacesRepositoryImpl implements HistoricalPlaces {

	@Override
	public void distance(String name) {
		System.out.println("invoking distance() in HistorialPlacesRepository");
		
		HistoricalPlaces historicalPlaces=new HistoricalPlacesRepositoryImpl();
		
		historicalPlaces.distance("Hampi");
		historicalPlaces.distance("Belagavi");
		historicalPlaces.distance("Vidhana Sabha");
		historicalPlaces.distance("KempeGowda Aramane");
		historicalPlaces.distance("Shivappanayaka aramane");
		historicalPlaces.distance("Belur");
		
		

	}

}
