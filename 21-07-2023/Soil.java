class Soil{

	static String color;
	static boolean crystallin;
	String type;
	double porosity;
	
	Soil(String type,double porosity)
	{
	System.out.println("Invoking no-arg constructor in Soil");
		this.type=type;
		this.porosity=porosity;
	}
	
	static{
		System.out.println("Invoking static block in Soil");
		color="red";
		crystallin=true;
		
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Soil ");
		System.out.println("Color of the soil is  "+color);
		System.out.println("Crystallin property of soil is "+crystallin);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Soil");
		System.out.println("type of the soil is "+type);
		System.out.println("Porosity of soil is "+porosity);
	}
	
}