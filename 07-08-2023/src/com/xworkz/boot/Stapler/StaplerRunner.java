package com.xworkz.boot.Stapler;

import com.xworkz.app.Stapler.Stapler;

public class StaplerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in staplerrunnre");
		Stapler store=new Stapler();
		store.pin();
		System.out.println("\n");
		store.pin("Hyderon",759);


	}

}
