package com.xworkz.chandrayan.boot;

import com.xworkz.chandrayan.app.implementation.JacketRepositoryImpl;
import com.xworkz.chandrayan.app.repository.JacketRepository;

public class JacketRunner {

	public static void main(String[] args) {
		System.out.println("invoking main() in JacketRunner ");
		
		
		JacketRepository jacketRepository=new JacketRepositoryImpl();
		
		jacketRepository.event("Marriage");
		jacketRepository.event("Reception");
		jacketRepository.event("Naming ceremony");
		jacketRepository.event("Music performance");
		jacketRepository.event("Stage performane");
		jacketRepository.event("Marriage");
		jacketRepository.event("Marriage");
		jacketRepository.event("Marriage");
		jacketRepository.event("Marriage");
		
	}

}
