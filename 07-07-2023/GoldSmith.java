class GoldSmith{
	
	static void details(String name,long phoneNumber,String address)
	{
		System.out.println("Invoking details in GoldSmith");
		System.out.println("Name :"+name);
		System.out.println("Phone Number :"+phoneNumber);
		System.out.println("Address :"+address);
		
		if(name!=null)
	{
		System.out.println("name is valid");
	
	}
	else
	{
		System.out.println("name is in-valid");
		return;
	}
	
	if(address!=null)
	{
		System.out.println("address is valid");
	
	}
	else
	{
		System.out.println("address is in-valid");
		return;
	}
	}
}