package com.xworkz.implementation;

public class CountryRepositoryImpl implements CountryRepository {

	private String[] coutryNames=new String[5];
	private int position;
	
	@Override
	public void storeCountry(String country) {
		System.out.println("invoking storeCountry() in "+this.getClass().getSimpleName());
		if(this.position<NO_OF_COUNTRY){
			this.coutryNames[position]=country;
			System.out.println("Country name "+country+" is added at position "+this.position);
			position++;
		}
		else{
			System.err.println("Data store is full cannot add new Country");
		}

	}

	@Override
	public boolean isExist(String country) {
		for(int index=0;index<=this.position;index++)
		{
			String temp=this.coutryNames[index];
			if(temp!=null && temp.equals(country))
			{
				System.out.println("Country already exists ...");
				return true;
			}
		}
		return false;
	}

}
