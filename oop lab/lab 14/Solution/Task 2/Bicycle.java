class Bicycle extends Vehicle{
	private int gearCount;

	public Bicycle(){
		super("BMC", "ALR");
		this.setGearCount(4);
	}//Default constructor

	public Bicycle(int gearCount){
		super("BMC", "SLR01");
		this.setGearCount(gearCount);
	}//1-argument overloaded constructor

	public Bicycle(int gearCount, String brand, String model){
		super(brand, model);
		this.setGearCount(gearCount);
	}//3-argument overloaded constructor

	public void setGearCount(int gearCount){
		this.gearCount = gearCount;
	}//setGearCount

	public int getGearCount(){
		return this.gearCount;
	}//getGearCount

	public void display(){
		super.display();
		System.out.println("Gear count: " + this.getGearCount());
	}//display

}//class