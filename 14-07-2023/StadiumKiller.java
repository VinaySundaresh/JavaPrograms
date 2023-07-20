class StadiumKiller{
	public static void main(String[] args)
	{
		System.out.println("running main in StadiumKiller");
		Stadium s1 = new Stadium();
		System.out.println(s1.width);
		System.out.println(s1.name);
		System.out.println(s1.length);
		System.out.println(s1.location);
		System.out.println(s1.shape);
		
		 
		s1.length=20;
		s1.width=70;
		s1.name="Ramamandir Stadium";
		s1.location="Rajaji Nagar";
		s1.shape="Rectangle";
		
		
		System.out.println(s1.length);
		System.out.println(s1.width);
		System.out.println(s1.location);
		System.out.println(s1.name);
		System.out.println(s1.shape);
		
		System.out.println("------------");
		System.out.println("Second object values...");
		
		
		Stadium s2 = new Stadium();
		System.out.println(s2.width);
		System.out.println(s2.name);
		System.out.println(s2.length);
		System.out.println(s2.location);
		System.out.println(s2.shape);
		

		s2.length=30;
		s2.width=65;
		s2.name="Nehru Stadium";
		s2.location="JP Nagar";
		s2.shape="Circle";
		
		
		System.out.println(s2.length);
		System.out.println(s2.width);
		System.out.println(s2.location);
		System.out.println(s2.name);
		System.out.println(s2.shape);
		
	}
}