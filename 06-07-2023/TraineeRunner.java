class TraineeRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Running main in TrainerRunner");
		
		Trainee.learn("Java");
		Trainee.learn("Java","MySQL");
		Trainee.skills("Aptitute");
		Trainee.skills("Aptitute",4);
		Trainee.details("Vinay");
		Trainee.age(23);
		Trainee.scores(30);
		Trainee.education("B.E.");
		//calling method inside a method
		Trainee.problemSolving();
		
	}
}