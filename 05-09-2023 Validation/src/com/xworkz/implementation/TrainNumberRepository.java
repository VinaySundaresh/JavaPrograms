package com.xworkz.implementation;

public interface TrainNumberRepository {
	
	int NO_OFTRAINS=5;
	void store(int trainNo);
	
	boolean isExist(int trainNo);

}
