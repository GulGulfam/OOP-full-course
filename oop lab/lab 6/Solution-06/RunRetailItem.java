public class RunRetailItem{
	public static void main(String[] args){
		RetailItem obj1 = new RetailItem();
		obj1.setDescription("Jacket");
		obj1.setUnitsOnHand(12);
		obj1.setPrice(59.95);

		RetailItem obj2 = new RetailItem();
		obj2.setDescription("Designer Jeans");
		obj2.setUnitsOnHand(40);
		obj2.setPrice(34.95);

		//To check which retail Item is costly
		if (obj1.getPrice() > obj2.getPrice()) {
			System.out.println("\nRetailItem No#1 is costly.");
			
		}else {
			System.out.println("\nRetailItem No#2 is costly.");

		}//if


		//To check which retail Item has more units in inventory
		if (obj1.getUnitsOnHand() > obj2.getUnitsOnHand()) {
			System.out.println("\nRetailItem No#1 has more units in inventory.");
			
		}else {
			System.out.println("\nRetailItem No#2 has more units in inventory.");

		}//if

		
		System.out.println("\nDetails for the item #1.");
		System.out.println("\tDescription: " + obj1.getDescription());
		System.out.println("\tUnits on hand: " + obj1.getUnitsOnHand());
		System.out.println("\tPrice: " + obj1.getPrice());

		System.out.println("\nDetails for the item #2.");
		System.out.println("\tDescription: " + obj2.getDescription());
		System.out.println("\tUnits on hand: " + obj2.getUnitsOnHand());
		System.out.println("\tPrice: " + obj2.getPrice());

		
	}//main
}//class