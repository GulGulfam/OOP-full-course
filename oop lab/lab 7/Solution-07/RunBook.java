public class RunBook{
	public static void main(String[] args){

		//Creating objects
		Book pakStudies = new Book(4, 500);	
		Book urdu = new Book(500, 15.5);	
		Book english = new Book();
		Book math = new Book(2);	
		Book punjabi = new Book(7, 900, 20.3);	
	
		//Displaying the state of all objects
		System.out.println("Displaying the details of English:");
		english.display();
		System.out.println("\nDisplaying the details of Math:");
		math.display();
		System.out.println("\nDisplaying the details of Pak studies:");
		pakStudies.display();
		System.out.println("\nDisplaying the details of Urdu:");
		urdu.display();
		System.out.println("\nDisplaying the details of Punjabi:");
		punjabi.display();

		//Changing the state of two objects
		english.setBookId(10);
		english.setPages(900);
		english.setPrice(12.5);

		math.setBookId(12);
		math.setPages(800);
		math.setPrice(15.5);

		//Checking if english is larger than math
		if (english.isLarger(math)){
			System.out.println("English is larger than Math.");
		}//if

		//Checking if english is expensive than math
		if (english.isExpensive(math)){
			System.out.println("English is expensive than Math.");
		}//if

		//copying math to english
		math.copy(english);

		System.out.println("Calling toString() method of English:");
		System.out.println(english.toString());


	}//main
}//class