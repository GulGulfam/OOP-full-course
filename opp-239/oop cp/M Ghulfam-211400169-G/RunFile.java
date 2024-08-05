class RunFile {
	public static void main(String[] args) {
		Teacher data = new Teacher();

		// SET STUDENT DATA

		data.setWork("Student");
		data.setDepartment("Soft Eng");
		data.setRollNo(2114);

		//SET TEACHER DATA
		data.setName("Gul");
		data.setCourseTeachig("oop");
		data.setId(254);
		
		System.out.println(data);
	}
	
}