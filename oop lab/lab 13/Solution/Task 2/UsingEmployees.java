class UsingEmployees{
	public static void main(String[] args) {
		HourlyEmployee hourlyEmployee1 = new HourlyEmployee();
		HourlyEmployee hourlyEmployee2 = new HourlyEmployee(12.5, 42);
		HourlyEmployee hourlyEmployee3 = new HourlyEmployee(14.5, 45, "Usman", 102);

		SalariedEmployee salariedEmployee1 = new SalariedEmployee();
		SalariedEmployee salariedEmployee2 = new SalariedEmployee(34500.0);
		SalariedEmployee salariedEmployee3 = new SalariedEmployee(37000.0, "Umar", 104);

		Manager manager1 = new Manager();
		Manager manager2 = new Manager(5500.0);
		Manager manager3 = new Manager(6500, 42000.0, "Ali", 108);

		System.out.println("Displaying the details of hourlyEmployee #1:");
		hourlyEmployee1.display();
		System.out.println("Weekly pay: " + hourlyEmployee1.weeklyPay());

		System.out.println("\n\nDisplaying the details of hourlyEmployee #2:");
		hourlyEmployee2.display();
		System.out.println("Weekly pay: " + hourlyEmployee2.weeklyPay());

		System.out.println("\n\nDisplaying the details of hourlyEmployee #3:");
		hourlyEmployee3.display();
		System.out.println("Weekly pay: " + hourlyEmployee3.weeklyPay());

		System.out.println("\n\n\nDisplaying the details of salariedEmployee #1:");
		salariedEmployee1.display();
		System.out.println("Weekly pay: " + salariedEmployee1.weeklyPay());

		System.out.println("\n\nDisplaying the details of salariedEmployee #2:");
		salariedEmployee2.display();
		System.out.println("Weekly pay: " + salariedEmployee2.weeklyPay());

		System.out.println("\n\nDisplaying the details of salariedEmployee #3:");
		salariedEmployee3.display();
		System.out.println("Weekly pay: " + salariedEmployee3.weeklyPay());

		System.out.println("\n\n\nDisplaying the details of manager #1:");
		manager1.display();
		System.out.println("Weekly pay: " + manager1.weeklyPay());

		System.out.println("\n\nDisplaying the details of manager #2:");
		manager2.display();
		System.out.println("Weekly pay: " + manager2.weeklyPay());

		System.out.println("\n\nDisplaying the details of manager #3:");
		manager3.display();
		System.out.println("Weekly pay: " + manager3.weeklyPay());
	}//main
}//class