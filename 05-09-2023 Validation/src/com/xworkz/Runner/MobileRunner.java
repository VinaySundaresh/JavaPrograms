package com.xworkz.Runner;

import com.xworkz.implementation.MobileNoRepository;
import com.xworkz.implementation.MobileNoRepositoryImpl;
import com.xworkz.services.MobileNoService;
import com.xworkz.services.MobileNoServiceImpl;
//import com.xworkz.services.MobileNoRepositoryImpl;

public class MobileRunner {

	public static void main(String[] args) {
		System.out.println("invoking main() in MobileRUnner");
		
		MobileNoRepository mobileNoRepository=new MobileNoRepositoryImpl();
		
		MobileNoService mobileNoService=new MobileNoServiceImpl(mobileNoRepository);
		
		mobileNoService.validateAndSave(9620689808L);
		mobileNoService.validateAndSave(9964406090L);
		mobileNoService.validateAndSave(9620689808L);
	}

}
