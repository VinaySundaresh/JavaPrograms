class ContracterRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Running main in ContracterRunner");
		
		Contracter.plan("Resources");
		Contracter.plan("Resources","Materials");
		Contracter.cost(20);
		Contracter.cost(20,40);
		Contracter.details("Ramesh");
		Contracter.experience(5);
		Contracter.contract(5);
		Contracter.address("Shivamogga");
		Contracter.documentation();
		
		
	}
}