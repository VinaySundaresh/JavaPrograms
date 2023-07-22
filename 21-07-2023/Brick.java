class Brick{
	
	static String type;
	static String color;
	double pricePerBrick;
	char size;
	
	Brick(double pricePerBrick,char size)
	{
		System.out.println("Invoking no-arg constructor in Brick");
		this.pricePerBrick=pricePerBrick;
		this.size=size;
	}
	
	static{
		System.out.println("Invoking static block in Brick");
		type="Cement";
		color="grey";
		
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Brick ");
		System.out.println("Type of the brick is  "+type);
		System.out.println("Color of brick is "+color);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Brick");
		System.out.println("Price of the brick is "+pricePerBrick);
		System.out.println("Size of brick is "+size);
	}
	
	
}