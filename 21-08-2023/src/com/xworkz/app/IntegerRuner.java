package com.xworkz.app;

public class IntegerRuner {

	public static void main(String[] args) {
		System.out.println("Invoking main in IntegerRunner");
		
		System.out.println("----------------------------------------------------------------------------");

		
		Integer integer=new Integer(10);
		int one=integer.byteValue();
		System.out.println("The value for one is "+one);//returns the byte value
		
		int two=integer.compareTo(25);//returns o if the two integer values is true
		System.out.println("Whether the integer values is true/false? "+two);
		
		double three=integer.doubleValue();
		System.out.println("Converted integer value to double "+three);
		
		int five= integer.hashCode();//converts into hashcode
		System.out.println("The hashcode value for the integer is "+five);
		
		int six=integer.shortValue();
		System.out.println("The short value of the integer is "+six);
		
		System.out.println("----------------------------------------------------------------------------");
		
		//Static methods
		
		int four=integer.compare(11, 10);
		System.out.println("comapring 3 different numbers is "+four);
		
		int seve=integer.reverse(2);
		System.out.println("The reverse of the 10 is "+seve);
		
		int eigh=integer.max(10, 20);
		System.out.println("The maximum value of two numbers is "+eigh);
		
		int nine=integer.min(10, 20);
		System.out.println("The minimum value of two numbers is "+nine);
		
		String s=integer.toString(25);
		System.out.println("The string value for integer is "+s);

	}

}
