class GymKiller{
	public static void main (String[] values)
	{
		
		/*String gymName;
	String TrainerName;
	float pricePerMonth;
	String exerciseName;
	int noOfHours;
	*/
		System.out.println("running main in GymKiller");
        Gym g=new Gym();
     	System.out.println(g.gymName);
		System.out.println(g.TrainerName);
		System.out.println(g.pricePerMonth);
		System.out.println(g.exerciseName);
		System.out.println(g.noOfHours);


		 
		g.gymName="Fitness Gym";
		g.TrainerName="Yogaraj";
		g.pricePerMonth=1200.0f;
		g.exerciseName="Push Ups";
		g.noOfHours=2;
		
		System.out.println(g.gymName);
		System.out.println(g.TrainerName);
		System.out.println(g.pricePerMonth);
		System.out.println(g.exerciseName);
		System.out.println(g.noOfHours);
		
		System.out.println("------------");
		System.out.println("Second object values...");
		
		Gym g1=new Gym();
     	System.out.println(g1.gymName);
		System.out.println(g1.TrainerName);
		System.out.println(g1.pricePerMonth);
		System.out.println(g1.exerciseName);
		System.out.println(g1.noOfHours);

		g1.gymName="Health with fitness Gym";
		g1.TrainerName="Darshan";
		g1.pricePerMonth=1000.0f;
		g1.exerciseName="Pull over";
		g1.noOfHours=1;
		
		System.out.println(g1.gymName);
		System.out.println(g1.TrainerName);
		System.out.println(g1.pricePerMonth);
		System.out.println(g1.exerciseName);
		System.out.println(g1.noOfHours);
		
		


	}

}
