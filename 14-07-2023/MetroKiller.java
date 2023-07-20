class MetroKiller{
	public static void main (String[] values)
	{
		
		/*int ticketNo;
	float price;
	String destinationName;
	String departure;
	int platformNo;
	*/
		System.out.println("running main in MetroKiller");
		Metro m=new Metro();
		System.out.println(m.ticketNo);
		System.out.println(m.price);
		System.out.println(m.destinationName);
		System.out.println(m.departure);
		System.out.println(m.platformNo);

		m.ticketNo=2022;
		m.price=15.0f;
		m.destinationName="RajajiNagar";
		m.departure="Banashankari";
		m.platformNo=2;
		
		System.out.println(m.ticketNo);
		System.out.println(m.price);
		System.out.println(m.destinationName);
		System.out.println(m.departure);
		System.out.println(m.platformNo);
		
		System.out.println("------------");
		System.out.println("Second object values...");
		
		Metro m1=new Metro();
		System.out.println(m1.ticketNo);
		System.out.println(m1.price);
		System.out.println(m1.destinationName);
		System.out.println(m1.departure);
		System.out.println(m1.platformNo);

		m1.ticketNo=2025;
		m1.price=22.0f;
		m1.destinationName="J P Nagar";
		m1.departure="Nagasandra";
		m1.platformNo=1;
		
		System.out.println(m1.ticketNo);
		System.out.println(m1.price);
		System.out.println(m1.destinationName);
		System.out.println(m1.departure);
		System.out.println(m1.platformNo);
		


	}

}
