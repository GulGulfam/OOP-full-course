class UsingAssignments{
	public static void main(String[] args) {
		Lab lab = new Lab("Assignment #1", 1, 25, 18, 30, "implement any five methods of Math class");
		Project project = new Project("Assignment #2", 2, 19, 23, 59, "Write binary search code and implement it on file provided", "file.txt");

		final int SIZE = 2;
		Assignment[] assignments = new Assignment[SIZE];
		assignments[0] = lab;
		assignments[1] = project;
		Assignment.showAssignments(assignments);
	}//main
}//class