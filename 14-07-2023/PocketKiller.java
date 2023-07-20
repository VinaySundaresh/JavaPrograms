class PocketKiller{
	public static void main (String[] values)
	{
		System.out.println("running main in PocketKiller");
		Pocket p1=new Pocket();
		System.out.println(p1.size);
		System.out.println(p1.color);
		System.out.println(p1.brand);
		System.out.println(p1.dress);
		System.out.println(p1.noOfPocket);
		System.out.println(p1.material);

		 
		p1.size=20;
		p1.color="blue";
		p1.dress="Shirt";
		p1.brand="Lenin";
		p1.noOfPocket=2;
		p1.material="cotton";
		
		System.out.println(p1.size);
		System.out.println(p1.color);
		System.out.println(p1.brand);
		System.out.println(p1.dress);
		System.out.println(p1.noOfPocket);
		System.out.println(p1.material);

		System.out.println("------------");
		System.out.println("Second object values...");
		
		Pocket p2=new Pocket();
		System.out.println(p2.size);
		System.out.println(p2.color);
		System.out.println(p2.brand);
		System.out.println(p2.dress);
		System.out.println(p2.noOfPocket);
		System.out.println(p2.material);

		

		 
		p2.size=10;
		p2.color="Green";
		p2.dress="Pant";
		p2.brand="Denim";
		p2.noOfPocket=3;
		p2.material="Nylon";
		
		System.out.println(p2.size);
		System.out.println(p2.color);
		System.out.println(p2.brand);
		System.out.println(p2.dress);
		System.out.println(p2.noOfPocket);
		System.out.println(p2.material);


	}

}
