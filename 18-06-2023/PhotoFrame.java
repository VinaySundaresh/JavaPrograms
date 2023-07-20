class PhotoFrame{
	
	String shopName="Raju Photot Shops";
	float price=300.0f;
	String shape="Oval";
	
	PhotoFrame()
	{
		System.out.println("Invoking no-arg Constructor in PhotoFrame");
		System.out.println("Name of photoFrame shop : "+this.shopName);
		System.out.println("Price of photoFrame : "+this.price);
		System.out.println("Shape of the photo Frame : "+this.shape);
	}
	
	PhotoFrame(String shopName,float price,String shape)
	{
		System.out.println("Invoking paramatarized Constructor in PhotoFrame");
		this.shopName=shopName;
		this.price=price;
		this.shape=shape;
	}
	
}