package com.xworkz.boot;

import com.xworkz.app.Movie;
import com.xworkz.app.Theater;

public class TheaterRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in TheaterRunner");
		
		Theater theat=new Theater();
		theat.watch();
		theat.watch("Navarang");
		theat.watch("Navarang", "RajajiNagar");
		theat.watch("Navarang", "RajajiNagar",150);
		theat.watch("Navarang", "RajajiNagar",150,3);
		theat.watch("Navarang", "RajajiNagar",150,3,5);
		
		System.out.println("-----------------------------------------------------");
		
		
		Movie movie=new Movie();
		movie.watch();
		movie.watch("Navarang");
		movie.watch("Navarang", "RajajiNagar");
		movie.watch("Navarang", "RajajiNagar",150);
		movie.watch("Navarang", "RajajiNagar",150,3);
		movie.watch("Navarang", "RajajiNagar",150,3);
	}
		

}
