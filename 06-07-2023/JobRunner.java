class JobRunner{
	public static void main(String [] args)
	{
		System.out.println(".....Running main in JobRunner.....");
		
		Job.apply();
		Job.apply("Vinay",3);
		Job.apply("Rakesh",2,"Jayanth");
		Job.apply(4);
		Job.rejectOffer();
		
	}
}