class FabricRunner{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in FabricRunner");
		
		float ref=Fabric.getPrice("cotton");
		System.out.println("The price of cotton is "+ref);
		
		float ref1=Fabric.getPrice("nylon");
		System.out.println("The price of nylon is "+ref1);
		
		float ref2=Fabric.getPrice("polyster");
		System.out.println("The price of polyster is "+ref2);
		
		float ref3=Fabric.getPrice("silk");
		System.out.println("The price of silk is "+ref3);
		
		float ref4=Fabric.getPrice("linen");
		System.out.println("The price of cotton is "+ref4);
		
		float ref5=Fabric.getPrice("woolen");
		System.out.println("The price of woolen is "+ref5);
	}
}