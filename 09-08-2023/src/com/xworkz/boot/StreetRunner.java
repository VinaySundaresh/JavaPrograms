package com.xworkz.boot;

import com.xworkz.app.ChurchStreet;
import com.xworkz.app.Street;

public class StreetRunner {
	public static void main(String[] args)
	{
		System.out.println("invoking main in StreetRunner");
		
		Street street =new  ChurchStreet();
	
		street.road();
		street.road("Magadi road");
		street.road("Magadi road","RajajiNagar");
		street.road("Magadi road","RajajiNagar",true);
		street.road("Magadi road","RajajiNagar",true,12);
		street.road("Magadi road","RajajiNagar",true,12,"Banglore");
		
		System.out.println("------------------------------------------------------------------");
		
		ChurchStreet street1=new ChurchStreet();
		street1.road();
		street1.road("Magadi road");
		street1.road("Magadi road","RajajiNagar");
		street1.road("Magadi road","RajajiNagar",true);
		street1.road("Magadi road","RajajiNagar",true,12);
		street1.road("Magadi road","RajajiNagar",true,12,"Banglore");
	}

}
