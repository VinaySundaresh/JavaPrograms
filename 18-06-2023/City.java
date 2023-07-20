class City{
	
	String name="Shikaripura";
	int pincode=566202;
	String state="Karnataka";
	
	City()
	{
		System.out.println("Invoking no-arg constructor of city");
		System.out.println("Name of the city : "+this.name);
		System.out.println("Pin code : "+this.pincode);
		System.out.println("State of city belongs to : "+this.state);
	}
	
	City(String name,int pincode,String state)
	{
		System.out.println("Invoking parameterized constructor in City");
		this.name=name;
		this.pincode=pincode;
		this.state=state;
		
	}
	
}