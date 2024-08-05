public class RetailItem{

	private String description;
	private int unitsOnHand;
	private double price;

	public RetailItem(){
		this.setDescription("Polo Shirt");
		this.setUnitsOnHand(25);
		this.setPrice(12.49);
	}//Default constructor()

	public RetailItem(String d, int u, double c){
		this.setDescription(d);
		this.setUnitsOnHand(u);
		this.setPrice(c);
	}//Overloaded constructor

	public void setDescription(String desc){
		description = desc;
	}//setDescription()

	public void setUnitsOnHand(int units){
		unitsOnHand = units;
	}//setUnitsOnHand()	

	public void setPrice(double p){
		price = p;
	}//setPrice()

	public String getDescription(){
		return description;
	}//getDescription()

	public int getUnitsOnHand(){
		return unitsOnHand;
	}//getUnitsOnHand()

	public double getPrice(){
		return price;
	}//getPrice()	

	public void display(){
		System.out.println("Description: " + getDescription());
		System.out.println("Units on hand: " + getUnitsOnHand());
		System.out.println("Price: " + getPrice());
	}//display()

	public void copy(RetailItem r){
		r.setDescription(this.getDescription());
		r.setUnitsOnHand(this.getUnitsOnHand());
		r.setPrice(this.getPrice());
	}//copy()

	public String toString(){
		return this.getDescription() + ", " + this.getUnitsOnHand() + ", " + this.getPrice();
	}//toString()

	public boolean compare(RetailItem r){
		return this.getDescription().equals(r.getDescription()) &&
				this.getUnitsOnHand() == r.getUnitsOnHand() &&
				((this.getPrice() - r.getPrice()) < 0.000001);
				
	}//compare()
}//class