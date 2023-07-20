class Cake{
	static void tasty(String name,String type,String bakeryName,double price,int noOfPieces,String occasion)
	{
		System.out.println("Running tasty in Cake");
		System.out.println("Cake Name :"+name);
		System.out.println("Cake type :"+type);
		System.out.println("Bakery Name :"+bakeryName);
		System.out.println("Cake price :"+price);
		System.out.println("Number of pieces :"+noOfPieces);
		System.out.println("Occassion :"+occasion);
		
		if(name!=null)
	{
		System.out.println("name is valid");
	
	}
	else
	{
		System.err.println("name is in-valid");
		return;
	}
	
	if(type!=null)
	{
		System.out.println("type is valid");
	
	}
	else
	{
		System.err.println("type is in-valid");
		return;
	}
	
	if(price>250.0)
	{
		System.out.println("price is valid");
	
	}
	else
	{
		System.err.println("price is in-valid");
		return;
	}
	
	if(noOfPieces>6)
	{
		System.out.println("No of pieces is valid");
	
	}
	else
	{
		System.err.println("No of pieces is in-valid");
		return;
	}
	
	if(occasion!=null)
	{
		System.out.println("occasion is valid");
	
	}
	else
	{
		System.err.println("occasion is in-valid");
		return;
	}
	}
}