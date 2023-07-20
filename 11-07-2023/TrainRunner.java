class TrainRunner{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in TrainRunner");
		
		String ref=TrainName.getTrainName(11013);
		System.out.println("Train 1 name is "+ref);
		
		String ref1=TrainName.getTrainName(11014);
		System.out.println("Train 2 name is "+ref1);
		
		String ref2=TrainName.getTrainName(12134);
		System.out.println("Train 3 name is "+ref2);
		
		String ref3=TrainName.getTrainName(22691);
		System.out.println("Train 4 name is "+ref3);
		
		String ref4=TrainName.getTrainName(22696);
		System.out.println("Train 5 name is "+ref4);
		
	}
}