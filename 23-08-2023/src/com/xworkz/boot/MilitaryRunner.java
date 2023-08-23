package com.xworkz.boot;

import com.xworkz.app.IndianMilitary;
import com.xworkz.app.Military;

public class MilitaryRunner {

	public static void main(String[] args) {
		System.out.println("Inovking main() in MilitaryRunner");

		Military military = new IndianMilitary();
		military.lastWar();
		military.protects();
		military.sacrifice();
	}

}
