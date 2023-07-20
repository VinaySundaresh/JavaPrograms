class Khulfi{
	static void ice(String name,String taste,int count)
	{
		System.out.println("Invoking ice in khulfi");
		System.out.println("Name of Khulfi :"+name);
		System.out.println("Taste :"+taste);
		System.out.println("count :"+count);
		
	if(name!=null)
	{
		System.out.println("name is valid");
	
	}
	else
	{
		System.out.println("name is in-valid");
		return;
	}
	
	if(taste!=null)
	{
		System.out.println("taste is valid");
	
	}
	else
	{
		System.out.println("taste is in-valid");
		return;
	}
	if(count>2)
	{
		System.out.println("count is valid");
	
	}
	else
	{
		System.out.println("count is in-valid");
		return;
	}
	
	}
}