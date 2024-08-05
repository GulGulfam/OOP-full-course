class Car extends PoweredVehicle{

	private int engineType;

	public Car(){
		super("Gasoline", "BMW", "i8");
		this.setEngineType(1800);
	}//Default constructor

	public Car(int engineType){
		super("Gasoline", "BMW", "X4");
		this.setEngineType(engineType);
	}//1-argument overloaded constructor

	public Car(int engineType, String fuelType, String brand, String model){
		super(fuelType, brand, model);
		this.setEngineType(engineType);
	}//3-argument overloaded constructor

	public void setEngineType(int engineType){
		this.engineType = engineType;
	}//setEngineType

	public int getEngineType(){
		return this.engineType;
	}//getEngineType

	public void display(){
		super.display();
		System.out.println("Engine type: " + this.getEngineType());
	}//display

}//class