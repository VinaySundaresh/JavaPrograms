class Resume{
	static void format()
	{
		System.out.println("This is the resume format");
	}
	
	static void format(int pages, String type)
	{
		System.out.println("The type of resume must be "+type);
	}
	
	static void format(String type,int pages)
	{
		System.out.println("The type of resume must be "+type+"with "+pages);
	}
	static void clear()
	{
		System.out.println("Clear the details in resume");
	}
	static void delete()
	{
		System.out.println("Delete the details in resume");
	}
}