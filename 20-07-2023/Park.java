class Park{
	
	String name;
	String location;
	double distance;
	int length;
	int breadth;
	int width;
	boolean gate;
	int noOfPeople;
	boolean exercise;
	
	Park()
	{
		System.out.println("Invoking no-arg constructor in Park");
		
	}
	
	Park(String name)
	{
		System.out.println("Invoking String constructor in Park");
		this.name=name;
	}
	
	Park(String name,String location)
	{
		this(name);
		System.out.println("Invoking String,string constructor in Park");
		this.location=location;
	}
	
	Park(String name,String location,double distance)
	{
		this(name,location);
		System.out.println("Invoking String,string,double constructor in Park");
		this.distance=distance;
	}
	
	Park(String name,String location,double distance,int length)
	{
		this(name,location,distance);
		System.out.println("Invoking String,string,double,int constructor in Park");
		this.length=length;
	}
	
	Park(String name,String location,double distance,int length,int breadth)
	{
		this(name,location,distance,length);
		System.out.println("Invoking String,string,double,int,int constructor in Park");
		this.breadth=breadth;
	}
	
	Park(String name,String location,double distance,int length,int breadth,int width)
	{
		this(name,location,distance,length,breadth);
		System.out.println("Invoking String,string,double,int,int,int constructor in Park");
		this.width=width;
	}
	
	Park(String name,String location,double distance,int length,int breadth,int width,int noOfPeople)
	{
		this(name,location,distance,length,breadth,width);
		System.out.println("Invoking String,string,double,int,int,int,int constructor in Park");
		this.noOfPeople=noOfPeople;
	}
	
	Park(String name,String location,double distance,int length,int breadth,int width,int noOfPeople,boolean gate)
	{
		this(name,location,distance,length,breadth,width,noOfPeople);
		System.out.println("Invoking String,string,double,int,int,int,int,boolean constructor in Park");
		this.gate=gate;
	}
	
	Park(String name,String location,double distance,int length,int breadth,int width,int noOfPeople,boolean gate,boolean exercise)
	{
		this(name,location,distance,length,breadth,width,noOfPeople,gate);
		System.out.println("Invoking String,string,double,int,int,int,int,boolean,boolean constructor in Park");
		this.exercise=exercise;
	}
	
}