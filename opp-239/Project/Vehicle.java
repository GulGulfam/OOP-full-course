abstract class Vehicle{
	
	private String color;
	private int speed;

	public Vehicle(){
		this.setColor("White");
		this.setSpeed(45);
	}	
	public Vehicle(String color, int speed){
		this.setColor(color);
		this.setSpeed(speed);
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public String getColor(){
		return color;
	}
	public int getSpeed(){
		return speed;
	}
	public abstract int speedUp();

	public  String toString(){
		return "Color: " +getColor() +" Speed: " +getSpeed();
	}
		

}