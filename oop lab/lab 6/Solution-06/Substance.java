public class Substance{
	
	private int temperature;

	public void setTemperature(int temp){
		temperature = temp;
	}//setTemperature()

	public int getTemperature(){
		return temperature;
	}//getTemperature()

	public boolean isEthylFreezing(){
		return getTemperature() <= -173;
	}//isEthylFreezing()

	public boolean isEthylBoiling(){
		return getTemperature() >= 172;
	}//isEthylBoiling()

	public boolean isOxygenFreezing(){
		return getTemperature() <= -362;
	}//isOxygenFreezing()

	public boolean isOxygenBoiling(){
		return getTemperature() >= -306;
	}//isOxygenBoiling()

	public boolean isWaterFreezing(){
		return getTemperature() <= 32;
	}//isWaterFreezing()

	public boolean isWaterBoiling(){
		return getTemperature() >= 212;
	}//isWaterBoiling()

}//class