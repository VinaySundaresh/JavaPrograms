package com.xworkz.Association.app;

public class Laptop {
	
	Processor processor;
	
	public void setProcessor(Processor processor)
	{
		this.processor=processor;
	}
	
	public void works()
	{
		System.out.println("invoking works() in Laptop");
		//runprograms();
	}
	
	public void runprograms()
	{
		System.out.println("invoking runprograms() in Laptop");
		processor.speed();
		works();
		name();
	}
	
	public void name()
	{
		System.out.println("invoking name() in Laptop");
		dataEntry();
	}
	
	public void dataEntry()
	{
		System.out.println("invoking dataEntry() in Laptop");
	}

}
