class TeacherKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in TeacherKiller");
		
		Teacher t1=new Teacher();
		
		System.out.println(t1.name);
		System.out.println(t1.subject);
		System.out.println(t1.exp);
		System.out.println(t1.phNo);
		System.out.println(t1.address);
		
		t1.name="Renuka";
		t1.subject="English";
		t1.exp=2;
	    t1.phNo=9620689808l;;
	    t1.address="Shivamogga";
		
		System.out.println(t1.name);
		System.out.println(t1.subject);
		System.out.println(t1.exp);
		System.out.println(t1.phNo);
		System.out.println(t1.address);
		
		Teacher t2=new Teacher();
		
		System.out.println(t2.name);
		System.out.println(t2.subject);
		System.out.println(t2.exp);
		System.out.println(t2.phNo);
		System.out.println(t2.address);
		
		t2.name="Mamatha";
		t2.subject="Aptitute";
		t2.exp=3;
	    t2.phNo=8123417466l;;
	    t2.address="Mandya";
		
		System.out.println(t2.name);
		System.out.println(t2.subject);
		System.out.println(t2.exp);
		System.out.println(t2.phNo);
		System.out.println(t2.address);
		                    
		
		
		
	} 		
}