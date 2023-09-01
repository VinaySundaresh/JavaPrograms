package com.xworkz.chandrayan.app.implementation;

import com.xworkz.chandrayan.app.repository.PilotRepository;

public class PilotRepositoryImpl implements PilotRepository {

	private String[] pilotnames=new String[NO_OF_PILOTS];
	private int position;
	
	@Override
	public void drive(String name) {
		System.out.println("invoking drive() in PilotRepositoryImpl");
		if(this.position<NO_OF_PILOTS)
		{
			this.pilotnames[position]=name;
			System.out.println("Pilot name "+name+"added to the position "+this.position);
			position++;
		}
		else{
			System.err.println("Data store is full cannot add a new pilot");
		}

	}

}
