class Grade {
	private String name;
	private int minPercentage;
	private int maxPercentage;
	private String remarks;

	public Grade(String name, int minPercentage, int maxPercentage, String remarks){
		this.setName(name);
		this.setMinPercentage(minPercentage);
		this.setMaxPercentage(maxPercentage);
		this.setRemarks(remarks);
	}
	public void setName(String name){
		this.name = name;
	}
	public void setMinPercentage(int minPercentage){
		this.minPercentage = minPercentage;
	}
	public void setMaxPercentage(int maxPercentage){
		this.maxPercentage = maxPercentage;
	}
	public void setRemarks(String remarks){
		this.remarks = remarks;
	}
	public String getName(){
		return name;
	}
	public int getMinPercentage(){
		return minPercentage;
	}
	public int getMaxPercentage(){
		return maxPercentage;
	}
	public String getRemarks(){
		if ((getMinPercentage()>79 && getMinPercentage()<101) || getMaxPercentage()<101 && getMaxPercentage()>79) {
			name = "A";
			return " Excellent ";

		}
		if((getMinPercentage()>64 && getMinPercentage()<80) || getMaxPercentage()<80 && getMaxPercentage()>64){
			name = "B";
			return " Good ";

		}
		if((getMinPercentage()>49 && getMinPercentage()<66) || getMaxPercentage()<66 && getMaxPercentage()>49){
			name = "C";
			return " Satisfactory ";

		}
			
		else if((getMinPercentage()>39 && getMinPercentage()<50) || getMaxPercentage()<50 && getMaxPercentage()>39){
			name = "D";
			return "   Pass ";

		}
		else{
			name = "F";
			return "  fail ";
		}


	}
	public void displayState(){
		System.out.println("Name : " +getName());
		System.out.println("Min Percentage : " +getMinPercentage());
		System.out.println("Max percentage : " +getMaxPercentage());
		System.out.println("Remarks : " +getRemarks());
	}
	
}