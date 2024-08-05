public class RunEmployee{
	public static void main(String[] args){
		Employee emp1 = new Employee();
		Employee emp2 = new Employee("Paul", 7, "Human Resource", "Assistant");
		Employee emp3 = new Employee("John", 8, "IT", "Engineer");
		
		emp2.setName("Julia");
		emp2.setIdNumber(15);
		emp2.setDepartment("Student Affairs");
		emp2.setPosition("Manager");

		emp3.setName("Leo");
		emp3.setIdNumber(20);
		emp3.setDepartment("Student Affairs");
		emp3.setPosition("Assistant");

		System.out.println("Details for the employee #1.");
		emp1.display();
		System.out.println("\nDetails for the employee #2.");
		emp2.display();
		System.out.println("\nDetails for the employee #3.");
		emp3.display();

		//copying Employee #2 to Employee #3
		emp2.copy(emp3);

		System.out.println("Calling toString() method of Employee #3:");
		System.out.println(emp3.toString());

		//Checking if Employee 2 and Employee 3 are equal
		if(emp2.compare(emp3)){
			System.out.println("Employee #2 and Employee #3 are equal.");
		}
		else{
			System.out.println("Employee #2 and Employee #3 are not equal.");
		}//if

	}//main
}//class