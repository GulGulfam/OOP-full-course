import java.util.Scanner;
public class RunTemperature{
	public static void main(String[] args){

		Temperature temp1 = new Temperature();
		Temperature temp2 = new Temperature(99.5);
		Temperature temp3 = new Temperature(100.8);

		temp2.setFahrenheit(110.0);
		temp3.setFahrenheit(120.5);


		//Displaying the state of all objects
		System.out.println("Displaying the details of temp1:");
		temp1.display();
		System.out.println("\nDisplaying the details of temp2:");
		temp2.display();
		System.out.println("\nDisplaying the details of temp3:");
		temp3.display();

		//copying temp2 to temp3
		temp2.copy(temp3);

		System.out.println("Calling toString() method of temp3:");
		System.out.println(temp3.toString());

		//Checking if temp2 and temp3 are equal

		if(temp2.compare(temp3)){
			System.out.println("temp2 and temp3 are equal.");
		}
		else{
			System.out.println("temp2 and temp3 are not equal.");
		}//if

		System.out.println("\nTemperature details of temp1");
		System.out.println("Temperature in Celsius: " + temp1.getCelsius());
		System.out.println("Temperature in Kelvin: " + temp1.getKelvin());

		System.out.println("\nTemperature details of temp2");
		System.out.println("Temperature in Celsius: " + temp2.getCelsius());
		System.out.println("Temperature in Kelvin: " + temp2.getKelvin());

		System.out.println("\nTemperature details of temp3");
		System.out.println("Temperature in Celsius: " + temp3.getCelsius());
		System.out.println("Temperature in Kelvin: " + temp3.getKelvin());

		Temperature anotherObject = temp1.create(temp3);
		System.out.println("\nDisplaying the details of newly created Temperature object:");
		anotherObject.display();
	
	}//main
}//class