//carpenter, electrician,trainer,trainee,contracter  (10 method,2 different methods overloaded,4 methods with parameter,calling method of same class)

class Trainee{
	
	//overloading method skill
	
	static void learn(String sub1)
	{
		System.out.println("Trainee learns "+sub1+" in week days");
	}
	
	static void learn(String sub1,String sub2)
	{
		System.out.println("Trainee learns "+sub1+" in week days and learns "+sub2+" in weekends");
	}
	
	
	//overloading method skills
	
	static void skills(String skill)
	{
		System.out.println("Trainee 1 is good at "+skill);
	}
	
	static void skills(String skill,int rating)
	{
		System.out.println("Trainee 1 is good at "+skill +" with rating "+rating);
	}
	
	//methods with parameter
	
	static void details(String name)
	{
		System.out.println("The name of the Trainee is "+name);
	}
	
	static void scores(int marks)
	{
		System.out.println("Trainee has scored "+marks+" marks in recent test ");
	}
	
	static void age(int age)
	{
		System.out.println("The age of Trainee is " +age);
	}
	
	static void education(String edu)
	{
		System.out.println("The Trainee has completed "+edu +" recently ");
	}
	
	//method with our wish
	
	static void problemSolving()
	{
		System.out.println("Running Problem solving in Trainee");
		
		//calling method inside a method.
		speak();
	}
	
	static void speak()
	{
		System.out.println("Running speak in Trainee ");
	}
	
	
}