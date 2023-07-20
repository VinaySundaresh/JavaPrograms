class Police{
	
	String type="Railway";
	String policeName="Ramappa";
	long policeNum=9964406090l;
	
	Police()
	{
		System.out.println("Invoking no-arg constructor in Police");
		System.out.println("Policetype : "+this.type);
		System.out.println("Police name : "+this.policeName);
		System.out.println("Police number : "+this.policeNum);
	}
	
	Police(String type,String policeName,long policeNum)
	{
		System.out.println("Invoking paramaterized constructor in Police");
		this.type=type;
		this.policeName=policeName;
		this.policeNum=policeNum;
	}
	
}