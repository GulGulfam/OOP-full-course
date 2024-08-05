public class Employee{

	private String name;
	private int idNumber;
	private String department;
	private String position;

	public Employee(){
		this.setName("Abdullah");
		this.setIdNumber(12);
		this.setDepartment("CS");
		this.setPosition("IT Manager");
	}//Default constructor()

	public Employee(String n, int i, String d, String p){
		this.setName(n);
		this.setIdNumber(i);
		this.setDepartment(d);
		this.setPosition(p);
	}//Overloaded constructor

	public void setName(String n){
		name = n;
	}//setName()

	public void setIdNumber(int id){
		idNumber = id;
	}//setIdNumber()

	public void setDepartment(String d){
		department = d;
	}//setDepartment()

	public void setPosition(String p){
		position = p;
	}//setPosition()

	public String getName(){
		return name;
	}//getName()

	public int getIdNumber(){
		return idNumber;
	}//getIdNumber()

	public String getDepartment(){
		return department;
	}//getDepartment()

	public String getPosition(){
		return position;
	}//getPosition()

	public void display(){
		System.out.println("Name: " + getName());
		System.out.println("Id number: " + getIdNumber());
		System.out.println("Department: " + getDepartment());
		System.out.println("Position: " + getPosition());
	}//display()

	public void copy(Employee e){
		e.setName(this.getName());
		e.setIdNumber(this.getIdNumber());
		e.setDepartment(this.getDepartment());
		e.setPosition(this.getPosition());
	}//copy()

	public String toString(){
		return this.getName() + ", " + this.getIdNumber() + ", " + this.getDepartment() + ", " + this.getPosition();
	}//toString()

	public boolean compare(Employee e){
		return this.getName().equals(e.getName()) &&
				this.getIdNumber() == e.getIdNumber() &&
				this.getDepartment().equals(e.getDepartment()) &&
				this.getPosition().equals(e.getPosition());
	}//compare()
	
}//class