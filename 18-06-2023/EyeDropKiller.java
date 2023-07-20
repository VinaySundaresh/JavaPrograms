class EyeDropKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in EYeDropKiller");
		
		EyeDrop eyedrop=new EyeDrop();
		
		
		
		EyeDrop eyedrop1=new EyeDrop("Nedocromil","Eye irritation",65.99f);
		
		System.out.println("Name of eye Drop is "+eyedrop1.name);
		System.out.println("Purpose of eye Drop is "+eyedrop1.purpose);
		System.out.println("Price of the eye Drop is"+eyedrop1.price);
	}
	
}