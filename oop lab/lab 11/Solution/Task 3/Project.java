public class Project{
	private int projectID;
	private String projectName;
	private String projectLocation;

	public Project(){
		this.setProjectID(101);
		this.setProjectName("Redstone");
		this.setProjectLocation("Pakistan");
	}//default constructor

    public Project(int projectID, String projectName, String projectLocation){    	
    	this.setProjectID(projectID);
		this.setProjectName(projectName);
		this.setProjectLocation(projectLocation);
    }//overloaded constructor
	
    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }//setProjectID

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }//setProjectName

    public void setProjectLocation(String projectLocation) {
        this.projectLocation = projectLocation;
    }//setProjectLocation

    public int getProjectID() {
        return this.projectID;
    }//getProjectID

    public String getProjectName() {
        return this.projectName;
    }//getProjectName

    public String getProjectLocation() {
        return this.projectLocation;
    }//getProjectLocation

	public void displayState(){
		System.out.println("Project ID: " + this.getProjectID());
		System.out.println("Project Name: " + this.getProjectName());
		System.out.println("Project Location: " + this.getProjectLocation());
	}//displayState()
	
}//class