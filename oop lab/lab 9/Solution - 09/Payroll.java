public class Payroll{
	private String name;
	private int idNumber;
	private double hourlyPayRate;
	private double numbersOfHoursWorked;

	public Payroll(){
		this.setName("Abdullah");
		this.setIdNumber(12);
		this.setHourlyPayRate(20.5);
		this.setNumbersOfHoursWorked(40.0);
	}//Default constructor()

	public Payroll(String n, int i, double r, double h){
		this.setName(n);
		this.setIdNumber(i);
		this.setHourlyPayRate(r);
		this.setNumbersOfHoursWorked(h);
	}//Overloaded constructor

	public void setName(String n){
		name = n;
	}//setName()

	public void setIdNumber(int id){
		idNumber = id;
	}//setIdNumber()

	public void setHourlyPayRate(double rate){
		hourlyPayRate = rate;
	}//setHourlyPayRate()

	public void setNumbersOfHoursWorked(double hours){
		numbersOfHoursWorked = hours;
	}//setNumbersOfHoursWorked()

	public String getName(){
		return name;
	}//getName()

	public int getIdNumber(){
		return idNumber;
	}//getIdNumber()

	public double getHourlyPayRate(){
		return hourlyPayRate;
	}//getHourlyPayRate()

	public double getNumbersOfHoursWorked(){
		return numbersOfHoursWorked;
	}//getNumbersOfHoursWorked()

	public double grossPay(){
		return getHourlyPayRate() * getNumbersOfHoursWorked();
	}//getNumbersOfHoursWorked()

	public void display(){
		System.out.println("Name: " + getName());
		System.out.println("Id number: " + getIdNumber());
		System.out.println("Hourly Pay Rate: " + getHourlyPayRate());
		System.out.println("Numbers of hours worked: " + getNumbersOfHoursWorked());
	}//display()

	public void copy(Payroll p){
		p.setName(this.getName());
		p.setIdNumber(this.getIdNumber());
		p.setHourlyPayRate(this.getHourlyPayRate());
		p.setNumbersOfHoursWorked(this.getNumbersOfHoursWorked());
	}//copy()

	public String toString(){
		return this.getName() + ", " + this.getIdNumber() + ", " + this.getHourlyPayRate() + ", " + this.getNumbersOfHoursWorked();
	}//toString()

	public boolean compare(Payroll p){
		return this.getName().equals(p.getName()) &&
				this.getIdNumber() == (p.getIdNumber()) &&
				((this.getHourlyPayRate() - p.getHourlyPayRate()) < 0.000001) &&
				((this.getNumbersOfHoursWorked() - p.getNumbersOfHoursWorked()) < 0.000001);
	}//compare()

	public boolean isNotEqual(Payroll p){
		return !this.compare(p);
	}//isNotEqual()

	public Payroll create(Payroll p){
		return new Payroll(this.getName() + " " + p.getName(),
							this.getIdNumber() + p.getIdNumber(),
							this.getHourlyPayRate() + p.getHourlyPayRate(),
							this.getNumbersOfHoursWorked() + p.getNumbersOfHoursWorked());
	}//create()

}//class