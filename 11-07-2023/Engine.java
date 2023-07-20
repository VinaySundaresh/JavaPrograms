class Engine{
	static int getCCByModel(String carBrand)
	{
		System.out.println("Invoking getCCByModel in Engine");
		if(carBrand!=null)
		{
			System.out.println("Car brand is valid");
			
			if("Swift" == carBrand)
			{
				return 100;
			}
			if("Rapid" == carBrand)
			{
				return 200;
			}
			if("BMW" == carBrand)
			{
				return 198;
			}
			if("Benz" == carBrand)
			{
				return 220;
			}
			if("Audi" == carBrand)
			{
				return 300;
			}
			if("Bently" == carBrand)
			{
				return 120;
			}
			return 0;
		}
		else{
			System.out.println("Car brand is in-valid");
			return 0;
		}
	}
}