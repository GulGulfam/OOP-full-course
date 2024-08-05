class MicrowaveOven {
	private String manufacturer;
	private int dateOfLaunch,deFrostTemp,warranty;
	private boolean autoCookManu,isTouchScreen;

	public MicrowaveOven(){
		this.setManufacturer("XYZ");
		this.setDateOfLaunch(1);
		this.setDeFrostTemp(2);
		this.setAutoCookManu(true);
		this.setWarranty(3);
		this.setIsTouchScreen(false);
	}
	public MicrowaveOven(String m){
		this.manufacturer = m;
	}
	public MicrowaveOven(String m, int d){
		this.manufacturer = m;
		this.dateOfLaunch = d;
	}
	public MicrowaveOven(String m, int d, int temp){
		this.manufacturer = m;
		this.dateOfLaunch = d;
		this.deFrostTemp = temp;
	}
	public MicrowaveOven(String m, int d, int temp, boolean a){
		this.manufacturer = m;
		this.dateOfLaunch = d;
		this.deFrostTemp = temp;
		this.autoCookManu = a;
	}
	public MicrowaveOven(String m, int d, int temp, boolean a, int w){
		this.manufacturer = m;
		this.dateOfLaunch = d;
		this.deFrostTemp = temp;
		this.autoCookManu = a;
		this.warranty = w;
	}
	public MicrowaveOven(String m, int d, int temp, boolean a, int w, boolean touch){
		this.manufacturer = m;
		this.dateOfLaunch = d;
		this.deFrostTemp = temp;
		this.autoCookManu = a;
		this.warranty = w;
		this.isTouchScreen = touch;
	}
	public void setManufacturer(String m){
		this.manufacturer = m;
	}
	public void setDateOfLaunch(int d){
		this.dateOfLaunch = d;
	}
	public void setDeFrostTemp(int temp){
		this.deFrostTemp = temp;
	}
	public void setAutoCookManu(boolean a){
		this.autoCookManu = a;
	}
	public void setWarranty(int w){
		this.warranty = w;
	}
	public void setIsTouchScreen(boolean touch){
		this.isTouchScreen = touch;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public int getDateOfLaunch(){
		return dateOfLaunch;
	}
	public int getDeFrostTemp(){
		return deFrostTemp;
	}
	public boolean getAutoCookManu(){
		return autoCookManu;
	}
	public int getWarranty(){
		return warranty;
	}
	public boolean getIsTouchScreen(){
		return isTouchScreen;
	}
	public void copy(MicrowaveOven m){
		m.setManufacturer(this.getManufacturer());
		m.setDateOfLaunch(this.getDateOfLaunch());
		m.setDeFrostTemp(this.getDeFrostTemp());
		m.setAutoCookManu(this.getAutoCookManu());
		m.setWarranty(this.getWarranty());
		m.setIsTouchScreen(this.getIsTouchScreen());
	}

	public String toString(){
		return "manufacturer =  " +getManufacturer() +"\ndateOfLaunch = " 
		+getDateOfLaunch() +"\ndeFrostTemp =  " +getDeFrostTemp() +"\nautoCookManu = "
		+getAutoCookManu() +"\nwarranty = " +getWarranty() +"\nisTouchScreen = " +getIsTouchScreen();
	}

	public void display(){
		System.out.println(getManufacturer() +"\t" +getDateOfLaunch() +"\t" +getDeFrostTemp() +"\t" +getAutoCookManu() +"\t" 
			+getWarranty() +"\t" +getIsTouchScreen()) ;
		
	}
	public boolean compare(MicrowaveOven m){
		return (this.getManufacturer().equals(m.getManufacturer())
			&& this.getDateOfLaunch()==m.getDateOfLaunch() && 
			this.getDeFrostTemp()==m.getDeFrostTemp() && 
			this.getAutoCookManu()==m.getAutoCookManu()
			&& this.getWarranty()==m.getWarranty()
			&& this.getIsTouchScreen()==m.getIsTouchScreen());
	}

	public boolean isNotEqual(MicrowaveOven m){
		return !this.compare(m);
		/*(this.getManufacturer().equals(m.getManufacturer())
			&& this.getDateOfLaunch()==m.getDateOfLaunch() && 
			this.getDeFrostTemp()==m.getDeFrostTemp() && 
			this.getAutoCookManu()==m.getAutoCookManu()
			&& this.getWarranty()==m.getWarranty()
			&& this.getIsTouchScreen()==m.getIsTouchScreen());*/
	}
	public MicrowaveOven create(MicrowaveOven m){
		String manufacturer = this.manufacturer +"-"+m.manufacturer;
		int dateOfLaunch = this.dateOfLaunch+m.dateOfLaunch;
		int deFrostTemp = this.deFrostTemp+m.deFrostTemp;
		boolean autoCookManu = this.autoCookManu && m.autoCookManu;
		 int warranty = this.warranty+m.warranty;
		 boolean isTouchScreen = this.isTouchScreen && m.isTouchScreen;
		MicrowaveOven temp = new MicrowaveOven(manufacturer,dateOfLaunch,deFrostTemp,autoCookManu,warranty,isTouchScreen);
		return temp;
	}




	
}