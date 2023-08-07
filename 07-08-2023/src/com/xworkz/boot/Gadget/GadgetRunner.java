package com.xworkz.boot.Gadget;

import com.xworkz.app.Gadget.Gadget;

public class GadgetRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GadgetRunner");
		
		Gadget gadget =new Gadget();
		gadget.works("Techy", 10000);
	}

}
