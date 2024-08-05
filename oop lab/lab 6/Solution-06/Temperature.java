public class Temperature{
	
	private double ftemp;

	public void setFahrenheit(int temp){
		ftemp = temp;
	}//setFahrenheit()

	public double getFahrenheit(){
		return ftemp;
	}//getFahrenheit()

	public double getCelsius(){
		return ( (5.0 / 9)) * (getFahrenheit() - 32);
	}//getCelsius()

	public double getKelvin(){
		return ( ((5.0 / 9)) * (getFahrenheit() - 32)) + 273;
	}//getKelvin()

}//class