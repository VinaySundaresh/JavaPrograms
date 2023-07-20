class Drone{
	static double getDistanceByFlight(String operator,String event)
	{
		System.out.println("Invoking getDiscountByEvent in Drone");
		if(operator!=null)
		{
			System.out.println("operator is valid..");
			System.out.println("Operator :"+operator);
			return 2;
		}
		else{
			System.out.println("Operator is invalid");
			System.out.println("Operator :"+operator);
			
		}
		
		if(event!=null)
		{
			System.out.println("event is valid..");
			System.out.println("Event :"+event);
			return 1;
		}
		else{
			System.out.println("Event is invalid");
			System.out.println("Event :"+event);
			
		}
		return -1;
	}
	
	//
	static double getPricePerEvent(String eventName)
	{
		System.out.println("Invoking getPricePerEvent in Drone");
		if(eventName!=null)
		{
			System.out.println("Event name is valid..");
			System.out.println("Event name :"+eventName);
			return 1000.0;
		}
		else{
			System.out.println("Event name is invalid");
			System.out.println("Event :"+eventName);
			
		}
		return -1;
	}
	static int getDiscountByEvent(String eventName,String refPerson)
	{
		System.out.println("Invoking getDiscountByEvent in Drone");
		if(eventName!=null)
		{
			System.out.println("event name is valid..");
			System.out.println("Event name :"+eventName);
			return 20;
		}
		else{
			System.out.println("event name is invalid");
			System.out.println("Event name :"+eventName);
			
		}
		
		if(refPerson!=null)
		{
			System.out.println("refPerson is valid..");
			System.out.println("Reference person :"+refPerson);
			return 25;
		}
		else{
			System.out.println("refPerson is invalid");
			System.out.println("Reference person :"+refPerson);
			
		}
		return -1;
	}
}