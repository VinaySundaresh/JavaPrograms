class Scanner{
	
	static void scan(String code,long phoneNumber,String name)
	{
		System.out.println("Invoking scan in Scanner");
		System.out.println("Code  :"+code);
		System.out.println("Phone Number :"+phoneNumber);
		System.out.println("Name :"+name);
		
	if(code!=null)
	{
		System.out.println("code is valid");
	
	}
	else
	{
		System.out.println("code is in-valid");
		return;
	}
	
	if(name!=null)
	{
		System.out.println("name is valid");
	
	}
	else
	{
		System.out.println("name is in-valid");
		return;
	}
	}
}