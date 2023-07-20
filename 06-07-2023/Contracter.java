//carpenter, electrician,trainer,trainee,contracter  (10 method,2 different methods overloaded,4 methods with parameter,calling method of same class)

class Contracter{
	
	//overloading method skill
	
	static void plan(String resources)
	{
		System.out.println("Contracter palns for the "+resources+" available ");
	}
	
	static void plan(String resources ,String sketch)
	{
		System.out.println("Contracter palns for the "+resources+" available with "+sketch);
	}
	
	
	//overloading method cost
	
	static void cost(float labour)
	{
		System.out.println("Labour cost may come around "+labour);
	}
	
	static void cost(float labour,float material)
	{
		System.out.println("Labour cost may come around "+labour +"and material cost will come around "+material);
	}
	
	//methods with parameter
	
	static void details(String name)
	{
		System.out.println("The name of the Contracter is "+name);
	}
	
	static void contract(int years)
	{
		System.out.println("COntract period is for  "+years+" years");
	}
	
	static void experience (int exp)
	{
		System.out.println("The experience of the contacter is "+exp);
	}
	
	static void address(String address)
	{
		System.out.println("The address of contracter is "+address);
	}
	
	//method with our wish
	
	static void documentation()
	{
		System.out.println("Running Documentation in Contracter ");
		
		//calling method inside a method.
		communicate();
	}
	
	static void communicate()
	{
		System.out.println("Running communicate in Contracter ");
	}
	
	
}