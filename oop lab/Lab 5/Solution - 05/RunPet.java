public class RunPet{
	public static void main(String[] args){
		Pet dog = new Pet();
		dog.setName("Sher Dil");
		dog.setAnimal("Dog");
		dog.setAge(2);

		Pet cat = new Pet();
		cat.setName("Tom");
		cat.setAnimal("Cat");
		cat.setAge(1);

		Pet bird = new Pet();
		bird.setName("Mitho");
		bird.setAnimal("Bird");
		bird.setAge(1);

		System.out.println("Details for the dog.");
		System.out.println("\tName: " + dog.getName());
		System.out.println("\tAnimal: " + dog.getAnimal());
		System.out.println("\tAge: " + dog.getAge());

		System.out.println("\nDetails for the cat.");
		System.out.println("\tName: " + cat.getName());
		System.out.println("\tAnimal: " + cat.getAnimal());
		System.out.println("\tAge: " + cat.getAge());

		System.out.println("\nDetails for the bird.");
		System.out.println("\tName: " + bird.getName());
		System.out.println("\tAnimal: " + bird.getAnimal());
		System.out.println("\tAge: " + bird.getAge());

	}//main
}//class