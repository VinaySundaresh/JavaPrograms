class TrainName{
	
	static String getTrainName(int trainNo)
	{
		if(trainNo>0)
		{
			System.out.println("Train number is valid");
			if(trainNo==11013)
			{
				return "KSR Bengaluru Jan Shatabdi Express";
			}
			
			if(trainNo==11014)
			{
				return "KSR Bengaluru intercity express";
			}
			
			if(trainNo==12134)
			{
				return "Talguppa-Mysore Express";
			}
			if(trainNo==22691)
			{
				return "yesvantpur intercity express";
			}
			return "No match found";
		}
		else{
			System.out.println("Train Number is in valid");
			return "Invalid";
		}
	}
}