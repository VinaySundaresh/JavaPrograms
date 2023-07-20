class FlightNames{
	public static void main(String[] args)
	{
		String flight1="Air India";
		String flight2="IndiGo";
		String flight3="SpiceJet";
		String flight4="GoAir";
		String flight5="Vistara";
		String flight6="AirAsia India";
		String flight7 ="Jet Airways";
		String flight8="Air India Express";
		
		String[] flights={flight1,flight2,flight3,flight4,flight5,flight6,flight7,flight8};
		System.out.println(".....Printing forward order.....");
		
		for(int index=0;index<flights.length;index++)
		{
			System.out.println("Flight Name at index "+index+ " is " +flights[index]);
		}
		
		System.out.println("\n");
		
		
		System.out.println(".....Updating the array values.....");
		
		flights[4]="Alliance Air";
		flights[6]="TruJet";
		
		System.out.println("\n");
		
		System.out.println(".....Printing backward order.....");
		
		for(int index=flights.length-1;index>=0;index--)
		{
			System.out.println("Flight Name  at index "+index+ " is " +flights[index]);
		}
		
		
	}
}