class RunPet {
	public static void main(String[] args) {
		Pet dog= new Pet();

		dog.setName("tommy");
		dog.setAnimal("KUTTA");
		dog.setAge(1);
		System.out.println("Name = " +dog.getName() +" Animal =   " +dog.getAnimal() +" Age = " +dog.getAge());
		System.out.println();

		Pet bird  =  new Pet();

		bird.setName("Sparrow");
		bird.setAnimal("Bird");
		bird.setAge(2);
		System.out.println("Name = " +bird.getName() +" Animal =  " +bird.getAnimal() +" Age = " +bird.getAge());
		System.out.println();

		Pet cat = new Pet();

		cat.setName("kaku");
		cat.setAnimal("Cat");
		cat.setAge(5);
		System.out.println("Name = " +cat.getName() +" Animal  =  " +cat.getAnimal() +" Age = " +cat.getAge());
		System.out.println();
	}
	
}