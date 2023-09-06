package com.xworkz.implementation;

public class JuiceRepositoryImpl implements JuiceRepository {

	private String[] juices=new String[NO_OF_JUICES];
	private int pos;
	
	@Override
	public void store(String juice) {
		System.out.println("Invoking store() in "+this.getClass().getSimpleName());
		
		if(this.pos<NO_OF_JUICES)
		{
			this.juices[pos]=juice;
			System.out.println("Juice "+juice+" is added at position "+this.pos);
		this.pos++;	
		}
		
		else{
			System.err.println("Data store is full cannot add new juice");
		}
		

	}
	
	@Override
	public boolean isExist(String juice) {
		for(int index=0;index<=this.pos;index++)
		{
			String temp=this.juices[index];
			if(temp!=null && temp.equals(juice))
			{
				System.out.println("Juice already exists ...");
				return true;
			}
		}
		return false;
	}

}
