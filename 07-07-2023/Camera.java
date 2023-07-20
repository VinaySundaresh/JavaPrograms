class Camera{
	static void click(String location,String date,int howManyPeople,double resolution,String clarity,String cameraMan)
	{
		System.out.println("Running click in Camera");
		System.out.println("Location Name :"+location);
		System.out.println("Date :"+date);
		System.out.println("No of People:"+howManyPeople);
		System.out.println("Resolution :"+resolution);
		System.out.println("Clarity :"+clarity);
		System.out.println("Camera Man :"+cameraMan);
		
		if(location!=null)
	{
		System.out.println("location is valid");
	
	}
	else
	{
		System.out.println("location is in-valid");
		return;
	}
	
	if(howManyPeople>3)
	{
		System.out.println("no of people is valid");
	
	}
	else
	{
		System.err.println("no of people is in-valid");
		return;
	}
	
	if(resolution!=null)
	{
		System.out.println("resolution is valid");
	
	}
	else
	{
		System.out.println("resolution is in-valid");
		return;
	}
	
	if(cameraMan!=null)
	{
		System.out.println("cameraMan is valid");
	
	}
	else
	{
		System.out.println("cameraMan is in-valid");
		return;
	}
	}
}