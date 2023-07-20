class Wood{
	String type;
	double cost;
	int length;
	int breadth;
	int height;
	
	Wood()
	{
		System.out.println("Invoking no-arg constructor in Wood");
	}
	
	Wood(String type)
	{
		System.out.println("Invoking String constructor in Wood");
		this.type=type;
	}
	
	
	Wood(String type,double cost)
	{
		this(type);
		System.out.println("Invoking String,double constructor in Wood");
		this.cost=cost;
	}
	
	Wood(String type,double cost,int length)
	{
		this(type,cost);
		System.out.println("Invoking String,double,int constructor in Wood");
		this.length=length;
	}
	
	Wood(String type,double cost,int length,int breadth)
	{
		this(type,cost,length);
		System.out.println("Invoking String,double,int,int constructor in Wood");
		this.breadth=breadth;
	}
	
	Wood(String type,double cost,int length,int breadth,int height)
	{
		this(type,cost,length,breadth);
		System.out.println("Invoking String,double,int,int,int constructor in Wood");
		this.height=height;
	}
}