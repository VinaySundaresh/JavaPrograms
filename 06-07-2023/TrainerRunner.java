class TrainerRunner{
	
	public static void main(String [] args)
	{
		System.out.println("Running main in TrainerRunner");
		
		Trainer.teach("Java");
		Trainer.teach("Java","MySQL");
		Trainer.assignment(3);
		Trainer.assignment(3,"Method overloading");
		Trainer.details("Omkar");
		Trainer.experience(11);
		Trainer.evaluate(100);
		Trainer.designation("Software developer");
		//calling method inside a method
		Trainer.scold();
		
	}
}