class Temperatue {
	private double fTemp;

	public Temperatue(){
		this.setFTemp(12.0);
	}
	public Temperatue(double fTemp){
		this.setFTemp(fTemp);
	}
	public void setFTemp(double fTemp){
		this.fTemp = fTemp;
	}
	public double getFTemp(){
		return fTemp;
	}
	public double getCelcius(){
		return (5/9)*(fTemp-32);
	}
	public double getKelvin(){
		return ((5/9)*(fTemp-32))+273;
	}
	public void display(){
		System.out.println("FarenHiet: " +getFTemp());
		System.out.println("Celcius: " +getCelcius());
		System.out.println("Kelvin: " +getKelvin());
	}
	public boolean isEqual(Temperatue t){
		return (this.getFTemp()==t.getFTemp() && this.getCelcius()==t.getCelcius() && this.getKelvin()== t.getKelvin() );
	}
	public Temperatue create(Temperatue t){
		return new Temperatue(this.getFTemp()+t.getFTemp());
	}
	public boolean compare(Temperatue t){
		return (this.getFTemp()==t.getFTemp());
	}
	public void copy(Temperatue t){
		t.setFTemp(this.getFTemp());
	}

	
}