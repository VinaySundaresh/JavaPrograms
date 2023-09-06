package com.xworkz.services;

import com.xworkz.implementation.MobileNoRepository;

public class MobileNoServiceImpl implements MobileNoService {

	private MobileNoRepository mobileNoRepository;
	
	public MobileNoServiceImpl( MobileNoRepository mobileNoRepository) {
		this.mobileNoRepository=mobileNoRepository;
	}
	
	@Override
	public boolean validateAndSave(long mobileNo) {
		System.out.println("invoking validateAndSave in "+this.getClass().getSimpleName());
		
		if(mobileNo >= 9000000000L && mobileNo <= 9999999999L)
		{
			System.out.println(mobileNo);
			if(!mobileNoRepository.isExist(mobileNo))
			{
			System.out.println("mobile no is valid");
			this.mobileNoRepository.storeMobile(mobileNo);
			return true;
			}
			else{
				System.err.println("Mobile no "+mobileNo+" is already present add another number ");
			}
		}
		
		else{
			System.err.println("Mobile no is invalid");
		}
		return false;
	}

}
