
class Main {
	public static void main(String[] args) {
		
		Student[] s1 = {new Student(4,"Gul", "SE",4,5 ),new Student(6,"Ali","SE",5,9)};
		
			for (Student one: s1 ) {
				System.out.println(one);
				
			}
		
	Course c1 = new Course("MATH-207","Probability",3,3,3);

	Course c2 = new Course("CS-206", "DLD", 3, 3,3);
	Course c3 = new Course("CS-201", "OOP", 4, 3,3);
	Course c4 = new Course("MGT-201", "Management", 3, 3,3);
	Course c5 = new Course("MATH-204", "Linear ", 3, 3,3);	
		

	Student s = new Student(1540047, "Usman", "BS SE", 5,6);
	s.registerCourse(c1);
	s.registerCourse(c2);
	s.registerCourse(c3);
	s.registerCourse(c4);
	s.registerCourse(c5);

	c1.displayState();
	c2.displayState();
	c3.displayState();
	c4.displayState();
	c5.displayState();

	// // s->printGradeBook();

	Assessment q1 = new Assessment(21,"Quiz",25,11,2022,100,80,74);
	q1.displayState();

			
			
				
			
	}
	
}