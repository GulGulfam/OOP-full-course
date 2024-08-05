class EmployeeRun {
	

public static void main(String[] args) {
	Employee s = new Employee();
	Employee s2 = new Employee();
	Employee s3 = new Employee();


	System.out.print("Name ID" +"\t\t" +"Number" +"\t\t" +"Department" +"\t" +"position");
	System.out.println();
	
	// For EMPLOYEE 1
	s.setName("M Usman");
	s.setNumber(21414);
	s.setDepartment("HR");
	s.setPosition("Vice President");
	System.out.println();
	System.out.print(s.getName() +"\t\t" +s.getNumber() +"\t\t" +s.getDepartment() +"\t\t" +s.getPosition() );
	System.out.println();


	//FOR EMPLOYEE 2	
	s2.setName("Abdul Hadi");
	s2.setNumber(21147);
	s2.setDepartment("IT");
	s2.setPosition("Programmer");
	System.out.println();
	System.out.print(s2.getName() +"\t" +s2.getNumber() +"\t\t" +s2.getDepartment() +"\t\t" +s2.getPosition() );
	System.out.println();
	//FOR EMPLOYEE 3

	s3.setName("Afshan");
	s3.setNumber(21698);
	s3.setDepartment("Manufacturing");
	s3.setPosition("Engineer");
	System.out.println();
	System.out.print(s3.getName() +"\t\t" +s3.getNumber() +"\t\t" +s3.getDepartment() +"\t" +s3.getPosition() );

	
}
}