class RunBook {
	public static void main(String[] args) {
		Book math = new Book();
		System.out.println("Detail for math ");
		math.get();
		math.show();

		Book english = new Book();
		System.out.println("Detail for english");
		english.get();
		english.show();
		if (math.getPrice()> english.getPrice()) {
			System.out.println(" Math is  costly");
			
		}
		else{
			System.out.println("English is costly");
		}
	}
	
}