class Student{
		private String name;
		private int roll;

		public Student(){
			name = "XYZ";
			roll = 007;
		}//0-arg Constructors
		
		public Student(String n){
			name = n;
		}//1-arg Cons

		public Student(int r){
			roll = r;
		}//1-arg Cons

		public Student(String n, int r){
			name = n;
			roll = r;
		}//2-arg Cons

		public Student(int r, String n){
				name = n;
				roll = r;
		}//2-arg Cons

		public boolean isEqual(Student arg){
			if(this.name.equals(arg.name) && this.roll == arg.roll)
				return true;
			return false;
		}
		public Student create(Student arg){
				String name = this.name+"-"+arg.name;
				int roll = this.roll+arg.roll;
				Student temp = new Student(name, roll);
			return temp;
		}
		public String toString(){
			return "Name: "+name+"\nRoll: "+this.roll;
		}
		//----Insert Getter Setter on your own	
}
public class Main1{
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("XYZ", 007);
		Student s3 = new Student(003, "abc");
		
		// System.out.println(s1);//--->address/reference
		// System.out.println(s1==s2);//---->have same data but both point to the different addresses
		
		System.out.println("Equality Check: "+s1.isEqual(s2));
		Student s4 = s2.create(s3);
		System.out.println("----toString()----\n"+s4.toString());
		s4.setName("To Be decided");
		System.out.println(s4.toString());

	}
}