class ElectricianRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Running main in CarpenterRunner");
		
		Electrician.install("Cables");
		Electrician.install("Cables","Switches");
		Electrician.measure(12);
		Electrician.measure(12,5);
		
		Electrician.details("Rakesh");
		Electrician.experience(6);
		Electrician.capacitance(11);
		Electrician.power(10);
		
		//calling method inside a method
		Electrician.temp();
		
	}
}