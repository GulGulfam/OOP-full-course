public class Computer {

	private double price;
	private String make;
	private HardDisk HARDDISK;
	private Ram RAM;


	public Computer() {
		this.setPrice(200000);
		this.setMake("Dell");
		this.HARDDISK = new HardDisk();
		this.RAM = new Ram();
	}//Default Constructor

	
	public Computer(HardDisk hd, Ram r, double price, String make) {
		this.price = price;
		this.make = make;
		this.HARDDISK = new HardDisk(hd);
		this.RAM = new Ram(r);
	}//4-args Overloaded
	
	public void setPrice(double price) {
		this.price = price;
	}//setPrice()


	public void setMake(String make) {
		this.make = make;
	}//setMake()

	
	public double getPrice() {
		return this.price;
	}//getPrice()

	public String getMake() {
		return this.make;
	}//getMake()
	
	
	public int getRamCapacity() {
		return this.RAM.getCapacity();
	}//getRamCapacity()
	
	public int getHardDiskCapacity() {
		return this.HARDDISK.getCapacity();
	}//getHardDiskCapacity()
	
	public boolean isDiskSSD() {
		if(this.HARDDISK.getType().equals("SSD")){
			return true;
		} else {
			return false;
		}//if
	}//isDiskSSD()
	
	public boolean isRamCostly() {
		if(this.RAM.getPrice() > 3500) {
			return true;
		} else {
			return false;
		}//if
	}//isRamCostly()
	
	
	
	public void state() {
		System.out.println("Price is: "+this.getPrice());
		System.out.println("Make is: "+this.getMake());
		this.HARDDISK.state();
		this.RAM.state();
	}//state()
	
	
	
}//class
