public class Temperature{
	
	private double ftemp;

	public Temperature(){
		this.setFahrenheit(98.0);
	}//Default constructor()

	public Temperature(double f){
		this.setFahrenheit(f);
	}//Overloaded constructor

	public void setFahrenheit(double temp){
		ftemp = temp;
	}//setFahrenheit()

	public double getFahrenheit(){
		return ftemp;
	}//getFahrenheit()

	public double getCelsius(){
		return (getFahrenheit() - 32) * 5.0 / 9;
	}//getCelsius()

	public double getKelvin(){
		return (((5.0 / 9)) * (getFahrenheit() - 32)) + 273;
	}//getKelvin()

	public void display(){
		System.out.println("Temperature in fahrenheit: " + getFahrenheit());
	}//display()

	public void copy(Temperature t){
		t.setFahrenheit(this.getFahrenheit());
	}//copy()

	public String toString(){
		return Double.toString(this.getFahrenheit());
	}//toString()

	public boolean compare(Temperature t){
		return ( (this.getFahrenheit() - t.getFahrenheit() );
	}//compare()

	public Temperature create(Temperature t){
		return new Temperature(this.getFahrenheit() + t.getFahrenheit());
	}//create()

}//class