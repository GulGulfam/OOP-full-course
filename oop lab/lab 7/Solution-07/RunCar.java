public class RunCar{
	public static void main(String[] args){
		
		Car car1 = new Car();
		Car car2 = new Car(2015, "Nissan", 350);
		Car car3 = new Car(2012, "mercedes", 250);

		car2.setYearModel(2018);
		car2.setMake("jaguar");
		car2.setSpeed(400);

		car3.setYearModel(2017);
		car3.setMake("porsche");
		car3.setSpeed(300);

		//Displaying the state of all objects
		System.out.println("Displaying the details of Car1:");
		car1.display();
		System.out.println("\nDisplaying the details of Car3:");
		car2.display();
		System.out.println("\nDisplaying the details of Car3:");
		car3.display();

		//Copying car2 to car3
		car2.copy(car3);

		System.out.println("Calling toString() method of Car3:");
		System.out.println(car3.toString());

		//Checking if car2 and car3 are equal

		if(car2.compare(car3)){
			System.out.println("Car2 and Car3 are equal.");
		}
		else{
			System.out.println("Car2 and Car3 are not equal.");
		}//if


		System.out.println("\nAccelerating Car1 five times:");
		car1.accelerate();
		System.out.println("Speed of the car1: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed of the car1: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed of the car1: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed of the car1: " + car1.getSpeed());
		car1.accelerate();
		System.out.println("Speed of the car1: " + car1.getSpeed());								
		
		System.out.println("\nApplying brake on Car1 five times:");
		car1.brake();
		System.out.println("Speed of the car1: " + car1.getSpeed());
		car1.brake();
		System.out.println("Speed of the car1: " + car1.getSpeed());
		car1.brake();
		System.out.println("Speed of the car1: " + car1.getSpeed());
		car1.brake();
		System.out.println("Speed of the car1: " + car1.getSpeed());
		car1.brake();
		System.out.println("Speed of the car1: " + car1.getSpeed());

		System.out.println("\nAccelerating Car2 five times:");
		car2.accelerate();
		System.out.println("Speed of the car2: " + car2.getSpeed());
		car2.accelerate();
		System.out.println("Speed of the car2: " + car2.getSpeed());
		car2.accelerate();
		System.out.println("Speed of the car2: " + car2.getSpeed());
		car2.accelerate();
		System.out.println("Speed of the car2: " + car2.getSpeed());
		car2.accelerate();
		System.out.println("Speed of the car2: " + car2.getSpeed());								
		
		System.out.println("\nApplying brake on Car2 five times:");
		car2.brake();
		System.out.println("Speed of the car2: " + car2.getSpeed());
		car2.brake();
		System.out.println("Speed of the car2: " + car2.getSpeed());
		car2.brake();
		System.out.println("Speed of the car2: " + car2.getSpeed());
		car2.brake();
		System.out.println("Speed of the car2: " + car2.getSpeed());
		car2.brake();
		System.out.println("Speed of the car2: " + car2.getSpeed());
		
	}//main
}//class