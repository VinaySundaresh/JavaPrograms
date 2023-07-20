class Grocery{
	public static void main(String[] args)
	{
		String sugar="Sugar";
        String flour="Flour";
		String salt="Salt";
		String pepper="Pepper";
		String spices="cinnamon";
		String milk="Milk";
		String snacks="Chips";
        String juice="Water Melon";
		
		String[] groceries={sugar,flour,salt,milk,spices,pepper,snacks,juice};
		System.out.println(".....Printing forward order.....");
		
		for(int index=0;index<groceries.length;index++)
		{
			System.out.println("Grocery at index "+index+ " is " +groceries[index]);
		}
		
		System.out.println("\n");
		
		
		System.out.println(".....Updating the array values.....");
		
		groceries[4]="paprika";
		groceries[6]="popcorn";
		
		System.out.println("\n");
		
		System.out.println(".....Printing backward order.....");
		
		for(int index=groceries.length-1;index>=0;index--)
		{
			System.out.println("Grocery at index "+index+ " is " +groceries[index]);
		}
		
		
	}
}