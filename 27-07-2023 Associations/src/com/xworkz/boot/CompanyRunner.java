package com.xworkz.boot;

import com.xworkz.app.Auditor;
import com.xworkz.app.Company;
import com.xworkz.app.Movie;
import com.xworkz.app.Producer;

public class CompanyRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in CompanyRUnner");
		System.out.println("--------------------------------------------------------------");
		Movie movie=new Movie();
		 String name=movie.name;
		 String lang=movie.lang;
		 
		System.out.println("name of the movie is "+name);
		System.out.println("Language of the movie is "+lang);
		
		System.out.println("--------------------------------------------------------------");
		Producer producer=movie.producer;
		double budget=producer.budget;
		long mobNo=producer.mobNo;
		System.out.println("Budget of the movie is "+budget);
		System.out.println("Mobile number of producer is "+mobNo);
		
		System.out.println("--------------------------------------------------------------");
		Auditor auditor=producer.auditor;
		long adharNo=auditor.adharNo;
		System.out.println("Adhar number of auditor is "+adharNo);
		
		System.out.println("--------------------------------------------------------------");
		Company company=auditor.company;
		String names=company.name;
		String location=company.location;
		//System.out.println("--------------------------------------------------------------");
		System.out.println("Name of the company is "+names);
		System.out.println("Location of the company is "+location);
		

	}

}
