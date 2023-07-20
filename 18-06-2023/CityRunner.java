class CityRunner{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in city");
		
		City c1=new City();
		
		City c2=new City("Shivamogga",577201,"Karnataka");
		
		System.out.println("City name : "+c2.name);
		System.out.println("Pin code : "+c2.pincode);
		System.out.println("State of city belongs to : "+c2.state);
		
	}
}