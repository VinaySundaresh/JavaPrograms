package com.xworkz.boot.Specs;

import com.xworkz.app.Specs.Specs;

public class SpecsRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in SpecsRunner");
		
		Specs specs=new Specs();
		
		specs.lens("Convex", 12);

	}

}
