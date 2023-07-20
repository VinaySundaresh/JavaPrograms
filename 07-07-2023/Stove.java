class Stove{
static void stoveDetails(String name,int burnerCount,String type,double price)
{
	System.out.println("Invoking stoveDetails in Stove");
	
	System.out.println("Name :"+name);
	System.out.println("Burner Count :"+burnerCount);
	System.out.println("Type of Stove :"+type);
	System.out.println("Price :"+price);
	
	if(name !=null)
	{
		System.out.println("Nameof stove is valid");
	
	}
	else
	{
		System.out.println("Name of stove is in-valid");
		return;
	}
	
	if(burnerCount>=2)
	{
		System.out.println("Burner count is more than or equal to 2");
	}
	else{
		System.out.println("Burner count is less than 2");
		return;
	}
	
	if(type !=null)
	{
		System.out.println("Typeof stove is valid");
		
	}
	else
	{
		System.out.println("Typeof stove is in-valid");
		return;
	}
	
	if(price>=5000.0)
	{
		System.out.println("Price is greater than 5000.0");
		
	}
	else
	{
		System.out.println("Price is not greater than 5000.0");
		return;
	}
	
}
}