class FuelTank{
	private double litersFuel;
	private double maxFuelCapacity;

	public FuelTank(){
		this.setLitersFuel(30.0);
		this.setMaxFuelCapacity(33.5);
	}//Default constructor

	public FuelTank(double litersFuel, double maxFuelCapacity){
		this.setLitersFuel(litersFuel);
		this.setMaxFuelCapacity(maxFuelCapacity);
	}//Two arguments overloaded constructors

	public FuelTank(FuelTank fuelTank){
		this.setLitersFuel(fuelTank.getLitersFuel());
		this.setMaxFuelCapacity(fuelTank.getMaxFuelCapacity());
	}//Copy constructor

	public void setLitersFuel(double litersFuel){
		this.litersFuel = litersFuel;
	}//setLitersFuel

	public void setMaxFuelCapacity (double maxFuelCapacity){
		this.maxFuelCapacity = maxFuelCapacity;
	}//setMaxFuelCapacity

	public double getLitersFuel(){
		return this.litersFuel;
	}//getLitersFuel

	public double getMaxFuelCapacity(){
		return this.maxFuelCapacity;
	}//getMaxFuelCapacity

	public void addFuel(double liters){
		if (this.isFull()){
			System.out.println("Cannot add fuel! The fuel tank is already full.");
		}
		else if ((this.getLitersFuel() + liters) > this.getMaxFuelCapacity()){
			System.out.println("Cannt add " + liters + " liters fuel, as it will exceeds the maximum capacity of the fuel tank.");
		}
		else{
			this.setLitersFuel(this.getLitersFuel() + liters);
			System.out.println("The " + liters + " liters fuel added to the fuel tank.");
		}//if
	}//addFuel

	public void removeFuel(double liters){
		if (this.isEmpty()){
			System.out.println("Cannot remove fuel! The fuel tank is already empty.");
		}
		else if ((this.getLitersFuel() - liters) < 0.0){
			System.out.println("Cannot remove " + liters + " liters fuel, as it will drop the fuel level below zero.");
		}
		else{
			this.setLitersFuel(this.getLitersFuel() - liters);
			System.out.println("The " + liters + " liters fuel removed from the fuel tank.");
		}//if
	}//removeFuel

	public boolean isEmpty(){
		return this.getLitersFuel() == 0.0;
	}//isEmpty

	public boolean isFull(){
		return this.getLitersFuel() == this.getMaxFuelCapacity();
	}//isFull

	public void currentFuelLevel(){
		System.out.println("Current fuel level: " + this.getLitersFuel());
		System.out.println("Tank capacity: " + this.getMaxFuelCapacity());
	}//currentFuelLevel
	
}//class