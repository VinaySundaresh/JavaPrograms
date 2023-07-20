class Biscuits{
	public static void main(String[] args)
	{
		String oreo="Oreo";
		String digestive="Digestive";
		String shortbread="Shortbread";
		String marie ="Marie Biscuit";
		String cream="Cream Crackers";
		String bourbon="Bourbon";
		String graham="Graham Crackers";
		String ginger="Ginger Snaps";
		
		String[] biscuits={oreo,digestive,shortbread,marie,cream,bourbon,graham,ginger};
		System.out.println(".....Printing forward order.....");
		
		for(int index=0;index<biscuits.length;index++)
		{
			System.out.println("Biscuit	at index "+index+ " is " +biscuits[index]);
		}
		
		System.out.println("\n");
		
		
		System.out.println(".....Updating the array values.....");
		
		biscuits[4]="Dark fantacy";
		biscuits[6]="Ginger nuts";
		
		System.out.println("\n");
		
		System.out.println(".....Printing backward order.....");
		
		for(int index=biscuits.length-1;index>=0;index--)
		{
			System.out.println("Biscuit at index "+index+ " is " +biscuits[index]);
		}
		
		
	}
}