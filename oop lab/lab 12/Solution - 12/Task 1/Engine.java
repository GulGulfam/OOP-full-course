class Engine{
	private int engineSize;
	private String engineType;
	private boolean engineRunning;
	private int topSpeed;

	public Engine(){
		this.setEngineSize(1000);
		this.setEngineType("Patrol");
		this.setEngineRunning(false);
		this.setTopSpeed(200);
	}//Default constructor

	public Engine(int engineSize, String engineType, boolean setEngineRunning, int topSpeed){
		this.setEngineSize(engineSize);
		this.setEngineType(engineType);
		this.setEngineRunning(engineRunning);
		this.setTopSpeed(topSpeed);
	}//Four arguments overloaded constructor

	public Engine(Engine engine){
		this.setEngineSize(engine.getEngineSize());
		this.setEngineType(engine.getEngineType());
		this.setEngineRunning(engine.isEngineRunning());
		this.setTopSpeed(engine.getTopSpeed());
	}//Copy constructor

	public void setEngineSize(int engineSize){
		this.engineSize = engineSize;
	}//setEngineSize

	public void setEngineType(String engineType){
		this.engineType = engineType;
	}//setEngineType

	public void setEngineRunning(boolean engineRunning){
		this.engineRunning = engineRunning;
	}//setEngineRunning

	public void setTopSpeed(int topSpeed){
		this.topSpeed = topSpeed;
	}//setTopSpeed

	public int getEngineSize(){
		return this.engineSize;
	}//getEngineSize

	public String getEngineType(){
		return this.engineType;
	}//getEngineType

	public boolean isEngineRunning(){
		return this.engineRunning;
	}//isEngineRunning

	public int getTopSpeed(){
		return this.topSpeed;
	}//getTopSpeed

	public boolean startEngine(){
		boolean isStarted = true;

		if (!this.isEngineRunning()){
			this.setEngineRunning(true);
		} else {
			isStarted = false;
		}//if

		return isStarted;
	}//startEngine

	public boolean stopEngine(){
		boolean isStopped = true;
		if (this.isEngineRunning()){
			this.setEngineRunning(false);
		} else {
			isStopped = false;
		}//if

		return isStopped;
	}//stopEngine

	public void currentEngineState(){
		System.out.println("Engine size: " + this.getEngineSize());
		System.out.println("Engine type: " + this.getEngineType());

		System.out.print("Engine running state: ");
		if(this.isEngineRunning()){
			System.out.print("Start");
		}
		else{
			System.out.print("Stop");
		}//if
		System.out.println(" state");
		System.out.println("Top speed: " + this.getTopSpeed());
	}//currentEngineState
}//class