class JacketKiller{
	public static void main (String[] values)
	{
		System.out.println("running main in JacketKiller");
		Jacket jacket=new Jacket();
		System.out.println(jacket.size);
		System.out.println(jacket.color);
		System.out.println(jacket.brand);
		System.out.println(jacket.material);
		System.out.println(jacket.noOfJackets);

		jacket.size=42;
		jacket.color="Yellow";
		jacket.brand="Denim";
		jacket.material="nylon";
		jacket.noOfJackets=2;
		
		System.out.println(jacket.size);
		System.out.println(jacket.color);
		System.out.println(jacket.brand);
		System.out.println(jacket.material);
		System.out.println(jacket.noOfJackets);
		
		
		System.out.println("------------");
        System.out.println("Second object values...");
		Jacket jacket1=new Jacket();
		System.out.println(jacket1.size);
		System.out.println(jacket1.color);
		System.out.println(jacket1.brand);
		System.out.println(jacket1.material);
		System.out.println(jacket1.noOfJackets);

		jacket1.size=42;
		jacket1.color="Yellow";
		jacket1.brand="Denim";
		jacket1.material="nylon";
		jacket1.noOfJackets=2;
		
		System.out.println(jacket1.size);
		System.out.println(jacket1.color);
		System.out.println(jacket1.brand);
		System.out.println(jacket1.material);
		System.out.println(jacket1.noOfJackets);

	}

}
