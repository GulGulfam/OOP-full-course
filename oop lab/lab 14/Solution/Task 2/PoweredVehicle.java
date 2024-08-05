class PoweredVehicle extends Vehicle{

	private String fuelType;

	public PoweredVehicle(){
		super("BMW", "i8");
		this.setFuelType("Gasoline");
	}//Default constructor

	public PoweredVehicle(String fuelType){
		super("BMW", "X4");
		this.setFuelType(fuelType);
	}//1-argument overloaded constructor

	public PoweredVehicle(String fuelType, String brand, String model){
		super(brand, model);
		this.setFuelType(fuelType);
	}//3-argument overloaded constructor

	public void setFuelType(String fuelType){
		this.fuelType = fuelType;
	}//setFuelType

	public String getFuelType(){
		return this.fuelType;
	}//getFuelType

	public void display(){
		super.display();
		System.out.println("Fuel type: " + this.getFuelType());
	}//display

}//class