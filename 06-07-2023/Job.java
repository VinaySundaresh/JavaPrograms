class Job{
	static void apply()
	{
		System.out.println("Applying for job...");
	}
	
	static void apply(String personName,int exp)
	{
		System.out.println("Job applyed by "+personName+"with "+ exp +"year experience");
	}
	
	static void apply(String name,int exp,String refName)
	{
		System.out.println("Job applyed by "+name+"with "+ exp +"year experience referred by "+refName);
	}
	
	static void apply(int exp)
	{
		System.out.println("Applying for job with "+exp+"years of experience");
	}
	
	static void rejectOffer()
	{
		System.out.println("Rejecting the offer...");
	}
	
	
}