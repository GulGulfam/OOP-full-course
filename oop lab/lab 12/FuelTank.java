class FuelTank {
	private double litresFuel;
	private double maxFuelCapacity;
	
	public FuelTank(){
		this.setLitresFuel(1.0);
		this.setMaxFuelCapacity(13.0);
	}
	public FuelTank(double litresFuel, double maxFuelCapacity){
		this.setLitresFuel(litresFuel);
		this.setMaxFuelCapacity(maxFuelCapacity);
	}
	public FuelTank(FuelTank fuelTank){
		this.setLitresFuel(fuelTank.getLitresFuel());
		this.setMaxFuelCapacity(fuelTank.getMaxFuelCapacity());
	}
	public void setLitresFuel(double litresFuel){
		this.litresFuel = litresFuel;
	}
	public void setMaxFuelCapacity(double maxFuelCapacity){
		this.maxFuelCapacity = maxFuelCapacity;
	}
	public double getLitresFuel(){
		return litresFuel;
	}
	public double getMaxFuelCapacity(){
		return maxFuelCapacity;
	}

	public void addFuel(double litres){
		if (this.isFull()) {
			System.out.println("Tank is already full ");
			
		}
		else if(getLitresFuel()+litres>this.getMaxFuelCapacity()){
			System.out.println("Exceed");
		}
	
	else{
		this.setLitresFuel(this.getLitresFuel()+litres);
		System.out.println("Litres: " +litres);
	}
}
	public boolean isFull(){
		return this.getLitresFuel()== this.getMaxFuelCapacity();
	}
	public boolean isEmpty(){
		return this.getLitresFuel()==0.0;
	}
	public void removelFuel(double litres){
		if (this.isEmpty()) {
			System.out.println("IS ALREADY EMPTY");
			
		}
		else if(this.getLitresFuel()-litres<0.0){
			System.out.println("Imaginary");
		}
	
	else{
		this.setLitresFuel(getLitresFuel()-litres);
		System.out.println("Litres: " +litres);
	}
}
}