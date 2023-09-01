package com.xworkz.chandrayan.boot;

import com.xworkz.chandrayan.app.implementation.MedicalRepositoryImpl;
import com.xworkz.chandrayan.app.repository.MedicineRepository;

public class MedicineRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main() in MedicineRunnner");
		
		MedicineRepository medicineRepository=new MedicalRepositoryImpl();
		
		medicineRepository.cause("NO COld");
		medicineRepository.cause("Dolo");
		medicineRepository.cause("Dart");
		medicineRepository.cause("Saridon");
		medicineRepository.cause("Cambiflame");
		medicineRepository.cause("vicks vapour");
		medicineRepository.cause("Citrizen");
		medicineRepository.cause("Alercet");
		//medicineRepository.cause(");

	}

}
