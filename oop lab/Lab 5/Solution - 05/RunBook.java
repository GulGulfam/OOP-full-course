public class RunBook{
	public static void main(String[] args){
		Book maths = new Book();
		System.out.println("Enter details for the maths:");
		maths.get();
		
		Book english = new Book();
		System.out.println("Enter details for the english:");
		english.get();

		System.out.println("Details for the math:");
		maths.show();
		System.out.println("Details for the english:");
		english.show();

		// System.out.println("Changing the values of maths object:");
		// maths.setBookId(5);
		// maths.setPages(700);
		// maths.setPrice(1200);
		// System.out.println("Details for the math after changing values:");
		// maths.show();

		System.out.println("The details of the costliest book are:");
		if (maths.getPrice() > english.getPrice() ){
			maths.show();
		}
		else{
			english.show();
		}
	}//main
}//class