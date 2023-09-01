package com.xworkz.chandrayan.app.implementation;

import com.xworkz.chandrayan.app.repository.ArtistRepository;

public class ArtistRepositoryImpl implements ArtistRepository {

	private String[] names=new String[NO_OF_ARTISTS];
	private int pos;
	
	@Override
	public void details(String name) {
		System.out.println("invoking details() in ArtistRepositoryImpl");
		if(this.pos<NO_OF_ARTISTS)
		{
			this.names[pos]=name;
			System.out.println("Artist name "+name +"is added at position "+this.pos);
			pos++;
		}
		else{
			System.err.println("data store is full cannot add new artist");
		}

	}

}
