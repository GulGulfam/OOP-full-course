public class Employee implements Displayable, Calculateable, Relateable{
	private int hoursPerWeek;
	private double salaryPerHour;

	public Employee(int h, double s){
		setHoursPerWeek(h);
		setSalaryPerHour(s);
	}

	public void setHoursPerWeek(int h){
		hoursPerWeek = h;
	}

	public void setSalaryPerHour(double s){
		salaryPerHour = s;
	}

	public int getHoursPerWeek(){
		return hoursPerWeek;
	}

	public double getSalaryPerHour(){
		return salaryPerHour;
	}

	@Override
	public void display(){
		System.out.println("Hours per week: " + getHoursPerWeek());
		System.out.println("Salary per hour: " + getSalaryPerHour());
	}

	@Override
	public double weeklySalary(){
		return this.getSalaryPerHour() * this.getHoursPerWeek();
	} 

	@Override
	public double annualSalary(){
		return weeklySalary() * 52;
	}

	@Override
	public boolean isRankGreater(Employee e){
		return this.annualSalary() > e.annualSalary();
	} 
}