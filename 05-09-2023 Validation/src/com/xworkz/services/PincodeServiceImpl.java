package com.xworkz.services;

import com.xworkz.implementation.PincodeRepository;

public class PincodeServiceImpl implements PincodeService {

	private PincodeRepository pincodeRepository;

	public PincodeServiceImpl(PincodeRepository pincodeRepository) {
		this.pincodeRepository = pincodeRepository;
	}

	@Override
	public boolean validateAndSave(int pincodes) {
		System.out.println("Invoking validateAndSave()  in " + this.getClass().getSimpleName());
		if(pincodes>500000 && pincodes<700000)
		{
			if(!pincodeRepository.isExist(pincodes))
			{
				System.out.println("Train number "+pincodes+" is valid ");
				this.pincodeRepository.storePincodes(pincodes);
				return true;
			}
			else{
				System.err.println("Pincode "+pincodes+" already present add another pincode");
			}
		}
		else{
			System.err.println("Pincode is invalid");
		}
		return false;
	}

}
