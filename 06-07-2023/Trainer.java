//carpenter, electrician,trainer,trainee,contracter  (10 method,2 different methods overloaded,4 methods with parameter,calling method of same class)

class Trainer{
	
	//overloading method teach
	static void teach(String sub1)
	{
		System.out.println("Trainer 1 teaches "+sub1);
	}
	
	static void teach(String sub1,String sub2)
	{
		System.out.println("Trainer 1 teaches "+sub1+" Trainer 2 teaches "+sub2);
	}
	
	
	//overloading method assignment 
	
	static void assignment(int assign)
	{
		System.out.println("Trainer given "+assign+" number of assignmnets today");
	}
	
	static void assignment(int assign ,String topic)
	{
		System.out.println("Trainer given "+assign+" number of assignmnets today with topic "+topic);
	}
	
	//methods with parameter
	
	static void details(String name)
	{
		System.out.println("The name of the Trainer is "+name);
	}
	
	static void evaluate(int marks)
	{
		System.out.println("Trainer evaluated us on the basis of marks "+marks);
	}
	
	static void designation(String design)
	{
		System.out.println("The designation of the trainer is " +design);
	}
	
	static void experience(int exp)
	{
		System.out.println("The experience of Trainer is "+exp);
	}
	
	//method with our wish
	
	static void scold()
	{
		System.out.println("Running scold in Trainer");
		
		//calling method inside a method.
		check();
	}
	
	static void check()
	{
		System.out.println("Running check in Trainer ");
	}
	
	
}