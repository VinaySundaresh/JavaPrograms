class WireLessControllerKiller{
	public static void main (String[] values)
	{
		
		/*int noOfBatteries;
	int portNumber;
	boolean wire;
	String deviceName;
	int distance;
	*/
		System.out.println("running main in WireLessController");
        WireLessController w1=new WireLessController();
     	System.out.println(w1.distance);
		System.out.println(w1.deviceName);
		System.out.println(w1.portNumber);
		System.out.println(w1.wire);
		System.out.println(w1.noOfBatteries);

		w1.distance=2;
		w1.deviceName="Remote";
		w1.portNumber=5001;
		w1.wire=false;
		w1.noOfBatteries=2;
		
		
		System.out.println(w1.distance);
	    System.out.println(w1.deviceName);
		System.out.println(w1.portNumber);
		System.out.println(w1.wire);
		System.out.println(w1.noOfBatteries);
		
		System.out.println("------------");
		System.out.println("Second object values...");
		
		WireLessController w2=new WireLessController();
     	System.out.println(w2.distance);
		System.out.println(w2.deviceName);
		System.out.println(w2.portNumber);
		System.out.println(w2.wire);
		System.out.println(w2.noOfBatteries);

		w2.distance=4;
		w2.deviceName="Remote car";
		w2.portNumber=1081;
		w2.wire=false;
		w2.noOfBatteries=1;
		
		
		System.out.println(w2.distance);
	    System.out.println(w2.deviceName);
		System.out.println(w2.portNumber);
		System.out.println(w2.wire);
		System.out.println(w2.noOfBatteries);
		


	}

}
