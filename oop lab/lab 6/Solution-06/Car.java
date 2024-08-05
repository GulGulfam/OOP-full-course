public class Car{

	private int yearModel;
	private String make;
	private int speed;

	public void setYearModel(int model){
		yearModel = model;
	}//setYearModel()

	public void setMake(String m){
		make = m;
	}//setMake()

	public void setSpeed(int s){
		speed = s;
	}//setSpeed()

	public int getYearModel(){
		return yearModel;
	}//getYearModel()	

	public String getMake(){
		return make;
	}//getMake()

	public int getSpeed(){
		return speed;
	}//getSpeed()

	public void accelerate(){
		setSpeed(getSpeed() + 5);
	}//accelerate()

	public void brake(){
		setSpeed(getSpeed() - 5);
	}//brake()


	public void display() {
		System.out.println("Make is: " + getMake());
		System.out.println("Year Model is: " + getYearModel());
		System.out.println("Speed is: " + getSpeed());

	}//display()



}//class