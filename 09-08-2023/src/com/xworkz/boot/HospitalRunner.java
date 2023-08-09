package com.xworkz.boot;

import com.xworkz.app.Hospital;
import com.xworkz.app.Medical;

public class HospitalRunner {
	
	public static void main(String[] args)
	{
		System.out.println("invoking mian in HospitalRUnner");
		
		Hospital hospital=new Hospital();
		hospital.cureDisease();
		hospital.cureDisease("Heart");
		hospital.cureDisease("Heart","Santosh");
		hospital.cureDisease("Heart", "Santosh", 100);
		hospital.cureDisease("Heart", "Rakesh", 100, 1200);
		
		System.out.println("------------------------------------------------------------------");
		Medical medical=new Medical();
		
		medical.cureDisease();
		medical.cureDisease("Heart");
		medical.cureDisease("Heart","Santosh");
		medical.cureDisease("Heart", "Santosh", 100);
		medical.cureDisease("Heart", "Rakesh", 100, 1200);
		
	}
}
