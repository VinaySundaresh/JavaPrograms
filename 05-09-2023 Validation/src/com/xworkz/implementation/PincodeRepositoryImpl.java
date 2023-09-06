package com.xworkz.implementation;

public class PincodeRepositoryImpl implements PincodeRepository {

	private int[] pincodes = new int[NO_OF_PINCODES];
	private int pos;

	public PincodeRepositoryImpl() {
		// Initialize the position to 0 when the object is created
		this.pos = 0;
	}

	@Override
	public void storePincodes(int pincode) {
		System.out.println("Invoking storePincodes() in " + this.getClass().getSimpleName());

		if (this.pos < NO_OF_PINCODES) {
			this.pincodes[this.pos] = pincode;
			System.out.println("Pincode added is " + pincode + " at the position " + this.pos);
			this.pos++;
		} else {
			System.err.println("Data store is full. Cannot store new Pincodes.");
		}
	}

	@Override
	public boolean isExist(int pincode) {
		System.out.println("Invoking isExist() in PincodeRepositoryImpl");

		for (int index = 0; index <=this.pos; index++) {
		    int temp = this.pincodes[index];
		    if (pincode == temp) {
		        System.out.println("Pincode already exists");
		        return true;
		    }
		}
		return false;
	}
}
