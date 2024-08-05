public class Temperature{
	
	private double fTemp;
	
	public Temperature(){
		this.setFarenheit(0.0);
	}

	public Temperature(double temp){
		this.setFarenheit(temp);
	}

	public void setFarenheit(double temp){
		fTemp = temp;
	}//setFahrenheit()

	public double getFarenheit(){
		return fTemp;
	}//getFahrenheit()

	public double getCelsius(){
		return ( (5.0 / 9)) * (getFarenheit() - 32);
	}//getCelsius()

	public double getKelvin(){
		return ( ((5.0 / 9)) * (getFarenheit() - 32)) + 273;
	}//getKelvin()

	
	

	public boolean compare(Temperature arg){
		
		if(this.getKelvin()==arg.getKelvin() && this.getCelsius()==arg.getCelsius() && this.getFarenheit()==arg.getFarenheit())
			return true;
		return false;
	}
	public String toString(){
		
		return "Fahrenheit : " +this.getFarenheit() +" Celcius :  " +this.getCelsius() +"  Kelvin :  " +this.getKelvin(); 
	}
			
		
		public void display(){
		System.out.println("Celcius =  " +getCelsius());
		System.out.println("Kelvin =  " +getKelvin());
		System.out.println("Fahrenheit = " +getFarenheit());
	}
		
	
	public void copy(Temperature t){
		
		t.setFarenheit(this.getFarenheit());
	}

}//class