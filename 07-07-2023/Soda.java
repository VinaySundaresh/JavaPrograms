class Soda{
static void coldDrink(String name,double price,String expDate)
{
	System.out.println("Invoking coldDrink in Soda");
	System.out.println("Name :"+name);
	System.out.println("Price : "+price);
	System.out.println("Expiray date :"+expDate);
	
	if(name!=null)
	{
		System.out.println("name is valid");
	
	}
	else
	{
		System.out.println("name is in-valid");
		return;
	}
	
	if(price>10.0)
	{
		System.out.println("price is valid");
	
	}
	else
	{
		System.out.println("price is in-valid");
		return;
	}
	
}
}