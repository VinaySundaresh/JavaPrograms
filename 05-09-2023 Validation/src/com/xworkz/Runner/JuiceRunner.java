package com.xworkz.Runner;

import com.xworkz.implementation.JuiceRepository;
import com.xworkz.implementation.JuiceRepositoryImpl;
import com.xworkz.services.JuiceService;
import com.xworkz.services.JuiceServiceImpl;

public class JuiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in JuiceRunner");

		JuiceRepository juiceRepositor = new JuiceRepositoryImpl();

		JuiceService juiceService = new JuiceServiceImpl(juiceRepositor);
		
		juiceService.validateAndSave("PineApple");
		juiceService.validateAndSave("PineApple");
		juiceService.validateAndSave("Apple");
	}

}
