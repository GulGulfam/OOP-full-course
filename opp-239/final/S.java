class Employee{
	public void show(){
		System.out.println("I am a general Employee");
	}
}
class FullTime extends Employee{
	public void show(){
		System.out.println("I am a Full Time Employee");
	}
}
class Contractual extends Employee{
	public void show(){
		System.out.println("I am a Contractual Employee");
	}
	public void salary(){
		System.out.println("Abu ko na btana");
	}
}
class S{
	public static void main(String[] args) {
		Employee ref = new Contractual();
		ref.show();
		//ref.salary();

		if(ref instanceof FullTime){
			System.out.println("She said Yes");
		}
		else
			System.out.println("She said No");

		ref = new FullTime();
		ref.show();

		ref = new Employee();
		ref.show();

		// Contractual ref1 = new Employee();

		Employee[] array = new Employee[5];
		array[0] = new Contractual();
		array[1] = new FullTime();
		array[2] = new Employee();

		array[0].show();
		array[2].show();

	}
}