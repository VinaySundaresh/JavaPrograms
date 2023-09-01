package com.xworkz.chandrayan.app.implementation;

import com.xworkz.chandrayan.app.repository.GroceryRepository;

public class GroceryRepositoryImpl implements GroceryRepository {

	private String[] groceries=new String[TOTAL_ITEMS];
	
	private int position;
	@Override
	public void save(String grocery) {
		System.out.println("Invoking save() in GroceryRepositoryImpl");
		
		if(this.position<TOTAL_ITEMS)
		{
			this.groceries[position]=grocery;
			System.out.println("Item added "+grocery+" at position "+this.position);
			this.position++;
		}
		else{
			System.err.println("Data store is full cannnot add a new item");
		}
		
	}

}


