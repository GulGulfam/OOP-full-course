class Car {
	private Engine ENGINE;
	private FuelTank FUELTANK;
	private String make;
	private int model;
	private double price;

	public Car(){
		this.ENGINE = new Engine();
		this.FUELTANK = new FuelTank();
		this.setMake("Honda");
		this.setModel(2021);
		this.setPrice(1235.02);
	}
	public Car(Engine engine, FuelTank fuelTank, String make, int model, double price){
		this.ENGINE = new Engine(engine);
		this.FUELTANK = new FuelTank(fuelTank);
		this.setMake(make);
		this.setModel(model);
		this.setPrice(price);
	}
	public void setMake(String make){
		this.model = model;
	}
	public void setModel(int model){
		this.model = model;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public String getMake(){
		return make;
	}
	public int getModel(){
		return model;
	}
	public double getPrice(){
		return price;
	}
	public double getMaxFuelEffeciency(){
		return this.FUELTANK.getMaxFuelCapacity();
	}
	public int getTopSpeed(){
		return this.ENGINE.getTopSpeed();
	}
	public double reFuel(){
		double fuelAdded = 0.0;

		if (!this.FUELTANK.isFull()) {
			fuelAdded = this.FUELTANK.getMaxFuelCapacity() - this.FUELTANK.getLitresFuel();
			this.FUELTANK.addFuel(fuelAdded);
			
		}
		return fuelAdded;
	}
	
	public boolean startCar(){
		boolean isStarted = true;
		if (!this.ENGINE.getEngineRunning()) {
			this.ENGINE.startEngine();
			this.FUELTANK.removelFuel(10.0);
			
		}
		else{
			isStarted = false;
		}
		return isStarted;

	}
}