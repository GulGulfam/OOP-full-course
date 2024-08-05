class Course {
	private String code;
	private String title;
	private int creditHours;
	private int numberOfQuizes;
	private int numberOfAssignments;
	double percentage;

	char grade;

	double gradePoint;
	Grade g;
	private  Assessment q1;
	private  Assessment q2;
	
	private Assessment q3;
	private  Assessment assgn1;
	private  Assessment assgn2;
	private Assessment assgn3;
	Assessment mid;
	Assessment f;



	public Course(String code, String title, int creditHours, int numberOfQuizes, int numberOfAssignments){
		this.code = code;;
		this.title = title;
		this.creditHours = creditHours;
		this.numberOfQuizes = numberOfQuizes;
		this.numberOfAssignments = numberOfAssignments;

	}
	public void setCode(String code){
		this.code = code;

	}
	public void setTitle(String title){
		this.title = title;
		
	}
	public void setCreditHours(int creditHours){
		this.creditHours = creditHours;
		
	}
	public void setNumberOfQuizes(int numberOfQuizes){
		this.numberOfQuizes = numberOfQuizes;
		
	}
	public void setNumberOfAssignments(int numberOfAssignments){
		this.numberOfAssignments = numberOfAssignments;
	}
	public void setPercentage(double percentage){
		this.percentage = percentage;
	}
	
	public void setGrade(char grade){
		this.grade = grade;
	}
	public void setGradePoint(double gradePoint){
		this.gradePoint = gradePoint;
	}
	public String getCode(){
		return code;
	}
	public String getTitle(){
		return title;
	}
	public int getCreditHours(){
		return creditHours;
	}
	public int getNumberOfQuizes(){
		return numberOfQuizes;
	}
	public int getNumberOfAssignments(){
		return numberOfAssignments;
	}
	public double getPercentage(){
		calculatePercentage();
		return percentage;
	}
	public char getGrade(){
		return grade;
	}
	public double getGradePoint(){
		return gradePoint ;
	}

	public void displayState(){
		System.out.println("Code : " +getCode());
		System.out.println("Marks % " +getPercentage());
		System.out.println("Title : " +getTitle());
		System.out.println("Credit Hours : " +getCreditHours());
		System.out.println("Number of quizes: " +getNumberOfQuizes());
		System.out.println("Number of assignments : " +getNumberOfAssignments());
	}

	public void calculatePercentage(){
		double tQM = 0.0;
		double oQM = 0.0;
		double tAM = 0.0;
		double oAM = 0.0;
		double qP = 0.0;
		double aP = 0.0;
		double mP = 0.0;
		double fP = 0.0;

		tQM = q1.getTotalMarks() + q2.getTotalMarks() + q3.getTotalMarks();
		oQM = q1.getObtainMarks() + q2.getObtainMarks() + q3.getObtainMarks();

		tAM = assgn1.getTotalMarks() + assgn2.getTotalMarks() + assgn3.getTotalMarks() ;
		oAM = assgn1.getObtainMarks() + assgn2.getObtainMarks() + assgn3.getObtainMarks();

		if (tAM == 0.0 || tQM == 0.0 || mid.getTotalMarks() == 0.0 || f.getTotalMarks() == 0.0){

			setPercentage(0.0);
		}
		else{
			qP = (oQM / tQM) * 100;
			aP = (oAM / tAM) * 100;
			mP = (mid.getObtainMarks() / mid.getTotalMarks()) * 100;
			fP = (f.getObtainMarks() / f.getTotalMarks()) * 100;
			setPercentage(((qP + aP + mP + fP) / (400)) * 100);
		}

	}


	public void calculateGrade(){
		if (getPercentage() >= 80 && getPercentage() <= 100){

			setGradePoint(4);
			grade = 'A';
			
		}
		else if (getPercentage() >= 70 && getPercentage() <= 79)
		{

			setGradePoint(3);
			grade = 'B';

		}
		else if (getPercentage() >= 60 && getPercentage() <= 69)
		{

			setGradePoint(2);
			grade = 'C';

		}

		else if (getPercentage() >= 50 && getPercentage() <= 59)
		{
			setGradePoint(2);
			grade = 'D';

		}

		else if (getPercentage() >= 0 && getPercentage() <= 49)
		{

			setGradePoint(0);

		}
	}


	
}