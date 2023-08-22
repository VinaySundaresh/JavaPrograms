package com.xworkz.app;

public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Running main in ThreadRunner");
		
		System.out.println("----------------------------------------------------------------------------------------------");
		
		Thread thread=new Thread();
		thread.checkAccess();
		//thread.destroy();
		thread.interrupt();
		thread.join();
		//thread.notify();
		
		System.out.println("---------------------------------------------------------------------");
		
	}

}
