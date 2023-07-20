class Ternary{
	public static void main(String[] TernaryOperator)
	{
		System.out.println("Ternary operator printing..");
		byte a=10,b=20,c=30;
        int d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("Largest Number:"+d);
	}
}