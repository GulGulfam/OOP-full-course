public class Shape{
	private String color;

	public Shape(){		
		this.setColor("Blue");
	}//default constructor

	public Shape(String color){
		this.setColor(color);
	}//overloaded constructor

	public void setColor(String color){
		this.color = color;
	}//setColor()

	public String getColor(){
		return this.color;
	}//getColor()

	public void draw(){
		System.out.println("Color: " + this.getColor());
	}//draw()

	public double calculateArea(){
		return 0.0;
	}//calculateArea()

	public double calculatePerimeter(){
		return 0.0;
	}//calculatePerimeter()
}//class