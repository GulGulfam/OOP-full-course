public class RunBookDescription{
	public static void main (String[] args){
		BookDescription book1 = new BookDescription();
		BookDescription book2 = new BookDescription("Starting Out with Java", "Tonny Gaddis", "Pearson", 100000);
		BookDescription book3 = new BookDescription("Big Java: Early Objects", "Cay S. Horstmann", "Wiley", 60000);
		
		//Changing the state of two objects	
		book2.setTitle("Head First C#");
		book2.setAuthor("Andrew Stellman");
		book2.setPublisher("O'Reilly Media");
		book2.setCopiesSold(80000);

		book3.setTitle("C++ Programming");
		book3.setAuthor("DS. Malik");
		book3.setPublisher("Cengage Learning");
		book3.setCopiesSold(900000);

		//Displaying the state of all objects
		System.out.println("Displaying the details of Book1:");
		book1.display();
		System.out.println("\nDisplaying the details of Book2:");
		book2.display();
		System.out.println("\nDisplaying the details of Book3:");
		book3.display();

		//copying book2 to book3
		book2.copy(book3);

		System.out.println("Calling toString() method of Book3:");
		System.out.println(book3.toString());

		//Checking if book2 and book3 are equal

		if(book2.compare(book3)){
			System.out.println("Book2 and Book3 are equal.");
		}
		else{
			System.out.println("Book2 and Book3 are not equal.");
		}//if

	}//main
}//class