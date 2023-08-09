package com.xworkz.boot;

import com.xworkz.app.Animals;
import com.xworkz.app.Zoo;

public class ZooRunner {

	public static void main(String[] args) {
		System.out.println("invoking mian in ZooRunner");
		
		Zoo z=new Animals();
		z.show();
		z.show("Bannergatta");
		z.show("Bannergatta", "Bannergatta");
		z.show("Bannergatta", "Bannergatta",22);
		z.show("Bannergatta", "Bannergatta",22,9);
		z.show("Bannergatta", "Bannergatta",22,9,8);
		
		System.out.println("------------------------------------------------------------------");
		
		Animals a =new Animals();
		a.show();
		a.show("Bannergatta");
		a.show("Bannergatta", "Bannergatta");
		a.show("Bannergatta", "Bannergatta",22);
		a.show("Bannergatta", "Bannergatta",22,9);
		a.show("Bannergatta", "Bannergatta",22,9,8);
		

	}

}
