class EngineRunner{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in EngineRunner");
		
		//Passing arguement as Swift
		int ref=Engine.getCCByModel("Swift");
		System.out.println("Ref is :"+ ref);
			
		//Passing arguement as Audi
		int ref1=Engine.getCCByModel("Audi");
		System.out.println("Ref is :"+ ref1);
			
		//Passing arguement as Benz
		int ref2=Engine.getCCByModel("Benz");
		System.out.println("Ref is :"+ ref2);
			
		//Passing arguement as Bently
		int ref3=Engine.getCCByModel("Bently");
		System.out.println("Ref is :"+ ref3);
			
		//Passing arguement as BMW
		int ref4=Engine.getCCByModel("BMW");
		System.out.println("Ref is :"+ ref4);
			
		//Passing arguement as Rapid
		int ref5=Engine.getCCByModel("Rapid");
		System.out.println("Ref is :"+ ref5);
	}
}