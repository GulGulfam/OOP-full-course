class RunMicrowaveOven {
	public static void main(String[] args) {
		
		MicrowaveOven data1 = new MicrowaveOven();
		MicrowaveOven data2 = new MicrowaveOven("NOVA",25,60,true,27);
		MicrowaveOven data3 = new MicrowaveOven("Prime" ,26,90,false,91,true);


		

		// Change state for data 1
		data1.setManufacturer("Pel");
		data1.setDateOfLaunch(27);
		data1.setDeFrostTemp(6);
		data1.setAutoCookManu(false);
		data1.setWarranty(28);
		data1.setIsTouchScreen(true);

		// Change state for data2
		data2.setManufacturer("Heir");
		data2.setDateOfLaunch(26);
		data2.setDeFrostTemp(61);
		data2.setAutoCookManu(false);
		data2.setWarranty(2);
		data2.setIsTouchScreen(true);

		// Display
		System.out.println("Display #1 ");
		data1.display();
		System.out.println("Display #2 ");
		data2.display();
		System.out.println("Display #3 ");
		data3.display();

		System.out.println();
		System.out.println();

		// COPY 
		System.out.println("Copy .. ");
		data1.copy(data3);
		System.out.println("");
		System.out.println(data3);
		System.out.println();
		// data2.copy(data1);
		// System.out.println(data1);	
		System.out.println();

		// Compare
		System.out.println("Compare.. ");
		if (data1.compare(data3)) 
			System.out.println("Oven 1 and Oven 3 has same features ");
		else
			System.out.println("Oven 1 and Oven 3 has not same features ");
		System.out.println();

		// isNotEqual
		System.out.println("isNotEqual.. ");
		if (data2.isNotEqual(data3)) 
			System.out.println("Has not equal ");
		else
			System.out.println("Oven equal ");
		System.out.println();


		// CREATE 
		System.out.println();
		System.out.println("Create method");
		MicrowaveOven data4 = data1.create(data3);
		//data4.setWarranty(1);
		System.out.println(data4);
		
		// System.out.println(data4);



		
	}
	
}