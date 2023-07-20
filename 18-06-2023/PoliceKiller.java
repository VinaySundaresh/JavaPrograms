class PoliceKiller{
	public static void main(String[] args)
	{
		System.out.println("invoking main in policeKiller");
		
		Police p1=new Police();
		Police p2=new Police("Traffic","Vinay",9620689808l);
		
		System.out.println("Police type : "+p2.type);
		System.out.println("Police name : "+p2.policeName);
		System.out.println("Police Number : "+p2.policeNum);
		
	}
}