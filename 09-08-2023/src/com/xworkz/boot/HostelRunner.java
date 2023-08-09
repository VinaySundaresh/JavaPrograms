package com.xworkz.boot;

import com.xworkz.app.College;
import com.xworkz.app.Hostel;

public class HostelRunner {
	public static void main(String[] args)
	{
		System.out.println("invoking mian in HostelRunner");
		Hostel hostel=new College();
		
		hostel.rooms();
		hostel.rooms("Shivamogga");
		hostel.rooms("RajajiNagar", "PESITM");
		hostel.rooms("smg", "Pesitm", 2);
		hostel.rooms("smg", "PESITM", 2, 3);
		hostel.rooms("smg", "PESITM", 2, 3,4);
		
		System.out.println("-----------------------------------------------------------------------------");
		College college=new College();
		
		college.rooms();
		college.rooms("Shivamogga");
		college.rooms("RajajiNagar", "PESITM");
		college.rooms("smg", "Pesitm", 2);
		college.rooms("smg", "PESITM", 2, 3);
		college.rooms("smg", "PESITM", 2, 3,4);
		
		
	}

}
