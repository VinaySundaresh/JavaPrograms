package com.xworkz.boot.Mouse;

import com.xworkz.app.Mouse.Mouse;

public class MouseRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking main in MouseRunner");
		Mouse key=new Mouse();
		key.point();
		System.out.println("\n");
		key.point("Hp",1150);


	}

}
