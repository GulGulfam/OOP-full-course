public class UsingTasks{
	public static void main(String[] args){
		
		Module module1 = new Module();
		System.out.println("Displaying state of module #1:");
		module1.displayState();
		
		Module module2 = new Module("Software install utility");
		System.out.println("\nDisplaying state of module #2:");
		module2.displayState();

		Module module3 = new Module("Media player",102, "Blue sky", "USA");
		System.out.println("\nDisplaying state of module #3:");
		module3.displayState();

		module2.setModuleName("Disk utility");
		System.out.println("\nDisplaying state of module #2 after changing the values:");
		module2.displayState();

		
		Task task1 = new Task();
		System.out.println("\n\n\nDisplaying state of task #1:");
		task1.displayState();

		Task task2 = new Task("Search utility", "Utility to search files and softwares");
		System.out.println("\nDisplaying state of task #2:");
		task2.displayState();

		Task task3 = new Task("software uninstall", "Utility to uninstall softwares", "Software utility",
						103, "GreenBubble", "Pakistan");
		System.out.println("\nDisplaying state of task #3:");
		task3.displayState();


		task2.setTaskName("Software repair");
		task2.setTaskDescription("Utility to repair softwares");
		System.out.println("\nDisplaying state of task #2 after changing the values:");
		task2.displayState();
	

	}//main
}//class