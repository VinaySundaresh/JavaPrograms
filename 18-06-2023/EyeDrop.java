class EyeDrop{
	
	String name="Pivilon";
	String purpose="Eye Redness";
	float price=200.0f;
	
	EyeDrop(){
		System.out.println("Invoking no-arg constructor in EyeDrop..");
		
		System.out.println("Name of eye Drop is "+this.name);
		System.out.println("Purpose of eye Drop is "+this.purpose);
		System.out.println("Price of the eye Drop is"+this.price);
	}
	
	EyeDrop(String DropName,String DropPurpose,float priceOfDrops)
	{
		System.out.println("Invoking paramaterized constructor in EyeDrop");
		this.name=DropName;
		this.purpose=DropPurpose;
		this.price=priceOfDrops;
	}
	
	
}