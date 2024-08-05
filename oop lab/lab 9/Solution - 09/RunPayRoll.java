public class RunPayRoll{
	public static void main(String[] args){
		Payroll obj1 = new Payroll();
		Payroll obj2 = new Payroll("John", 5, 10.5, 35.5);
		Payroll obj3 = new Payroll("Paul", 9, 15.5, 40.5);

		obj2.setName("Maya");
		obj2.setIdNumber(15);
		obj2.setHourlyPayRate(12.5);
		obj2.setNumbersOfHoursWorked(30.5);

		obj3.setName("Leo");
		obj3.setIdNumber(16);
		obj3.setHourlyPayRate(16.5);
		obj3.setNumbersOfHoursWorked(32.5);

		System.out.println("Amount of gross pay earned by Employee #1: " + obj1.grossPay());
		System.out.println("Amount of gross pay earned by Employee #2: " + obj2.grossPay());
		System.out.println("Amount of gross pay earned by Employee #3: " + obj3.grossPay());

		//Displaying the state of all objects
		System.out.println("Displaying the details of Employee #1:");
		obj1.display();
		System.out.println("\nDisplaying the details of Employee #2:");
		obj2.display();
		System.out.println("\nDisplaying the details of Employee #3:");
		obj3.display();

		//copying Employee #2 to Employee #3
		obj2.copy(obj3);

		System.out.println("Calling toString() method of Employee #3:");
		System.out.println(obj3.toString());

		//Checking if obj2 and obj3 are equal

		if(obj2.compare(obj3)){
			System.out.println("Employee #2 and Employee #3 are equal.");
		}
		else{
			System.out.println("Employee #2 and Employee #3 are not equal.");
		}//if

		if (obj1.isNotEqual(obj2)){
			System.out.println("Employee #1 and Employee #2 are not equal.");
		}
		else{
			System.out.println("Employee #1 and Employee #2 are equal.");
		}//if

		Payroll anotherObject = obj1.create(obj2);
		System.out.println("\nDisplaying the details of newly created Payroll object:");
		anotherObject.display();

	}//main
}//class