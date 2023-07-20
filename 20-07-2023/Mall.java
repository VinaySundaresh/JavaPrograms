class Mall{
	
	String name;
	String location;
	double distance;
	int noOfFloors;
	double ratings;
	boolean foodCourt;
	boolean parking;
	
	Mall()
	{
		System.out.println("Invoking no-arg in Mall");
	}
	
	Mall(String name)
	{
		System.out.println("Invoking string constructor in Mall");
		this.name=name;
	}
	
	Mall(String name,String location)
	{
		this(name);
		System.out.println("Invoking string,String constructor in Mall");
		this.location=location;
	}
	
	Mall(String name,String location,double distance)
	{
		this(name,location);
		System.out.println("Invoking string,String,double constructor in Mall");
		this.distance=distance;
	}
	Mall(String name,String location,double distance,int noOfFloors)
	{
		this(name,location,distance);
		System.out.println("Invoking string,String,double,int constructor in Mall");
		this.noOfFloors=noOfFloors;
	}
	
	Mall(String name,String location,double distance,int noOfFloors,int ratings)
	{
		this(name,location,distance,noOfFloors);
		System.out.println("Invoking string,String,double,int constructor in Mall");
		this.ratings=ratings;
	}
	
	Mall(String name,String location,double distance,int noOfFloors,int ratings,boolean foodCourt)
	{
		this(name,location,distance,noOfFloors,ratings);
		System.out.println("Invoking string,String,double,int,boolean constructor in Mall");
		this.foodCourt=foodCourt;
	}
	
	Mall(String name,String location,double distance,int noOfFloors,int ratings,boolean foodCourt,boolean parking)
	{
		this(name,location,distance,noOfFloors,ratings,foodCourt);
		System.out.println("Invoking string,String,double,int,boolean,boolean constructor in Mall");
		this.parking=parking;
	}
}