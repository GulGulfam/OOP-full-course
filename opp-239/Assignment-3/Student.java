class Student {
	private int id;
	private String name;
		private String program;
		private Course[] courses;
		private int coursesLength;
		private int numberOfCourses;
		private int gpa;
		// private Grade remarks;

	public Student(){
		this.setID(13);
		this.setName("Gul");
		this.setProgram("SE");
	}
	public Student(int id, String name, String program, int nc, int cl){
		this.id = id;
		this.name = name;
		this.program = program;
		setNumberOfCourses(nc);
		courses = new Course[nc];
		coursesLength = cl;

	}

	public void setID(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setProgram(String program){
		this.program = program;
	}
	public void setNumberOfCourses(int numberOfCourses){
		this.numberOfCourses = numberOfCourses;
	}
	public void setCoursesLength(int coursesLength){
		this.coursesLength = coursesLength;
	}
	public int getID(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getProgram(){
		return program;
	}
	public int getNumberOfCourses(){
		return numberOfCourses;
	}
	public int getCoursesLength(){
		return coursesLength;
	}
	public void displayState(){
		System.out.println("ID : " +getID());
		System.out.println("Name : " +getName());
		System.out.println("Program : " +getProgram());
		System.out.println("Number of courses : " +getNumberOfCourses());
		System.out.println("coursesLength : " +getCoursesLength());
	}
	public void registerCourse(Course c){
		if (getCoursesLength() < getNumberOfCourses()) {
		courses[coursesLength] = c;
		coursesLength++;
	}	
	}
	public void printGradeBook(){
		displayState();
	}
	// public void calGpa(int gpa){
	// if (gpa==4) {
	// 	grade = 'A';
	// 	remarks = "Excellent";
	// }
		
	// }
	
	
}