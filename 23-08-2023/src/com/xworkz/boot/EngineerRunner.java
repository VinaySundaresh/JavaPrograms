package com.xworkz.boot;

import com.xworkz.app.Engineer;
import com.xworkz.app.SoftwareEnginner;

public class EngineerRunner {

	public static void main(String[] args) {

		System.out.println("Invoking main() in EngineerRunner");
		
		Engineer engineer=new SoftwareEnginner();
		
		engineer.devops();
		engineer.salary();
		engineer.exp();
		
		
	}

}
