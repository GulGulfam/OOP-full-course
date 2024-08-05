class Vehicle {

	private String brand;
	private String model;

	public Vehicle(){
		this.setBrand("BMW");
		this.setModel("X4");
	}//Default constructor

	public Vehicle(String brand, String model){
		this.setBrand(brand);
		this.setModel(model);
	}//Overloaded constructor

	public void setBrand(String brand){
		this.brand = brand;
	}//setBrand

	public void setModel(String model){
		this.model = model;
	}//setModel

	public String getBrand(){
		return this.brand;
	}//getBrand

	public String getModel(){
		return this.model;
	}//getModel

	public void display(){
		System.out.println("Brand: " + this.getBrand());
		System.out.println("Model: " + this.getModel());
	}//display

	public static void display(Vehicle[] vehicles){
		for (int i = 0; i < vehicles.length; ++i) {
			vehicles[i].display();
			System.out.println("\n\n");
		}//for
	}//display
}//class