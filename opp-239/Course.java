class Course{
	private String code, title;
	private int crdts;

	public void setCode(String code){
		this.code = code;
	}
	public String getCode(){
		return this.code;
	}

	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}

	public void setCrdts(int crdts){
		this.crdts = crdts;
	}
	public int getCrdts(){
		return this.crdts;
	}

	public Course(){
		System.out.println("0-ARG");
		code = "CS-";
		title = "Intro to ";
		crdts = 0;
	}//no-arg

	public Course(Course arg){
		this.code = arg.code;
		this.crdts = arg.crdts;
		this.title = arg.title;
	}
	public Course(String code, String title, int crdts){
		System.out.println("3-ARG");
		
		this.code = code;
		this.title = title;
		this.crdts = crdts;
	}//3-arg
	public Course(String code,int crdts, String title){
		this.code = code;
		this.title = title;
		this.crdts = crdts;
	}//3-arg
		public Course(String code){
		this.code = code;
	}//1-arg
		public Course(int crdts){
		this.crdts = crdts;
	}//1-arg
	
	public Course(int crdts, String title){
		this.title = title;
		this.crdts = crdts;
	}//2-arg

	public String toString(){
		return "\n\nCode: "+this.getCode()+"\nTitle: "+this.title+"\nCrdts: "+crdts;
	}

	public void copy(Course arg){
		this.code = arg.code;
		this.crdts = arg.crdts;
		this.title = arg.title;

	}

}

public class Main{
	public static void main(String[] args) {
		Course c1 = new Course();
		c1.setCode("CS-240");
		c1.setTitle("OOP-LAB");
		c1.setCrdts(1);

		Course c2 = new Course("CS-239", "OOP", 3);
		
		Course c3 = new Course(c1);
		//c3 = c1;//Shallow Copy
		//c3.copy(c1);//Deep Copy

		c3.setCrdts(5);//Copy Constructor doing Deep Copy

		System.out.println(c1);//Automatically calling toString() method for c1
		System.out.println(c2);//Automatically calling toString() method for c2
		System.out.println(c3);//Automatically calling toString() method for c3



	}
}
