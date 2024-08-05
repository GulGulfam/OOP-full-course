public class Student implements Comparable{
	private int ID;
	private String name;

	public Student(int ID, String name){
		this.setID(ID);
		this.setName(name);
	}//Two-arguments overloaded constructor

	public void setID(int ID){
		this.ID = ID;
	}//setID

	public void setName(String name){
		this.name = name;
	}//setName

	public int getID(){
		return this.ID;
	}//getID

	public String getName(){
		return this.name;
	}//getName

	public void displayState(){
		System.out.println("ID: " + this.getID());
		System.out.println("Name: " + this.getName());
	}//displayState
	
	@Override
	public int compareTo(Object otherObject){
		Student student = (Student) otherObject;
		return this.getName().compareTo(student.getName());

	/*
		if (this.getName().compareTo(student.getName()) > 0){
			return 1;
		}
		else if (this.getName().compareTo(student.getName()) < 0){
			return -1;
		}
		else{
			return 0;
		}//if
	*/

	}//compareTo
}//class