class Teacher extends Student {
	private String name;
	private String courseTeaching;
	private int id;

	public void setName(String n){
		this.name = n;
	}
	public void setCourseTeachig(String c){
		this.courseTeaching = c;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public String getCourseTeaching(){
		return courseTeaching;
	}
	public int getId(){
		return id;
	}
	public String toString(){
		return (super.toString() +"\nTecaher Name : " +name +"\tCourseTeaching : " +getCourseTeaching() +"\tTeacher id : " +getId());  
	}
	
}