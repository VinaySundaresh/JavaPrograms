package com.xworkz.boot;

import com.xworkz.app.Police;
import com.xworkz.app.PoliceStation;

public class PoliceRunner {

	public static void main(String[] args) {
		System.out.println("inovking main in PoliceRunner");
		
		PoliceStation p=new Police();
		p.arrest();
		p.arrest("Dodpete");
		p.arrest("Dodpete",15);
		p.arrest("Dodpete",20,"Smg");
		p.arrest("Dodpete",20,"Smg",12);
		p.arrest("Dodpete",20,"Smg",12,10.00);
		
		System.out.println("------------------------------------------------------------");
		
		Police p1=new Police();
		p1.arrest();
		p1.arrest("Dodpete");
		p1.arrest("Dodpete",15);
		p1.arrest("Dodpete",20,"Smg");
		p1.arrest("Dodpete",20,"Smg",12);
		p1.arrest("Dodpete",20,"Smg",12,10.00);
		
		

	}

}
