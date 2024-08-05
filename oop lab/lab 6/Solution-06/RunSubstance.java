import java.util.Scanner;
public class RunSubstance{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.print("Please enter the value for temperature: ");
		int temperature = read.nextInt();

		Substance substance = new Substance();
		substance.setTemperature(temperature);

		if (substance.isEthylFreezing()){
			System.out.println("Ethyl will freeze.");
		}//if

		if (substance.isEthylBoiling()){
			System.out.println("Ethyl will boil.");
		}//if

		if (substance.isOxygenFreezing()){
			System.out.println("Oxygen will freeze.");
		}//if

		if (substance.isOxygenBoiling()){
			System.out.println("Oxygen will boil.");
		}//if

		if (substance.isWaterFreezing()){
			System.out.println("Water will freeze.");
		}//if

		if (substance.isWaterBoiling()){
			System.out.println("Water will boil.");
		}//if
	
	}//main
}//class