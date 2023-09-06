package com.xworkz.services;

import com.xworkz.implementation.CountryRepository;

public class CountryServiceImpl implements CountryService {
	private CountryRepository countryRepository;
	
	public CountryServiceImpl(CountryRepository countryRepository) {
		this.countryRepository=countryRepository;
	}
	@Override
	public boolean validateAndSave(String name) {
		System.out.println("Invoking validateAndSave() in "+this.getClass().getSimpleName());
		

		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("Country name " + name + " is valid ");
			
			if(!this.countryRepository.isExist(name))
			{
			this.countryRepository.storeCountry(name);
			return true;
			}
			else{
				System.err.println("Country name "+name+" already exists ,add another one");
			}
		}

		else {
			System.err.println("Country name " + name + " is invalid");
		}
		return false;
	}

}
