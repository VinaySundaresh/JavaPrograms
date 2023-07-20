class ATMCardKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in ATMCardKiller");
		
		ATMCard atm1=new ATMCard();
		
		ATMCard atm2=new ATMCard("Vinay",1234567895821l,2023);
		
		System.out.println("Card Holder number : "+atm2.cardHolderName);
		System.out.println("Card number : "+atm2.cardNum);
		System.out.println("Valid year : "+atm2.validYear);
		
	}
	
}