package com.xworkz.boot;

import com.xworkz.app.Mall;
import com.xworkz.app.ShoppingMall;

public class MallRunner {

	public static void main(String[] args)
	{
		System.out.println("invoking main in MallRunner");
		
		Mall mall=new ShoppingMall();
		mall.display();
		mall.display("GT mall");
		mall.display("GT mall", "VIjayanAgr");
		mall.display("GTMALL", "Toll GAte", "FootBall");
		mall.display("GTMAll", "VIJAYANAGAR", "Maccalum", 5);
		mall.display("GTMAll", "VIJAYANAGAR", "Maccalum", 5,53);
		
		ShoppingMall shopping=new ShoppingMall();
		shopping.display();
		shopping.display("GT mall");
		shopping.display("GT mall", "VIjayanAgr");
		shopping.display("GTMALL", "Toll GAte", "FootBall");
		shopping.display("GTMAll", "VIJAYANAGAR", "Maccalum", 5);
		shopping.display("GTMAll", "VIJAYANAGAR", "Maccalum", 5,53);
		
	}
}
