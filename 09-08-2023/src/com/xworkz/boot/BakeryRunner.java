package com.xworkz.boot;

import com.xworkz.app.Bakery;
import com.xworkz.app.Cake;

public class BakeryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main In BakeryRunner");
		
		System.out.println("--------------------------------------------------------");
		
		Bakery bakery=new Cake();
		
		bakery.bake();
		bakery.bake("Vandana");
		bakery.bake("Vandana", "Shivamogga");
		bakery.bake("Vandana", "Shivamogga", "1216241557");
		bakery.bake("Vandana", "Shivamogga", "1216241557", 20);
		bakery.bake("Vandana", "Shivamogga", "1216241557", 20,20000.0);
		
		System.out.println("--------------------------------------------------------");
		
		Cake bakery1=new Cake();
		
		bakery1.bake();
		bakery1.bake("Vandana");
		bakery1.bake("Vandana", "Shivamogga");
		bakery1.bake("Vandana", "Shivamogga", "1216241557");
		bakery1.bake("Vandana", "Shivamogga", "1216241557", 20);
		bakery1.bake("Vandana", "Shivamogga", "1216241557", 20,20000.0);
		
	}

}
