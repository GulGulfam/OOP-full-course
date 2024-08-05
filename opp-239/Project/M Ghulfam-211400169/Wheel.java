class Wheel {
	private int airPressure;

	public Wheel(){
		this.setAirPressure(20);
	}
	public Wheel(int airPressure){
		this.setAirPressure(airPressure);
	}

	public void setAirPressure(int airPressure){
		this.airPressure = airPressure;
	}
	public int getAirPressure(){
		return this.airPressure;
	}
	public String toString(){
		return "Air Pressure of wheel : " +this.getAirPressure();
	}
	
}