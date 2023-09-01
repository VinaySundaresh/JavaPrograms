package com.xworkz.chandrayan.boot;

import com.xworkz.chandrayan.app.implementation.PatientRepositoryImpl;
import com.xworkz.chandrayan.app.repository.PatientRepository;

public class PatientRunner {

	public static void main(String[] args) {
		System.out.println("invoking main() in PatientRunner");
		
		PatientRepository patientRepository=new PatientRepositoryImpl();
		
		patientRepository.disease("Fever");
		patientRepository.disease("Diaheara");
		patientRepository.disease("Dengue");
		patientRepository.disease("Heart Attack");
		patientRepository.disease("Colera");
		patientRepository.disease("Malaria");
		patientRepository.disease("Cancer");
		patientRepository.disease("Typhoid");
		patientRepository.disease("Cold");
		patientRepository.disease("cough");
		patientRepository.disease("Handycap");

	}

}
