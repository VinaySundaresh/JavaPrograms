class Oven{
	static void bake(String dishName,double tempInC,String bakeryName)
	{
		System.out.println("Running bake in Oven");
		System.out.println("Dish Name :"+dishName);
		System.out.println("Temperature for baking :"+tempInC);
		System.out.println("Bakery Name :"+bakeryName);
		
		if(dishName !=null)
	{
		System.out.println("Dish name is valid");
	
	}
	else
	{
		System.out.println("Dish Name is in-valid");
		return;
	}
	
	if(tempInC>300.0)
	{
		System.out.println("Temperature is greater than 300");
	
	}
	else
	{
		System.out.println("Temperature is less than 300");
		return;
	}
	if(bakeryName!=null)
	{
		System.out.println("Bakery name is valid");
	
	}
	else
	{
		System.out.println("Bakery name is in-valid");
		return;
	}
	
	
	}
}