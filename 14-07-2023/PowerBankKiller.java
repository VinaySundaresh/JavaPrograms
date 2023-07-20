class PowerBankKiller{
	public static void main (String[] values)
	{
		/*String name;
	int capacityIntake;
	int capacityOutput;
	String supports;//ctype/normal
	int manufactureYear;*/
	
	
		System.out.println("running main in PocketKiller");
		PowerBank p1=new PowerBank();
		System.out.println(p1.name);
		System.out.println(p1.capacityIntake);
		System.out.println(p1.capacityOutput);
		System.out.println(p1.supports);
		System.out.println(p1.manufactureYear);
		
		p1.name="Redmi";
		p1.capacityIntake=30;
		p1.capacityOutput=20;
		p1.supports="C-type";
		p1.manufactureYear=2022;
		
		System.out.println(p1.name);
		System.out.println(p1.capacityIntake);
		System.out.println(p1.capacityOutput);
		System.out.println(p1.supports);
		System.out.println(p1.manufactureYear);
		
		System.out.println("------------");
		System.out.println("Second object values...");
		
		PowerBank p2=new PowerBank();
		System.out.println(p2.name);
		System.out.println(p2.capacityIntake);
		System.out.println(p2.capacityOutput);
		System.out.println(p2.supports);
		System.out.println(p2.manufactureYear);
		
		p2.name="OnePlus";
		p2.capacityIntake=33;
		p2.capacityOutput=18;
		p2.supports="C-type";
		p2.manufactureYear=2023;
		
		System.out.println(p2.name);
		System.out.println(p2.capacityIntake);
		System.out.println(p2.capacityOutput);
		System.out.println(p2.supports);
		System.out.println(p2.manufactureYear);
		


	}

}
