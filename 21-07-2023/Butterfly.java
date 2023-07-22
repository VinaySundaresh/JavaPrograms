class Butterfly{
	
	String color;
	boolean fly;
	static int noOfWings;
	static int noOfEyes;
	
	Butterfly(String color,boolean fly)
	{
		System.out.println("Invoking no-arg constructor in Butterfly");
		this.color=color;
		this.fly=fly;
	}
	
	static{
		System.out.println("Invoking static block in Butterfly");
		noOfEyes=2;
		noOfWings=2;
		
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Butterfly ");
		System.out.println("No of Eyes of a Butterfly : "+noOfEyes);
		System.out.println("No of Wings :"+noOfWings);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Butterfly");
		System.out.println("Whwther butterfly able to fly?? :"+fly);
		System.out.println("color of Butterfly :"+noOfEyes);
	}
	
}