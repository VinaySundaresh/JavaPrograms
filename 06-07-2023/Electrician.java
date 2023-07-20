//carpenter, electrician,trainer,trainee,contracter  (10 method,2 different methods overloaded,4 methods with parameter,calling method of same class)

class Electrician{
	
	//overloading method skill
	static void install(String cables)
	{
		System.out.println("Installing "+cables+" in a house ");
	}
	
	static void install(String cables,String switches)
	{
		System.out.println("Installing "+cables+"and "+switches+" in a house");
	}
	
	
	//overloading method measure 
	
	static void measure(int volts)
	{
		System.out.println("Measuring the volts ="+volts +" in Electrician");
	}
	
	static void measure(int volts ,int current)
	{
		System.out.println("Measuring the volts ="+volts +"and Current = "+current);
	}
	
	//methods with parameter
	
	static void details(String name)
	{
		System.out.println("The name of the Electrician is "+name);
	}
	
	static void capacitance(int capacitance)
	{
		System.out.println("The capacitance is "+capacitance);
	}
	
	static void power(int power)
	{
		System.out.println("The power is "+power);
	}
	
	static void experience(int exp)
	{
		System.out.println("The experience of Electrician is "+exp);
	}
	
	//method with our wish
	
	static void temp()
	{
		System.out.println("Running temp in Electrician");
		
		//calling method inside a method.
		repair();
	}
	
	static void repair()
	{
		System.out.println("Running repair in Electrician");
	}
	
	
}