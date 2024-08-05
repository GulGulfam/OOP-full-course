import java.util.Scanner;
class RunTemperature {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		Temperature temperature1 = new Temperature();

		
		temperature1.setTemp(173.1);



		Temperature temperature2 = new Temperature(15.0);
		


		//temperature2.setTemp(15.0);

		Temperature temperature3 = new Temperature(150.0);

		
		System.out.println("Display method for 1 ");
		temperature1.display();
		System.out.println("Display method for 2 ");
		temperature2.display();
		System.out.println("Display method for 3 ");
		temperature3.display();
		System.out.println();

		System.out.println("Now toString method start here");
		
		temperature3.copy(temperature1);//Deep copy
		//temperature3 = temperature1;//shallow copy
		temperature3.setTemp(155.0);
		System.out.println(temperature1);
		
		System.out.println(temperature3);

		// compare method

		if (temperature2.compare(temperature3)) 
		System.out.println(" temperature2 and temperature3 is equal ");
		
		else
				System.out.println("temperature2 and temperature3 is not equal");
		


}


	


	
}