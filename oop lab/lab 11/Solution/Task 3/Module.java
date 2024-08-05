public class Module extends Project{
	private String moduleName;

	public Module(){
        super();
		this.setModuleName("File utility");
	}//default constructor

    public Module(String moduleName){    	
        super();
    	this.setModuleName(moduleName);
    }//one-argument overloaded constructor

    public Module(String moduleName, int projectID, String projectName, String projectLocation){       
        super(projectID, projectName, projectLocation);
        this.setModuleName(moduleName);
    }//four-argument overloaded constructor
	
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }//setModuleName

    public String getModuleName() {
        return this.moduleName;
    }//getModuleName

	public void displayState(){
		System.out.println("Module name: " + this.getModuleName());
        super.displayState();
	}//displayState()
	
}//class