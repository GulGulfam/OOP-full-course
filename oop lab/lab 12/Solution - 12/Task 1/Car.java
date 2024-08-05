class Car{
	private Engine ENGINE;
	private FuelTank TANK;
	private String make;
	private int model;
	private double price;

	public Car(){
		this.ENGINE = new Engine();
		this.TANK = new FuelTank();
		this.setMake("Honda");
		this.setModel(2019);
		this.setPrice(1800000);
	}//Default constructor

	public Car(FuelTank tank, Engine engine, String make, int model, double price){
		this.TANK = new FuelTank(tank); 
		this.ENGINE = new Engine(engine);
		this.setMake(make);
		this.setModel(model);
		this.setPrice(price);
	}//Five-arguments overloaded constructor

	public void setMake(String make){
		this.make = make;
	}//setMake

	public void setModel(int model){
		this.model = model;
	}//setModel

	public void setPrice(double price){
		this.price = price;
	}//setPrice

	public String getMake(){
		return this.make;
	}//getMake

	public int getModel(){
		return this.model;
	}//getModel

	public double getPrice(){
		return this.price;
	}//getPrice

	public double getMaxFuelCapacity(){
		return this.TANK.getMaxFuelCapacity();
	}//getMaxFuelCapacity

	public int getTopSpeed(){
		return this.ENGINE.getTopSpeed();
	}//getTopSpeed

	public double reFuel(){
		double fuelAdded = 0.0;
		if (!this.TANK.isFull()){
			fuelAdded = this.TANK.getMaxFuelCapacity() - this.TANK.getLitersFuel();
			this.TANK.addFuel(fuelAdded);
		}//if
		return fuelAdded;
	}//reFuel

	public boolean startCar(){
		boolean isStarted = true;
		if (!this.ENGINE.isEngineRunning()){
			this.ENGINE.startEngine();
			this.TANK.removeFuel(10.0);
		}
		else{
			isStarted = false;
		}//if

		return isStarted;
	}//startCar

	public boolean stopCar(){
		boolean isStopped = true;
		if (this.ENGINE.isEngineRunning()){
			this.ENGINE.stopEngine();
		}
		else{
			isStopped = false;
		}//if

		return isStopped;
	}//stopCar

	public void currentCarState(){
		System.out.println("Make: " + this.getMake());
		System.out.println("Model: " + this.getModel());
		System.out.println("Price: " + this.getPrice());
		this.ENGINE.currentEngineState();
		this.TANK.currentFuelLevel();
	}//currentCarState
}//class