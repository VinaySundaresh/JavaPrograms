class CarpenterRunner{
	public static void main(String [] args)
	{
		System.out.println("Running main in CarpenterRunner");
		
		Carpenter.skill();
	    Carpenter.skill("plaining");
		Carpenter.measure(12);
		Carpenter.measure(12,10);
		Carpenter.details("Vinay");
		Carpenter.contact(9620689808l);
		Carpenter.address("Shivamogga");
		Carpenter.experience(3);
		
		//calling method inside method i.e repair
		Carpenter.frame();
		
	}
}w