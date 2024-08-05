public class Ram {

	private double price;
	private int capacity;	
	

	public Ram() {
		this.setPrice(4000);
		this.setCapacity(4);
	}//Default Constructor

	public Ram(double price, int capacity) {
		this.setPrice(price);
		this.setCapacity(capacity);
	}//2-args Overloaded
	
	
	public Ram(Ram r) {
		this.setCapacity(r.getCapacity());
		this.setPrice(r.getPrice());
	}//Copy Constructor
	
	public void setPrice(double price) {
		this.price = price;
	}//setPrice()


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}//setCapacity()

	public double getPrice() {
		return this.price;
	}//getPrice()

	public int getCapacity() {
		return this.capacity;
	}//getCapacity()
	
	public void state() {
		System.out.println("RAM capacity is "+this.getCapacity() + "GB.");
		System.out.println("RAM Price is: "+this.getPrice());
	}//state()
	
}
