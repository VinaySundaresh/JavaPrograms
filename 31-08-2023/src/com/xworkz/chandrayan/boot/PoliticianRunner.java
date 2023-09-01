package com.xworkz.chandrayan.boot;

import com.xworkz.chandrayan.app.implementation.PolticianRepositoryImpl;
import com.xworkz.chandrayan.app.repository.PoliticianRepository;

public class PoliticianRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main() in PoliticianRunner");
		
		PoliticianRepository politicianRepository=new PolticianRepositoryImpl();
		politicianRepository.exp("Siddaramaiah");
		politicianRepository.exp("Yeduyurappa");
		politicianRepository.exp("DK Shivakumar");
		politicianRepository.exp("BS Chennabasappa");
		politicianRepository.exp("Kumaraswamy");
	}

}
