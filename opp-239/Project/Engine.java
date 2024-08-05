class Engine {
	private int capacity;
	private boolean isStarted;
	private Vehicle v;

	public Engine(){
		this.setCapacity(22);
	}
	public Engine(int capacity, boolean isStarted){
		this.setCapacity(capacity);
		this.setIsStarted(isStarted);
	}
	public void setCapacity(int capacity){
		this.capacity = capacity;
	}
	public int getCapacity(){
		return capacity;
	}
	public void setIsStarted(boolean isStarted){
		this.isStarted = isStarted;
	}
	public boolean getIsStarted(){
		return isStarted;
	}

	public boolean start(){
		if (!this.getIsStarted()) {
			return true;
		}
		else{
			return false;
		}
	}
	public boolean stop(){
		if (this.getIsStarted()) {
			return false;
			
		}
		else{
			return false;
		}
	}

	public int accelerate(){
		int accelerate = v.getSpeed() + 5;
		return accelerate;
		
	}
	public String toString(){
		return "Engine Capacity: " +getCapacity() +"\n Engine Started: " +this.getIsStarted();
	}
	
}