package com.xworkz.services;

import com.xworkz.implementation.LocationRepository;
import com.xworkz.implementation.LocationRepositoryImpl;

public class LoactionServiceImpl implements LocationService {

	private LocationRepository locationRepository;

	public LoactionServiceImpl(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

	@Override
	public boolean validateAndStore(String name) {
		System.out.println("invoking validateAndStore() in " + this.getClass().getSimpleName());

		if (name != null && !name.isEmpty() && name.length() > 4 && name.length() < 20) {
			if (!locationRepository.isExist(name)) {
				System.out.println("Name " + name + " is valid");
				locationRepository.storeLocation(name);
				return true;
			} else {
				System.err.println("Location name " + name + " is already present");
			}
		}

		else {
			System.err.println("Location name " + name + " is invalid");
		}

		return false;
	}

}
