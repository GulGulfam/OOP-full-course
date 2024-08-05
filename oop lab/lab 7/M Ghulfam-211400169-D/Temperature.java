public class Temperature{
	
	private double temp;
	
	public Temperature(){
		this.setTemp(0.0);
	}

	public Temperature(double t){
		this.setTemp(t);
	}

	public void setTemp(double t){
		temp = t;
	}//setFahrenheit()

	public double getTemp(){
		return temp;
	}//getFahrenheit()

	public double getCelsius(){
		return ( (5.0 / 9)) * (getTemp() - 32);
	}//getCelsius()

	public double getKelvin(){
		return ( ((5.0 / 9)) * (getTemp() - 32)) + 273;
	}//getKelvin()

	public void display(){
		System.out.println("Celcius =  " +getCelsius());
		System.out.println("Kelvin =  " +getKelvin());
		System.out.println("Fahrenheit = " +getTemp());
	}
	public String toString(){
		
		return "Fahrenheit = " +this.temp +"Celcius =  " +this.getCelsius() +"  Kelvin =  " +this.getKelvin(); 
	}

	public boolean compare(Temperature arg){
		
		if(this.getKelvin()==arg.getKelvin() && this.getCelsius()==arg.getCelsius() && this.getTemp()==arg.getTemp())
			return true;
		return false;
			
		
		
		
	}
	public void copy(Temperature t){
		
		t.setTemp(this.getTemp());
	}

}//class