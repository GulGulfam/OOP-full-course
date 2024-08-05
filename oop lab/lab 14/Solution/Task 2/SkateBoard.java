class SkateBoard extends Vehicle{
	private double boardLength;
	private int numberOfWheels;

	public SkateBoard(){
		super("Enjoi", "Raemers");
		this.setBoardLength(28.0);
		this.setNumberOfWheels(4);
	}//Default constructor

	public SkateBoard(double boardLength, int numberOfWheels){
		super("Enjoi", "Barletta");
		this.setBoardLength(boardLength);
		this.setNumberOfWheels(numberOfWheels);
	}//2-argument overloaded constructor

	public SkateBoard(double boardLength, int numberOfWheels, String brand, String model){
		super(brand, model);
		this.setBoardLength(boardLength);
		this.setNumberOfWheels(numberOfWheels);	
	}//4-argument overloaded constructor

	public void setBoardLength(double boardLength){
		this.boardLength = boardLength;
	}//setBoardLength

	public void setNumberOfWheels(int numberOfWheels){
		this.numberOfWheels = numberOfWheels;
	}//setNumberOfWheels

	public double getBoardLength(){
		return this.boardLength;
	}//getBoardLength

	public int getNumberOfWheels(){
		return this.numberOfWheels;
	}//getNumberOfWheels

	public void display(){
		super.display();
		System.out.println("Board length: " + this.getBoardLength());
		System.out.println("Number of wheels: " + this.getNumberOfWheels());
	}//display
}//class