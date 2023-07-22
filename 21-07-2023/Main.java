class Main{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in Main");
		
		Helmet h1=new Helmet("Black",800);
		h1.printStatic();
		h1.printInstance();
		
		System.out.println("=============================================================================");
		
		Bureau b1 =new Bureau(5,1200);
		b1.printStatic();
		b1.printInstance();
	    
		System.out.println("=============================================================================");
		
		Candle c1=new Candle(10,2);
		c1.printStatic();
		c1.printInstance();
		
		System.out.println("=============================================================================");
		
		Brick brick=new Brick(12.35,'M');
		brick.printStatic();
		brick.printInstance();
		
		System.out.println("=============================================================================");
		
		Soil soil=new Soil("clay",98);
		soil.printStatic();
		soil.printInstance();
		
		System.out.println("=============================================================================");
		
		Butterfly butter=new Butterfly("Green",true);
		butter.printStatic();
		butter.printInstance();
		
		System.out.println("=============================================================================");
		
		
	}
}