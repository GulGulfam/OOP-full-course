class SalariedEmployee extends Employee{
	private double annualSalary;

	public SalariedEmployee(){
		super();
		this.setAnnualSalary(32000.0);
	}//Default constructor

	public SalariedEmployee(double annualSalary){
		super();
		this.setAnnualSalary(annualSalary);
	}//1-argument overloaded constructor

	public SalariedEmployee(double annualSalary, String name, int ID){
		super(name, ID);
		this.setAnnualSalary(annualSalary);
	}//3-arguments overloaded constructor

	public void setAnnualSalary(double annualSalary){
		this.annualSalary = annualSalary;
	}//setAnnualSalary

	public double getAnnualSalary(){
		return this.annualSalary;
	}//getAnnualSalary
	
	public double weeklyPay(){
		return this.getAnnualSalary() / 52;
	}//weeklyPay

	public void display(){
		System.out.println("Name: " + super.getName());
		System.out.println("Id: " + super.getID());
		System.out.println("Annaul salary: " + this.getAnnualSalary());
	}//display

}//class