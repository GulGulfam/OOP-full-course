import java.util.Scanner;
public class RunCar{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Entering  details for Car 1: ");
		System.out.print("Enter the make for Car 1: ");
		String carMake1 = input.nextLine();

		System.out.print("Enter the year model for Car 1: ");
		int yearModelCar1 = input.nextInt();

		System.out.print("Enter the speed for Car 1: ");
		int speedCar1 = input.nextInt();

		Car car1 = new Car();
		car1.setYearModel(yearModelCar1);
		car1.setMake(carMake1);
		car1.setSpeed(speedCar1);


		input.nextLine();
		System.out.println("\n\nEntering  details for Car 2: ");
		System.out.print("Enter the make for Car 2: ");
		String carMake2 = input.nextLine();

		System.out.print("Enter the year model for Car 2: ");
		int yearModelCar2 = input.nextInt();

		System.out.print("Enter the speed for Car 2: ");
		int speedCar2 = input.nextInt();

		Car car2 = new Car();
		car2.setYearModel(yearModelCar2);
		car2.setMake(carMake2);
		car2.setSpeed(speedCar2);


		//To check which car has more speed
		if (car1.getSpeed() > car2.getSpeed()) {

			System.out.println("\nCar 1 has more speed.");
			
		} else {

			System.out.println("\nCar 2 has more speed.");

		}//if

		//To check which car is older
		if (car1.getYearModel() < car2.getYearModel()) {
			System.out.println("\nCar 1 is older.");
			
		} else {

			System.out.println("\nCar 2 is older.");

		}//if

		System.out.println("\n\nDisplaying the state of the object of Car 1");
		car1.display();


		System.out.println("\n\n Displaying the state of the object of Car 2");
		car2.display();

		//Applying accelerate on Car 1
		System.out.println("\nApplying accelerate on car 1: ");
		car1.accelerate();
		System.out.println("Speed of the car 1: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed of the car 1: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed of the car 1: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed of the car 1: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed of the car 1: " + car1.getSpeed());								


		//Applying brake on Car 1		
		System.out.println("\nApplying brake on car 1: ");
		car1.brake();
		System.out.println("Speed of the car 1: " + car1.getSpeed());
		car1.brake();
		System.out.println("Speed of the car 1: " + car1.getSpeed());
		car1.brake();
		System.out.println("Speed of the car 1: " + car1.getSpeed());
		car1.brake();
		System.out.println("Speed of the car 1: " + car1.getSpeed());
		car1.brake();
		System.out.println("Speed of the car 1: " + car1.getSpeed());




		//Applying accelerate on Car 2
		System.out.println("\nApplying accelerate on car 2: ");
		car2.accelerate();
		System.out.println("Speed of the car 2: " + car2.getSpeed());
		car2.accelerate();
		System.out.println("Speed of the car 2: " + car2.getSpeed());
		car2.accelerate();
		System.out.println("Speed of the car 2: " + car2.getSpeed());
		car2.accelerate();
		System.out.println("Speed of the car 2: " + car2.getSpeed());
		car2.accelerate();
		System.out.println("Speed of the car 2: " + car2.getSpeed());								


		//Applying brake on Car 2		
		System.out.println("\nApplying brake on car 2: ");
		car2.brake();
		System.out.println("Speed of the car 2: " + car2.getSpeed());
		car2.brake();
		System.out.println("Speed of the car 2: " + car2.getSpeed());
		car2.brake();
		System.out.println("Speed of the car 2: " + car2.getSpeed());
		car2.brake();
		System.out.println("Speed of the car 2: " + car2.getSpeed());
		car2.brake();
		System.out.println("Speed of the car 2: " + car2.getSpeed());

		
	}//main
}//class