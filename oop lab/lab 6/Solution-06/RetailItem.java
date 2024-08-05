public class RetailItem{

	private String description;
	private int unitsOnHand;
	private double price;

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

}//class