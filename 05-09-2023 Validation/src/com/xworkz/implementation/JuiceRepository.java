package com.xworkz.implementation;

public interface JuiceRepository {
	
	 int NO_OF_JUICES=5;
	 
	 void store(String juice);
	 
	 boolean isExist(String juice);
}
