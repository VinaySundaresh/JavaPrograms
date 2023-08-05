package com.xworkz.boot.Gold;

import com.xworkz.app.Gold.Gold;
import com.xworkz.app.Gold.Jwellery;

public class GoldRunner {

	public static void main(String[] args) {
		Gold gold=new Gold();
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Color of gold is "+gold.color);
		System.out.println("Purpose of gold is "+gold.purpose);
		System.out.println("Price of the gold is "+gold.price);
		System.out.println("Shop name is "+gold.shopName);
		
		System.out.println("------------------------------------------------------------------");
		
		Jwellery jwellery=new Jwellery("Gold",2500,"Chain","Puneeth bars");
		
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Color of gold is "+jwellery.color);
		System.out.println("Purpose of gold is "+jwellery.purpose);
		System.out.println("Price of the gold is "+jwellery.price);
		System.out.println("Shop name is "+jwellery.shopName);

	}

}
