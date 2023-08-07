package com.xworkz.boot.plier;

import com.xworkz.app.Plier.Plier;

public class PlierRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Plierrunner");
		
		Plier kit=new Plier();
		kit.tool();
		System.out.println("\n");
		kit.tool("Knipex",'M');


	}

}
