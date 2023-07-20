class WeighMachine{
	static void weight(String item,double weightInGms,String type)
	{
		System.out.println("Running weight in weighMachine");
		System.out.println("Item Name :"+item);
		System.out.println("Weight in grams :"+weightInGms);
		System.out.println("Type :"+type);
		
	if(item !=null)
	{
		System.out.println("item is valid");
	
	}
	else
	{
		System.out.println("item is in-valid");
		return;
	}
	
	if(weightInGms>100.0)
	{
		System.out.println("Weight is greater than 100.0");
	
	}
	else
	{
		System.out.println("Weight is less than 100.0");
		return;
	}
	if(type !=null)
	{
		System.out.println("Type in WeighMachine is valid");
	
	}
	else
	{
		System.out.println("Type in WeighMachine is in-valid");
		return;
	}
	
	
	}
}