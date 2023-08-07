package com.xworkz.boot.ironBox;

import com.xworkz.app.ironbox.IronBox;

public class IronBoxRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in IronBoxRunner");
		
		IronBox iron=new IronBox();
		System.out.println("----------------------------------------------------");
		iron.heater("Bajaj","LMH");
		
		
		
		

	}

}
