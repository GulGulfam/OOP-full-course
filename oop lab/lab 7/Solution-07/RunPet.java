public class RunPet{
	public static void main(String[] args){

		//Creating objects
		Pet dog = new Pet();
		Pet cat = new Pet("Tom", "Cat", 2);
		Pet bird = new Pet("Mitho", "Bird", 1);

		// Changing the state of two objects
		cat.setName("Mano");
		cat.setAnimal("Billi");
		cat.setAge(1);

		bird.setName("Miyan mitho");
		bird.setAnimal("Australian parrot");
		bird.setAge(2);

		//Displaying the state of all objects
		System.out.println("Details for the dog.");
		dog.display();

		System.out.println("\nDetails for the cat.");
		cat.display();

		System.out.println("\nDetails for the bird.");
		bird.display();

		//copying cat to dog
		cat.copy(dog);

		System.out.println("Calling toString() method of Cat:");
		System.out.println(dog.toString());

		//Checking if cat and dog are equal

		if(cat.compare(dog)){
			System.out.println("Cat and Dog are equal.");
		}
		else{
			System.out.println("Cat and Dog are not equal.");
		}//if

	}//main
}//class