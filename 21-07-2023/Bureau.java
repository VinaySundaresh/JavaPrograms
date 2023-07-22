class Bureau{
		int noOfDoors;
		static int noOfColumns;
		static String lockType;
		double price;
		
		Bureau(int noOfDoors,double price){
			System.out.println("Invoking no -arg constructor in Bureau");
			this.noOfDoors=noOfDoors;
			this.price=price;
		}
		
		static{
			noOfColumns=4;
			lockType="Key";
		}
		
		static void printStatic()
		{
			System.out.println("Invoking printStatic in Bureau ");
			System.out.println("No of Columns :"+noOfColumns);
			System.out.println("LockType is :"+lockType);
		}
		
		void printInstance()
		{
			System.out.println("Invoking printInstance in Bureau ");
			System.out.println("No of doors :"+noOfDoors);
			System.out.println("Price of Bureau :"+price);
		}
		
		
	
}