class PhotoFrameKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in PhotoFramekiller");
		
		PhotoFrame p1=new PhotoFrame();
		PhotoFrame p2=new PhotoFrame("Digital photoshop ",500.0f,"Circle");
		
		System.out.println("Name of photoFrame shop : "+p2.shopName);
		System.out.println("Price of photoFrame : "+p2.price);
		System.out.println("Shape of the photo Frame : "+p2.shape);
	}
}