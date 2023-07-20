class Main
{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in Main");
		
		Wood w1=new Wood();
		Wood w2=new Wood("Sagwani");
		Wood w3=new Wood("Timber",1200.0);
		System.out.println("====================================================================================");
		Mall m1=new Mall();
		Mall m2=new Mall("Lulu","rajaji Nagar",2.3);
		Mall m3=new Mall("Mantri Square Mall ","Mahalaksmi layout ",4.3,6,4,true,true);
		System.out.println("====================================================================================");
		Park p1=new Park();
		Park p2=new Park("Gandhi park");
		
		Park p3=new Park("gandhi park","Shivamogga");
		System.out.println("====================================================================================");
	}
}