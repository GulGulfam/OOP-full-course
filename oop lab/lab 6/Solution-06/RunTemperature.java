import java.util.Scanner;
public class RunTemperature{
	public static void main(String[] args){

		Scanner read = new Scanner(System.in);


		System.out.println("Entering details for object#1: ");
		System.out.print("Please enter the temperature in fahrenheit for object#1: ");
		int temp1 = read.nextInt();

		Temperature temperature1 = new Temperature();
		temperature1.setFahrenheit(temp1);

		System.out.println("\n\nEntering details for object#2: ");
		System.out.print("Please enter the temperature in fahrenheit for object#2: ");
		int temp2 = read.nextInt();

		Temperature temperature2 = new Temperature();
		temperature2.setFahrenheit(temp2);

		if (temperature1.getCelsius() > temperature2.getCelsius()) {
			System.out.println("\nObject#1 has more temperature.");
			
		}else {
			System.out.println("\nObject#2 has more temperature.");

		}//if

		System.out.println("\n\nDisplaying temperature for object#1: ");
		System.out.println("Temperature in Celsius for object#1: " + temperature1.getCelsius());
		System.out.println("Temperature in Kelvin for object#1: " + temperature1.getKelvin());

		System.out.println("\n\nDisplaying temperature for object#2: ");
		System.out.println("Temperature in Celsius for object#2: " + temperature2.getCelsius());
		System.out.println("Temperature in Kelvin for object#2: " + temperature2.getKelvin());


	}//main
}//class