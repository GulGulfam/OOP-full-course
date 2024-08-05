public class Car{

	private int yearModel;
	private String make;
	private int speed;

	public Car(){
		this.setYearModel(200);
		this.setMake("BMW");
		this.setSpeed(300);
	}//Default constructor()

	public Car(int y, String m, int s){
		this.setYearModel(y);
		this.setMake(m);
		this.setSpeed(s);
	}//Overloaded constructor

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

	public void display(){
		System.out.println("Year model: " + getYearModel());
		System.out.println("Make: " + getMake());
		System.out.println("Speed: " + getSpeed());
	}//display()

	public void copy(Car c){
		c.setYearModel(this.getYearModel());
		c.setMake(this.getMake());
		c.setSpeed(this.getSpeed());
	}//copy()

	public String toString(){
		return this.getYearModel() + ", " + this.getMake() + ", " + this.getSpeed();
	}//toString()

	public boolean compare(Car c){
		return this.getYearModel() == c.getYearModel() &&
				this.getMake().equals(c.getMake()) &&
				this.getSpeed() == c.getSpeed();
	}//compare()

}//class