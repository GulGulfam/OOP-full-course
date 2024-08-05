class UsingStudents{
	public static void main(String[] args) {
		Student student1 = new Student(5, "Abu bakar");
		Student student2 = new Student(4, "Umar");
		Student student3 = new Student(2, "Usman");
		Student student4 = new Student(7, "Ali");
		Student student5 = new Student(12, "Abdullah");

		System.out.println("Displaying the state of Student #1:");
		student1.displayState();
		System.out.println("\nDisplaying the state of Student #2:");
		student2.displayState();
		System.out.println("\nDisplaying the state of Student #3:");
		student3.displayState();
		System.out.println("\nDisplaying the state of Student #4:");
		student4.displayState();
		System.out.println("\nDisplaying the state of Student #5:");
		student5.displayState();

		System.out.println("\nComparing the names of Student #1 and Student #2:");
		int answer = student1.compareTo(student2);
		if (answer > 0){
			System.out.println("The name \"" + student1.getName() + "\" of Student #1 is greater than the name \"" + student2.getName() + "\" of Student #2.");
		}
		else if (answer < 0){
			System.out.println("The name \"" + student1.getName() + "\" of Student #1 is lesser than the name \"" + student2.getName() + "\" of Student #2.");
		}
		else{
			System.out.println("The name \"" + student1.getName() + "\" of Student #1 is equal to the name \"" + student2.getName() + "\" of Student #2.");
		}//if

		System.out.println("\nComparing the names of Student #3 and Student #4:");
		answer = student3.compareTo(student4);
		if (answer > 0){
			System.out.println("The name \"" + student3.getName() + "\" of Student #3 is greater than the name \"" + student4.getName() + "\" of Student #4.");
		}
		else if (answer < 0){
			System.out.println("The name \"" + student3.getName() + "\" of Student #3 is lesser than the name \"" + student4.getName() + "\" of Student #4.");
		}
		else{
			System.out.println("The name \"" + student3.getName() + "\" of Student #3 is equal to the name \"" + student4.getName() + "\" of Student #4.");
		}//if

		System.out.println("\nComparing the names of Student #5 and Student #1:");
		answer = student5.compareTo(student1);
		if (answer > 0){
			System.out.println("The name \"" + student5.getName() + "\" of Student #5 is greater than the name \"" + student1.getName() + "\" of Student #1.");
		}
		else if (answer < 0){
			System.out.println("The name \"" + student5.getName() + "\" of Student #5 is lesser than the name \"" + student1.getName() + "\" of Student #1.");
		}
		else{
			System.out.println("The name \"" + student5.getName() + "\" of Student #5 is equal to the name \"" + student1.getName() + "\" of Student #1.");
		}//if

	}//main
}//class