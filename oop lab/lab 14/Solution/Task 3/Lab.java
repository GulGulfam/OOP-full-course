class Lab extends Assignment{

	private String specification;

	public Lab(String name, int month, int day, int hour, int minute, String specification){
		super(name, month, day, hour, minute, 9.5, 10.0, 5.0);
		this.setSpecification(specification);
	}//6-arguments overloaded constructor

	public void setSpecification(String specification) {
        this.specification = specification;
    }//setSpecification

    public String getSpecification() {
        return this.specification;
    }//getSpecification

    public String toString(){
    	return "Specification: " + this.getSpecification() + ", " + super.toString();
    }//toString
    
}//class