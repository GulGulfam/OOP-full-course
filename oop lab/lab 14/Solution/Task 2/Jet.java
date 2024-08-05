class Jet extends PoweredVehicle{

	private int engineCount;

	public Jet(){
		super("Avgas", "Boeing", "777");
		this.setEngineCount(4);
	}//Default constructor

	public Jet(int engineCount){
		super("Avgas", "Boeing", "747-8");
		this.setEngineCount(engineCount);
	}//1-argument overloaded constructor

	public Jet(int engineCount, String fuelType, String brand, String model){
		super(fuelType, brand, model);
		this.setEngineCount(engineCount);
	}//3-argument overloaded constructor

	public void setEngineCount(int engineCount){
		this.engineCount = engineCount;
	}//setEngineCount

	public int getEngineCount(){
		return this.engineCount;
	}//getEngineCount

	public void display(){
		super.display();
		System.out.println("Engine count: " + this.getEngineCount());
	}//display

}//class