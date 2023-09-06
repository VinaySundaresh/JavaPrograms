package com.xworkz.Runner;

import com.xworkz.implementation.TrainNumberRepository;
import com.xworkz.implementation.TrainNumberRepositoryImpl;
import com.xworkz.services.TrainNumberService;
import com.xworkz.services.TrainNumberServiceImpl;

public class TrainNumberRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in TrainNumberRunner");
		
		TrainNumberRepository trainNumberRepository=new TrainNumberRepositoryImpl();
		
		TrainNumberService trainNumberService=new TrainNumberServiceImpl(trainNumberRepository);
		
		trainNumberService.validateAndStore(16782);
		
		trainNumberService.validateAndStore(16782);

	}

}
