class A<T>{
	private T var;

	public A(T var){ this.var = var;}
	
	public String toString(){return this.var+"";}

}
class AkhriProgram {
	public static void main(String[] args) {
		A<Integer> ref = new A<Integer>(10);
		System.out.println(ref);
		A<String> ref1 = new A<String>("ABC");
		System.out.println(ref1);

		
	}
}