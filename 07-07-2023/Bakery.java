class Bakery{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in Bakery");
		WeighMachine.weight("cake",100,"Electronic");
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		Oven.bake("Cake",127.43,"Vandana Bakery");
		//System.out.println("--------------------------------------------------------------------------------------------------");
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		Baker.cooking("Sweet",4,"Baking",5,2,"Yes");
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		Cake.tasty("Pastry","chocolate","Vandana Bakery",400.0,12,"Birthday");
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		Fridge.store("Tomato","carrot","Beans","Green Chilli","Onion","Ginger","Garlic","cucmber","Lemon","radish");
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		Khulfi.ice("khulfi","sweet",3);
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		Scanner.scan("QR",9620689808L,"Vinay");
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		GoldSmith.details("Rajesh",9620689808L,"Shivamogga");
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		Soda.coldDrink("soda",12.3,"12-09-2023");
		
		System.out.println("--------------------------------------------------------------------------------------------------");
		Stove.stoveDetails("prestige",2,"Induction",6432.45);
		
		System.out.println("--------------------------------------------------------------------------------------------------");
	}
}