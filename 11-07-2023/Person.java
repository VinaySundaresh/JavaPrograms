class Person{
	
	static int getAgeByName(String name)
	{
		System.out.println("Invoking getAgeByName in Person");
		if(name!=null)
		{
			System.out.println("Name is valid");
			if(name=="Vinay")
			{
				return 23;
			}
			if(name=="Darshan")
			{
				return 22;
			}
			if(name=="Chandan")
			{
				return 20;
			}
			if(name=="Girish")
			{
				return 21;
			}
			if(name=="Venu")
			{
				return 21;
			}
			if(name=="Nagendra")
			{
				return 22;
			}
			if(name=="Veeresh")
			{
				return 36;
			}
			if(name=="Vishal")
			{
				return 18;
			}
			if(name=="Hemanth")
			{
				return 21;
			}
			if(name=="Rajesh")
			{
				return 20;
			}
			return 0;
		}
		else{
			System.out.println("Person name is invalid");
			return 0;
		}
		
	}
	
	static String getEmailByName(String name)
	{
		if(name!=null)
		{
		System.out.println("Name is valid");
			if(name=="Vinay")
			{
				return "vinaysundresh2001@gmail.com";
			}
			if(name=="Darshan")
			{
				return "darshanr@gmail.com";
			}
			if(name=="Chandan")
			{
				return "chandanv@gmail.com";
			}
			if(name=="Girish")
			{
				return "girishmv2001@gmail.com";
			}
			if(name=="Venu")
			{
				return "vinu@gmail.com";
			}
			if(name=="Nagendra")
			{
				return "Nagendra2002@gmail.com";
			}
			if(name=="veeresh")
			{
				return "veeresh1993@gmail.com";
			}
			if(name=="Vishal")
			{
				return "vishalsundresh2001@gmail.com";
			}
			if(name=="Hemanth")
			{
				return "hemanth@gmail.com";
			}
			if(name=="Rajesh")
			{
				return "rajesh@gmail.com";
			}
			return "Email not found";
		}
		else{
			System.out.println("Person name is invalid");
			return "Email doesnot exist";
		}
	}
	
}