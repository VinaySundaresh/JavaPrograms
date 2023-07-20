class ElseIfLadder{
	public static void main(String[] IfElseStatement)
	{
		System.out.println("If else statement printing..");
		byte a=10,b=20,c=30;
		System.out.println("The value of a ,b,c is"+a+","+b+","+c);
		if(a>b && a>c)
		{
			System.out.println(a+" is a greater number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+ "is a greater number");
		}
		else{
			System.out.println(c+ "is a greater number");
		}
		
	}
}