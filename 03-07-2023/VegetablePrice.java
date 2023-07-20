class VegetablePrice{
	public static void main(String[] args)
	{
		float onion=25;
		float tomato=100;
		float ladiesfinger=80;
		float radish=30;
		float ginger=120;
		float garlic=110;
		float brinjal=60;
		float carrot=70;
		
		float[] vegetables={onion,tomato,ladiesfinger,radish,ginger,garlic,brinjal,carrot};
		
		System.out.println(".....Printing forward order.....");
		
		for(int index=0;index<vegetables.length;index++)
		{
			System.out.println("Vegetable price at index "+index+ " is " +vegetables[index]);
		}
		
		System.out.println("\n");
		
		
		System.out.println(".....Updating the array values.....");
		
		vegetables[2]=85;
		vegetables[7]=30;
		
		System.out.println("\n");
		
		System.out.println(".....Printing backward order.....");
		
		for(int index=vegetables.length-1;index>=0;index--)
		{
			System.out.println("Vegetable price at index "+index+ " is " +vegetables[index]);
		}
	}
}