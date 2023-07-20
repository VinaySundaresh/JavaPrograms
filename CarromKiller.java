class CarromKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in CarromKiller");
		
		Carrom c1=new Carrom();
		
		Carrom c2=new Carrom(true);
		
		System.out.println("The power is yes/No :"+c2.powder);
		
		Carrom c3=new Carrom(false,4);
		System.out.println("The power is yes/No :"+c3.powder);
		System.out.println("Number of players is :"+c3.noOfPlayers);
	}
}