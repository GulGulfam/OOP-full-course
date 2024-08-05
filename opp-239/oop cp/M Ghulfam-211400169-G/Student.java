class Student {
	private String work;
	private int rollNo;
	private String department;

	public void setWork(String w){
		this.work = w;
	}
	public void setRollNo(int r){
		this.rollNo = r;
	}
	public void setDepartment(String d){
		this.department = d;
	}
	public String getWork(){
		return work;
	}
	public int getRollNo(){
		return rollNo;
	}
	public String getDepartment(){
		return department;
	}
	public String toString(){
		return "Work : " +getWork() +"\tRollNo : " +getRollNo() +"\tDepartment : " +getDepartment();
	}
	
}