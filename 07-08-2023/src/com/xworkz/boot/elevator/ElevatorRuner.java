package com.xworkz.boot.elevator;

import com.xworkz.app.Elevator.Elevator;

public class ElevatorRuner {

	public static void main(String[] args) {
		System.out.println("invoking main in Elevator");
		Elevator run=new Elevator();
		run.lift();
		System.out.println("\n");
		run.lift("Kaleai",542);

	}

}
