package com.xworkz.chandrayan.app.implementation;

import com.xworkz.chandrayan.app.repository.PatientRepository;

public class PatientRepositoryImpl implements PatientRepository {

	private String[] diseaseName=new String[NO_OF_PATIENTS];
	private int position;
	
	@Override
	public void disease(String name) {
		System.out.println("invoking disease() in PatientRepositoryImpl");
		if(this.position<NO_OF_PATIENTS)
		{
			diseaseName[position]=name;
			System.out.println("Disease "+name+" added at position "+this.position);
			position++;
		}
		else{
			System.err.println("Data store Is full cannot add new disease");
		}

	}

}
