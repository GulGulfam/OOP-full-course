class Assessment  {
	private int id;
	private String type;
	private int day,month,year;
	private double totalMarks, obtainMarks;
	private int percentage;
	private Grade grade;

	public Assessment(int id, String type, int day, int month, int year, double totalMarks, double obtainMarks, int percentage){
		this.id = id;
		this.type = type;
		this.day = day;
		this.month = month;
		this.year = year;
		this.totalMarks = totalMarks;
		this.obtainMarks = obtainMarks;
		this.percentage = percentage;

	} 
	public void setID(int id){
		this.id = id;
	}
	public void setTpye(String type){
		this.type = type;
	}
	public void setDay(int day){
		this.day = day;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void setTotalMarks(double totalMarks){
		this.totalMarks = totalMarks;
	}
	public void setObtainMarks(int obtainMarks){
		this.obtainMarks = obtainMarks;
	}
	public void setPercentage(int percentage){
		this.percentage = percentage;
	}
	public int getID(){
		return id;
	}
	public String getType(){
		return type;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	public double getTotalMarks(){
		return totalMarks;
	}
	public double getObtainMarks(){
		return obtainMarks;
	}
	public int getPercentage(){
		return percentage;
	}
	

	public void displayState(){
		System.out.println("ID : " +getID());
		System.out.println("Type : " +getType());
		System.out.println("Held at " +getDay() +"-" +getMonth() +"-" +getYear());
		System.out.println("Total Marks : " +getTotalMarks());
		System.out.println("Obtain Marks : " +getObtainMarks());
		System.out.println("percentage : " +getPercentage());
	}
	public double calculatePercentage(){
		return ((getObtainMarks()/getTotalMarks())*100);
	}
	
}