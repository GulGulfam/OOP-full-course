class UsingVehicles{
	public static void main(String[] args) {
		Bicycle bicycle1 = new Bicycle();
		Bicycle bicycle2 = new Bicycle(5);
		Bicycle bicycle3 = new Bicycle(5, "Scott", "Plasma");

		SkateBoard skateBoard1 = new SkateBoard();
		SkateBoard skateBoard2 = new SkateBoard(30.0, 4);
		SkateBoard skateBoard3 = new SkateBoard(31.5, 4, "Enjoi", "Enzo");

		PoweredVehicle poweredVehicle1 = new PoweredVehicle();
		PoweredVehicle poweredVehicle2 = new PoweredVehicle("Gasoline");
		PoweredVehicle poweredVehicle3 = new PoweredVehicle("Gasoline", "Audi", "A8");

		Car car1 = new Car();
		Car car2 = new Car(1700);
		Car car3 = new Car(1800, "Gasoline", "Mercedes", "AMG-GT");

		Jet jet1 = new Jet();
		Jet jet2 = new Jet(4);
		Jet jet3 = new Jet(4, "Avgas", "Boeing", "737 Max");

		final int SIZE = 15;
		Vehicle[] vehicles = new Vehicle[SIZE];
		vehicles[0] = bicycle1;
		vehicles[1] = bicycle2;
		vehicles[2] = bicycle3;
		vehicles[3] = skateBoard1;
		vehicles[4] = skateBoard2;
		vehicles[5] = skateBoard3;
		vehicles[6] = poweredVehicle1;
		vehicles[7] = poweredVehicle2;
		vehicles[8] = poweredVehicle3;
		vehicles[9] = car1;
		vehicles[10] = car2;
		vehicles[11] = car3;
		vehicles[12] = jet1;
		vehicles[13] = jet2;
		vehicles[14] = jet3;

		Vehicle.display(vehicles);

	}//main
}//class