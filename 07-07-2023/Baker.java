class Baker{
	static void cooking(String foodItem,int noOfPeople,String workingFor,int exp,int durationInHours,String assistance)
	{
		System.out.println("Running cooking in Baker");
		System.out.println("Food Item :"+foodItem);
		System.out.println("No of people :"+noOfPeople);
		System.out.println("Working for :"+workingFor);
		System.out.println("Experience :"+exp);
		System.out.println("Duration :"+durationInHours);
		System.out.println("Assistance :"+assistance);
		
	if(foodItem !=null)
	{
		System.out.println("Food item is valid");
	
	}
	else
	{
		System.out.println("Food item is in-valid");
		return;
	}
	
	if(noOfPeople>2)
	{
		System.out.println("No of the people is valid");
	
	}
	else
	{
		System.out.println("No of people is in-valid");
		return;
	}
	
	if(workingFor !=null)
	{
		System.out.println("workingFor is valid");
	
	}
	else
	{
		System.out.println("workingFor is in-valid");
		return;
	}
	
	
	if(exp>2)
	{
		System.out.println("Experience is valid");
	
	}
	else
	{
		System.out.println("Experience is in-valid");
		return;
	}
	if(assistance!=null)
	{
		System.out.println("Assistance is valid");
	
	}
	else
	{
		System.out.println("Assistance is in-valid");
		return;
	}
	
	if(durationInHours>1)
	{
		System.out.println("durationInHours is valid");
	
	}
	else
	{
		System.out.println("durationInHours is in-valid");
		return;
	}
	
	}
}