class UsingCar{
	public static void main(String[] args) {
		FuelTank fuelTank = new FuelTank(25.0, 33.5);
		Engine engine = new Engine(1300, "Petrol", false, 250);
		Car car = new Car(fuelTank, engine, "Honda", 2019, 2800000.0);

		System.out.println("Maximum fuel capacity: " + car.getMaxFuelCapacity());
		System.out.println("Top speed: " + car.getTopSpeed());
		System.out.println("Refueling...");
		double fuelAdded = car.reFuel();
		if (fuelAdded - 0.0 < 0.00001){
			System.out.println("Fuel tank is aleady full.");
		}

		System.out.println("\nRefueling again...");
		fuelAdded = car.reFuel();
		if (fuelAdded - 0.0 < 0.00001){
			System.out.println("Fuel tank is aleady full.");
		}

		System.out.println("\nStarting car...");
		boolean isStarted = car.startCar();
		if (isStarted){
			System.out.println("Car engine started.");
		}
		else{
			System.out.println("Car is already in start state.");
		}//if

		System.out.println("\nTrying to star the car again...");
		isStarted = car.startCar();
		if (isStarted){
			System.out.println("Car engine started.");
		}
		else{
			System.out.println("Car is already in start state.");
		}//if

		System.out.println("\nStopping car...");
		boolean isStopped = car.stopCar();
		if (isStopped){
			System.out.println("Car engine stopped.");
		}
		else{
			System.out.println("Car is already in stop state.");
		}//if


		System.out.println("\nTrying tp stop the car again...");
		isStopped = car.stopCar();
		if (isStopped){
			System.out.println("Car engine stopped.");
		}
		else{
			System.out.println("Car is already in stop state.");
		}//if

		System.out.println("\nPrinting the state of the car...");
		car.currentCarState();
	}//main
}//class