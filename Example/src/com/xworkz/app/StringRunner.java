package com.xworkz.app;

import java.util.Date;

public class StringRunner {

	public static void main(String[] args) {
		
		Date date=new Date();
		Date date1=new Date(2023,8,22);
		System.out.println(date);
	
		boolean d=date.before(date1);
		System.out.println(d);
		
	
	}
}
