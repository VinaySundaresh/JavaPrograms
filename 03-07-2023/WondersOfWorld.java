class WondersOfWorld{
	public static void main(String[] args)
	{
		String one="The Great Pyramid of Giza, Egypt";
		String two="Hanging Gardens of Babylon";
		String three="Statue of Zeus at Olympia, Greece";
		String four="Temple of Artemis at Ephesus, Turkey";
		String five="Mausoleum at Halicarnassus, Turkey";
		String six="Colossus of Rhodes, Greece";
		String seven="Lighthouse of Alexandria, Egypt";
		
		String[] wonders={one,two,three,four,five,six,seven};
		
		System.out.println(".....Printing forward order.....");
		
		for(int index=0;index<wonders.length;index++)
		{
			System.out.println("Wonder of World at index "+index+ " is " +wonders[index]);
		}
		
		System.out.println("\n");
		
		
		System.out.println(".....Updating the array values.....");
		
		wonders[6]="Taj MAhal,Agra";
		
		System.out.println("\n");
		
		System.out.println(".....Printing backward order.....");
		
		for(int index=wonders.length-1;index>=0;index--)
		{
			System.out.println("Wonder of World at index "+index+ " is " +wonders[index]);
		}
	}
}