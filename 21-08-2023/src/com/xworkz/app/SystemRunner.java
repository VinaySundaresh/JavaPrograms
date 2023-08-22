package com.xworkz.app;

import java.io.PrintStream;

public class SystemRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in SystemRunner");
		
		System.out.println("---------------------------------------------------------");
		int a;
		String env=System.getenv("HOME");
		System.out.println(env);
		
		System.gc();
		PrintStream err;
		//System.out.println(System.setErr(err));
		
		
	}

}
