public class Task extends Module{
    private String taskName;
	private String taskDescription;

	public Task(){
        super();
        this.setTaskName("File save as");
		this.setTaskDescription("Option to save file as");
	}//default constructor

    public Task(String taskName, String taskDescription){    	
        super();
        this.setTaskName(taskName);
    	this.setTaskDescription(taskDescription);
    }//two-argument overloaded constructor
    
    public Task(String taskName, String taskDescription, String moduleName,
            int projectID, String projectName, String projectLocation){      
        super(moduleName, projectID, projectName, projectLocation);
        this.setTaskName(taskName);
        this.setTaskDescription(taskDescription);
    }//six-argument overloaded constructor
	
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }//setTaskName

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }//setTaskDescription

    public String getTaskName() {
        return this.taskName;
    }//getTaskName

    public String getTaskDescription() {
        return this.taskDescription;
    }//getTaskDescription

	public void displayState(){
        System.out.println("Task name: " + this.getTaskName());
		System.out.println("Task description: " + this.getTaskDescription());
        super.displayState();
	}//displayState()
	
}//class