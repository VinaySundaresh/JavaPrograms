class Fabric{
	static float getPrice(String fabric)
	{
		System.out.println("Invoking getPrice in Fabric");
		if(fabric!=null)
		{
			System.out.println("Name of fabric is valid");
			if(fabric=="cotton")
			{
				return 120;
			}
			
			if(fabric=="nylon")
			{
				return 85;
			}
			
			if(fabric=="polyster")
			{
				return 67;
			}
			
			if(fabric=="silk")
			{
				return 250;
			}
			
			if(fabric=="woolen")
			{
				return 210;
			}
			if(fabric=="linen")
			{
				return 180;
			}
			return 0;
		}
		else{
			System.out.println("Name of fabric is in-valid");
			return 0;
		}
	}
}