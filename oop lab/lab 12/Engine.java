class Engine {
	private int engineSize;
	private String engineType;
	private boolean engineRunning;
	private int topSpeed;

	public Engine(){
		this.setEngineSize(100);
		this.setEngineType("Non");
		this.setEngineRunning(true);
		this.setTopSpeed(1000);

	}
	public Engine(int engineSize, String engineType, boolean engineRunning, int topSpeed){
		this.setEngineSize(engineSize);
		this.setEngineType(engineType);
		this.setEngineRunning(engineRunning);
		this.setTopSpeed(topSpeed);
	}
	public Engine(Engine engine){
		this.setEngineSize(engine.getEngineSize());
		this.setEngineType(engine.getEngineType());
		this.setEngineRunning(engine.getEngineRunning());
		this.setTopSpeed(engine.getTopSpeed());
	}
	public void setEngineSize(int engineSize){
		this.engineSize = engineSize;
	}
	public void setEngineType(String engineType ){
		this.engineType = engineType;
	}

	public void setEngineRunning(boolean engineRunning){
		this.engineRunning = engineRunning;
	}
	public void setTopSpeed(int topSpeed){
		this.topSpeed = topSpeed;
	}

	public int getEngineSize(){
		return engineSize;
	}
	public String getEngineType(){
		return engineType;
	}
	public boolean getEngineRunning(){
		return engineRunning;
	}
	public int getTopSpeed(){
		return topSpeed;
	}

	public boolean startEngine(){
		if (!this.getEngineRunning()) {
			return true;
			
		}
		else
			return false;
	}

	public boolean stopEngine(){
		if (this.getEngineRunning()) {
			return false;
			
		}
		else
			return false;
	}

	public boolean isEngineRunning(){
		return this.engineRunning;
	}

	public void currentEngineState(){
		System.out.println("Engine size: " +getEngineSize());
		System.out.println("Engine type: " +getEngineType());
		if (this.getEngineRunning()) {
			System.out.println("start");
			
		}
		else
			System.out.println("Stop");
		System.out.println("Top speed: " +getTopSpeed());
	}


}