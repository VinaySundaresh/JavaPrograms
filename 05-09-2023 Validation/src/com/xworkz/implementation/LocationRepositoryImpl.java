package com.xworkz.implementation;

public class LocationRepositoryImpl implements LocationRepository {

	private String[] location=new String[NO_OF_LOCATION];
	private int pos;
	
	@Override
	public void storeLocation(String name) {
		System.out.println("Invoking storeLocation() in "+this.getClass().getSimpleName());
		if(this.pos<NO_OF_LOCATION)
		{
			this.location[pos]=name;
			System.out.println("Location "+name+" is added at position "+this.pos);
			pos++;
		}
		else
		{
			System.err.println("Data store is full cannot add new location");
		}
			
		
		

	}

	@Override
	public boolean isExist(String name) {
		for(int index=0;index<=this.pos;index++)
		{
			String temp=this.location[index];
			if(temp!=null && temp.equals(name))
			{
				System.out.println("Location name is valid ..");
				return true;
			}
			
		}
		return false;
	}

}
