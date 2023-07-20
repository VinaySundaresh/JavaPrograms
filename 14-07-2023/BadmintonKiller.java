class BadmintonKiller{
	public static void main (String[] values)
	{
		
		/*int noOfPlayers;  //variable declaration 
	String CourtName;
	String location;
	String serverName;
	int duration;
	*/
		System.out.println("running main in PocketKiller");
		Badminton b1=new Badminton();
		System.out.println(b1.CourtName);
		System.out.println(b1.location);
		System.out.println(b1.serverName);
		System.out.println(b1.noOfPlayers);
		System.out.println(b1.duration);

		b1.CourtName="RamaMAndir Court";
		b1.location="RajajiNagar";
		b1.serverName="Vinay";
		b1.noOfPlayers=2;
		b1.duration=2;
		
		
		System.out.println(b1.CourtName);
		System.out.println(b1.location);
		System.out.println(b1.serverName);
		System.out.println(b1.noOfPlayers);
		System.out.println(b1.duration);
		
		
		System.out.println("------------");
		System.out.println("Second object values...");
		
		Badminton b2=new Badminton();
		System.out.println(b2.CourtName);
		System.out.println(b2.location);
		System.out.println(b2.serverName);
		System.out.println(b2.noOfPlayers);
		System.out.println(b2.duration);

		b2.CourtName="Nehru Court";
		b2.location="JP Nagar";
		b2.serverName="Rakesh";
		b2.noOfPlayers=4;
		b2.duration=1;
		
		
		System.out.println(b2.CourtName);
		System.out.println(b2.location);
		System.out.println(b2.serverName);
		System.out.println(b2.noOfPlayers);
		System.out.println(b2.duration);
		


	}

}
