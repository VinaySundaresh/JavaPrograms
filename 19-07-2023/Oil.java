class Oil{
	String name;
	double viscosity;
	int quantity;

	Oil(){
		System.out.println("invoking no arg constructor.. of oil");
		String name="local";
		System.out.println(name);//local
		System.out.println(this.name);//null}
	}

	Oil(String name)
	{
		System.out.println("invoking string constructor  of oil");;
		System.out.println("passing name :"+name);
		this.name=name;
	}

	Oil(String name,double viscosity)
	{
		System.out.println("invoking string,double constructor  of oil");;
		System.out.println("passing name :"+name);
		System.out.println("passing viscosity :"+viscosity);
		this.name=name;
		this.viscosity=viscosity;
	}
	Oil(int quantity,double viscosity,String name)
	{
		System.out.println("invoking int,double constructor  of oil");;
		System.out.println("passing quantity :"+quantity);
		System.out.println("passing viscosity :"+viscosity);
		this.quantity=quantity;
		this.viscosity=viscosity;
		this.name=name;
	}
}

