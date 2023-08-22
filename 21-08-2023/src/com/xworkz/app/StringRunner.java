package com.xworkz.app;

public class StringRunner {

	public static void main(String[] args) {
		String s=new String();
		s="Vinay";
		
		//Instance methods of String
		
		String v=s.toUpperCase();
		String l=s.toLowerCase();
		char k=s.charAt(0);
		int n=s.codePointAt(0);
		String con=s.concat("Sundaresh");
		
		
		System.out.println("The string value is "+s);
		System.out.println("The uppercase of the String is "+v);
		System.out.println("The lowercase of the String is "+l);
		System.out.println("The character at index 0 is "+k);
		System.out.println("The code point at index 0 is "+n);//Unicode, the particular sequence of bits is called a code unit – for the UCS-4 encoding, any code
		System.out.println("The concatination result of String is "+con);
		
		//Static methods of String
		
		char[] a={'v','i','n','a','y'};
		String copy=s.copyValueOf(a);
		System.out.println("Copy value of converts char values into String is "+copy);
		
		String value=s.valueOf(false);//Returns the string representation of the boolean argument.
		System.out.println("The valueOf(true) is "+value);
		
		String m=s.valueOf('s');//Returns the string representation of the char argument.
		System.out.println("The valueOf() is "+m);
		
		double d=12.0976;
		String j=s.valueOf(d);
		System.out.println("The valueOf(double) is "+j);//Returns the string representation of the double argument.
		
		int i=2;
		String p=s.valueOf(i);
		System.out.println("The valueOf(int) is "+i);//Returns the string representation of the int argument.
		
		
		
		
	}
}