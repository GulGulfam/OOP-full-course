public class Pet{

	private String name;
	private String animal;
	private int age;

	public Pet(){
		setName("Tom");
		setAnimal("Dog");
		setAge(2);
	}//Default constructor()

	public Pet(String n, String an, int a){
		setName(n);
		setAnimal(an);
		setAge(a);
	}//Overloaded constructor()

	public void setName(String n){
		name = n;
	}//setName()

	public void setAnimal(String a){
		animal = a;
	}//setAnimal()

	public void setAge(int a){
		age = a;
	}//setAge()

	public String getName(){
		return name;
	}//getName()

	public String getAnimal(){
		return animal;
	}//getAnimal()

	public int getAge(){
		return age;
	}//getAge()

	public void display(){
		System.out.println("Name = " + getName());
		System.out.println("Animal = " + getAnimal());
		System.out.println("Age = " + getAge());
	}//display()

	public void copy(Pet p){
		p.setName(this.getName());
		p.setAnimal(this.getAnimal());
		p.setAge(this.getAge());
	}//copy()

	public String toString(){
		return this.getName() + ", " + this.getAnimal() + ", " + this.getAge();
	}//toString()

	public boolean compare(Pet p){
		return (this.getName().equals(p.getName()) &&
				this.getAnimal().equals(p.getAnimal()) &&
				this.getAge() == p.getAge());
	}//compare()

	public boolean isNotEqual(Pet p){
		return !this.compare(p);

/*		return (!this.getName().equals(p.getName()) &&
				!this.getAnimal().equals(p.getAnimal()) &&
				this.getAge() != p.getAge());
				*/
	}

}//class