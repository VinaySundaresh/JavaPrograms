package com.xworkz.app;

public class Medical extends Hospital{
	
	@Override
	public void cureDisease() {
		System.out.println("invoking cureDisease() in Medical");
		super.cureDisease();
	}
	
	@Override
	public void cureDisease(String specialisation) {
		System.out.println("invoking cureDisease(String) in Medical");
		super.cureDisease(specialisation);
	}
	
	@Override
	public void cureDisease(String specialisation, String doctorName) {
		System.out.println("invoking cureDisease(String,String) in Medical");
		super.cureDisease(specialisation, doctorName);
	}
	
	@Override
	public void cureDisease(String specialisation, String doctorName, int consultancyFee) {
		System.out.println("invoking cureDisease(String,String,int) in Medical");
		super.cureDisease(specialisation, doctorName, consultancyFee);
	}
	
	@Override
	public void cureDisease(String specialisation, String doctorName, int consultancyFee, double roomcharges) {
		System.out.println("invoking cureDisease(String,String,int,double) in Medical");
		super.cureDisease(specialisation, doctorName, consultancyFee, roomcharges);
	}
	
	@Override
	public void cureDisease(String specialisation, String doctorName, int consultancyFee, double roomcharges,
			boolean cure) {
		System.out.println("invoking cureDisease(String,String,int,double,boolean) in Medical");
		super.cureDisease(specialisation, doctorName, consultancyFee, roomcharges, cure);
	}

}
