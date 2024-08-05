public class RunRetailItem{
	public static void main(String[] args){
		RetailItem obj1 = new RetailItem();
		obj1.setDescription("Jacket");
		obj1.setUnitsOnHand(12);
		obj1.setPrice(59.95);

		RetailItem obj2 = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem obj3 = new RetailItem("Shirt", 20, 24.95);
		
		obj2.setDescription("T-shirt");
		obj2.setUnitsOnHand(50);
		obj2.setPrice(19.99);

		obj3.setDescription("Leather Belt");
		obj3.setUnitsOnHand(60);
		obj3.setPrice(19.98);

		System.out.println("Details for the item #1.");
		obj1.display();
		System.out.println("\nDetails for the item #2.");
		obj2.display();
		System.out.println("\nDetails for the item #3.");
		obj3.display();

		//copying Item2 to Item3
		obj2.copy(obj3);

		System.out.println("Calling toString() method of item# 3:");
		System.out.println(obj3.toString());

		//Checking if Item2 and Item3 are equal

		if(obj2.compare(obj3)){
			System.out.println("Item# 2 and Item# 3 are equal.");
		}
		else{
			System.out.println("Item# 2 and Item# 3 are not equal.");
		}//if

	}//main
}//class