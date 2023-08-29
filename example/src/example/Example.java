package example;

public class Example {
	
	public static String name;
	public String address;
	public int number;
	public float decimal;
	
	public Example(String address,int number,float decimal){
		this.address=address;
		this.number=number;
		this.decimal=decimal;	
	}
	
	
	
	public static void main(String[] args){
	
	System.out.println("invoking in example");
	
	
	Example.name="veeresh";
	
	Example example=new Example("rajainagar 2nd block bengaluru", 4152, 14.1f);
	
	
	System.out.println("Address :"+example.address);
	System.out.println("Decimal :"+example.decimal);
	System.out.println("Number :"+example.number);
	System.out.println(name);
	
	
	
	
	
	
	
	}
	
	

}