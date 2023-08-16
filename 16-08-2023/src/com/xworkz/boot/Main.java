package com.xworkz.boot;

import com.xworkz.app.Cave;
import com.xworkz.app.Flag;
import com.xworkz.app.Kherchief;
import com.xworkz.app.Logo;
import com.xworkz.app.Pendant;

public class Main {

	public static void main(String[] args) {
		System.out.println("Invoking main in Main...");
		
		System.out.println("-------------------------------------------------------------");

		Flag flag=new Flag();
		
		System.out.println(flag.toString());
		
		Flag flag1=new Flag("three",10);
		
		System.out.println(flag1.toString());
		
		Flag flag3=new Flag("Green",12,14);
		
		System.out.println("-------------------------------------------------------------");
		
		Logo logo=new Logo();
		System.out.println(logo.toString());
		
		Logo logo1=new Logo("God","Polythene",1500);
		System.out.println(logo1.toString());
		
		Logo logo2=new Logo("God","Polythene",1500,"Puma",'s');
		System.out.println(logo2.toString());
		
		System.out.println("-------------------------------------------------------------");

		Kherchief kher=new Kherchief();
		System.out.println(kher.toString());
		
		Kherchief kher1=new Kherchief("cotton",'s',"blue",true);
		System.out.println(kher1.toString());
		
		Kherchief kher2=new Kherchief("cotton",'s',"blue",true,true,"round",true);
		System.out.println(kher2.toString());
		
		System.out.println("-------------------------------------------------------------");

		Cave cave1=new Cave();
		System.out.println(cave1.toString());
		
		Cave cave = new Cave("Crystal Cave", "Solution Cave", "Large", "Chamber", "Stalactites and Stalagmites",
                true, 12.5, 90.0, true, true);
		System.out.println(cave.toString());
		
		Cave cave3 = new Cave("Crystal Cave", "Solution Cave", "Large", "Chamber","Stalactites and Stalagmites",
                true);
		System.out.println(cave3.toString());
		
		System.out.println("-------------------------------------------------------------");
		
		Pendant pen=new Pendant();
		System.out.println(pen.toString());
		
		Pendant pendant = new Pendant("Silver", "Heart-shaped", "Blue", true,
                "Silver chain", 1.5, 1.2, 5.8,
                89.99, true, "Symbolizes love", "Everyday wear");
		System.out.println(pendant.toString());
		
		Pendant pendant1 = new Pendant("Silver", "Heart-shaped", "Blue");
		System.out.println(pendant1.toString());
		
	}

}
