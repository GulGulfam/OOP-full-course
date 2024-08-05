class RunTemperature {
	public static void main(String[] args) {

		
		
		Temperature te1 = new Temperature();
		Temperature te2 = new Temperature(15.0);
		Temperature te3 = new Temperature(150.0);

		
		te1.setFarenheit(173.1);

		
		System.out.println(" for 1 ");
		te1.display();
		System.out.println(" for 2 ");
		te2.display();
		System.out.println(" for 3 ");
		te3.display();
		

		System.out.println("toString");
		
		te3.copy(te1);
		
		te3.setFarenheit(155.0);
		System.out.println(te1);
		
		System.out.println(te3);

		

		if (te2.compare(te3)) 
		System.out.println(" temperature2 and temperature3 is equal ");
		
		else
				System.out.println("temperature2 and temperature3 is not equal");
		


}


	


	
}