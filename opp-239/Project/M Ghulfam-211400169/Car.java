class Car extends Vehicle {
	private int model;
	private  Engine engine;
	private Wheel[] wheelArr;
	private MediaPlayer[] player; 

	public Car(){
		super();
		this.setModel(2002);
		this.engine = new Engine();
	}
	public Car(String color, int speed, int model, Engine engine, Wheel[] wheelArr, MediaPlayer player[]){
		super(color,speed);
		this.setModel(model);
		this.engine  = engine;
		this.wheelArr = wheelArr;
		this.player = player;

	}
	public void setModel(int model){
		this.model = model;
	}
	
	public int getModel(){
		return model;
	}
	public void park(){
		System.out.println("Car park because air pressure of wheel less than req air pressure ");
	}

	@Override
	public int speedUp(){

		// s  = super.getSpeed() + 10;
		// System.out.println(super.getSpeed()+10);
		return  super.getSpeed()+10;
	}

	@Override
	public String toString(){
	// return	super.toString() +" Model: " +this.getModel();
		return "Speed "  +super.getSpeed() +" Color: " +super.getColor() +" Model: " +getModel();

	}
	
}