package com.xworkz.boot;

import com.xworkz.app.Dog;
import com.xworkz.app.ElectricCar;
import com.xworkz.app.Employee;
import com.xworkz.app.Manager;
import com.xworkz.app.Movie;
import com.xworkz.app.ShortMovie;
import com.xworkz.app.SocialMedia;
import com.xworkz.app.UnderGraduate;
import com.xworkz.app.YouTube;

public class Main {

	public static void main(String[] args) {
		System.out.println("invoking main in Main");
		
		ElectricCar myElectricCar = new ElectricCar("Tesla", "Model S", "100 kWh");

        myElectricCar.startEngine();
        myElectricCar.accelerate();
        myElectricCar.brake();
        myElectricCar.stopEngine();

        myElectricCar.refuel();
        myElectricCar.getMileage();
        System.out.println(myElectricCar.getColor());
        System.out.println("Make: " + myElectricCar.getMake());
        System.out.println("Model: " + myElectricCar.getModel());
        
        System.out.println("------------------------------------------------------------");
        
        Dog myDog = new Dog("Buddy", 3);
        

        myDog.makeSound();
        myDog.eatFood();
        myDog.sleepHours();
        myDog.displayInfo();
        
        System.out.println("------------------------------------------------------------");
        
        UnderGraduate undergrad=new UnderGraduate("Alice", 20);
        //GraduateStudent gradStudent = new GraduateStudent("Bob", 25);

        undergrad.study();
        undergrad.attendClasses();
        undergrad.submitAssignment();
        undergrad.takeExams();
        undergrad.displayInfo();
        
        System.out.println("------------------------------------------------------------");
        
        Movie movie = new ShortMovie();
		movie.action();
		movie.audio();
		movie.climax();
		movie.dance();
		movie.display();
		movie.releaseDate();
		movie.teaser();
		movie.theme();
		movie.trailer();
		movie.video();
		System.out.println("--------------------------------------------------------------");
		
		//System.out.println("------------------------------");
		Employee employee = new Manager();
		employee.awards();
		employee.dedication();
		employee.ethics();
		employee.experience();
		employee.interest();
		employee.job();
		employee.jobrole();
		employee.knowledge();
		employee.presenationStyle();
		employee.skills();
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("------------------------------");
		SocialMedia socialMedia = new YouTube();
		socialMedia.audio();
		socialMedia.dislikes();
		socialMedia.display();
		socialMedia.entertainment();
		socialMedia.likes();
		socialMedia.subscribers();
		socialMedia.theme();
		socialMedia.trend();
		socialMedia.users();
		socialMedia.video();
        
	}

}
