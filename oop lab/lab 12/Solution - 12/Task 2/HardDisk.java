
public class HardDisk {
	private double price;
	private int capacity;
	private String type; // SSD or HDD

	public HardDisk() {
		this.setPrice(12000);
		this.setCapacity(250);
		this.setType("SSD");
	}//Default Constructor


	public HardDisk(double price,  String type, int capacity) {
		this.setPrice(price);
		this.setCapacity(capacity);
		this.setType(type);
	}//3-args Overloaded


	public HardDisk(HardDisk hd) {
		this.setCapacity(hd.getCapacity());
		this.setPrice(hd.getPrice());
		this.setType(hd.getType());
	}//Copy Constructor
	

	public void setPrice(double price) {
		this.price = price;
	}//setPrice()


	public double getPrice() {
		return this.price;
	}//getPrice()


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}//setCapacity()

	public int getCapacity() {
		return this.capacity;
	}//getCapacity()


	public void setType(String type) {
		this.type = type;
	}//setType()

	public String getType() {
		return this.type;
	}//getType()


	public void state() {
		System.out.println("HardDisk Price is: " + this.getPrice());
		System.out.println("HardDisk Capacity is " + this.getCapacity() + "GB.");
		System.out.println("HardDisk Type is: " + this.getType());
	}//state()

}
