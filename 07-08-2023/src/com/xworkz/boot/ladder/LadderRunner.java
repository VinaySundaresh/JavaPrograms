package com.xworkz.boot.ladder;

import com.xworkz.app.ladder.Ladder;

public class LadderRunner {
	public static void main(String[] args)
	{
		System.out.println("invoking main in LadderRunner");
		
		Ladder ladder=new Ladder();
		
		ladder.purpose("Wood", 12000.0);
		
	}

}
