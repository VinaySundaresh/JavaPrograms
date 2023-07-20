class DroneKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in DroneKiller");
		System.out.println("---------------------------------------------");
		double ref=Drone.getDistanceByFlight("Akash","Birthday");
		System.out.println("The value of ref is :"+ref);
		
		System.out.println("---------------------------------------------");
		
		ref=Drone.getDistanceByFlight(null,"Birthday");
		System.out.println("The value of ref is :"+ref);
		
		System.out.println("---------------------------------------------");
		
		ref=Drone.getDistanceByFlight("Rajesh",null);
		System.out.println("The value of ref is :"+ref);
		
		System.out.println("---------------------------------------------");
		
		double ref1=Drone.getPricePerEvent("Engagement");
		System.out.println("The value of ref1 is :"+ref1);
		
		System.out.println("---------------------------------------------");
		
		ref1=Drone.getPricePerEvent(null);
		System.out.println("The value of ref1 is :"+ref1);
		
		System.out.println("---------------------------------------------");
		
		int ref2=Drone.getDiscountByEvent("Birthday","Vinay");
		System.out.println("The value of ref2 is :"+ref2);
		
		System.out.println("---------------------------------------------");
		
		ref2=Drone.getDiscountByEvent(null,"Vinay");
		System.out.println("The value of ref2 is :"+ref2);
		
		System.out.println("---------------------------------------------");
		
		ref2=Drone.getDiscountByEvent("Marriage",null);
		System.out.println("The value of ref2 is :"+ref2);
		
		System.out.println("---------------------------------------------");
		
	}
}