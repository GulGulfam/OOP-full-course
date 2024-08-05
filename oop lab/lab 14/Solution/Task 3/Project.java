class Project extends Assignment{

	private String specification;
    private String dataFile;

	public Project(String name, int month, int day, int hour, int minute, String specification, String dataFile){
		super(name, month, day, hour, minute, 14.0, 15.0, 10.0);
        this.setSpecification(specification);
		this.setDataFile(dataFile);
	}//7-arguments overloaded constructor

	public void setSpecification(String specification) {
        this.specification = specification;
    }//setSpecification

    public void setDataFile(String dataFile) {
        this.dataFile = dataFile;
    }//setDataFile

    public String getSpecification() {
        return this.specification;
    }//getSpecification

    public String getDataFile() {
        return this.dataFile;
    }//getDataFile

    public String toString(){
    	return "Specification: " + this.getSpecification()
        + ", Data file: " + this.getDataFile() + ", " + super.toString();
    }//toString
    
}//class