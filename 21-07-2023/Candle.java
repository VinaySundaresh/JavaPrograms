class Candle{
	
	static String color;
	static String material;
	double price;
	int duration;
	
	Candle(double price,int duration)
	{
		System.out.println("Invoking no-arg constructor in Candle");
		this.price=price;
		this.duration=duration;
	}
	
	static{
		System.out.println("Invoking static block in candle");
		color="White";
		material="Wax";
	}
	
	static void printStatic()
	{
		System.out.println("Invoking printStatic in Candle ");
		System.out.println("Color of Candle is "+color);
		System.out.println("Material of the candle is "+material);
	}
	
	void printInstance()
	{
		System.out.println("Invoking printInstance in Candle ");
		System.out.println("Price of the candle is :"+price);
		System.out.println("Duration of the candle is "+duration);
	}
	
}