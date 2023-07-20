class Carrom{
	boolean powder;
	int noOfPlayers;
	String strikerSize;
	int blackPons;
	int whitePons;
	
	Carrom()
	{
		System.out.println("Invoking no-arg constructor in Carrom");
		System.out.println("Powder (yes/no): "+powder);
		System.out.println("Number of Players : "+noOfPlayers);
		System.out.println("Striker size : "+strikerSize);
		System.out.println("Number of blackpons : "+blackPons);
		System.out.println("Number of whitepons : "+whitePons);
	}
	
	Carrom(boolean powder)
	{
		System.out.println("Invoking boolean constructor in Carrom ");
		this.powder=powder;
		
	}
	
	Carrom(boolean powder,int noOfPlayers)
	{
		System.out.println("Invoking (boolean,int) constructor in Carrom ");
		this.powder=powder;
		this.noOfPlayers=noOfPlayers;
		
	}
	
	Carrom(boolean powder,int noOfPlayers,String strikerSize)
	{
		System.out.println("Invoking boolean constructor in Carrom ");
		this.powder=powder;
		this.noOfPlayers=noOfPlayers;
		this.strikerSize=strikerSize;
	}
	
	Carrom(boolean powder,int noOfPlayers,String strikerSize,int blackPons,int whitePons)
	{
		System.out.println("Invoking boolean constructor in Carrom ");
		this.powder=powder;
		this.noOfPlayers=noOfPlayers;
		this.strikerSize=strikerSize;
		this.blackPons=blackPons;
		this.whitePons=whitePons;
		
	}
}