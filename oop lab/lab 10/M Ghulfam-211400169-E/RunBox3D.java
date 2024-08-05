class RunBox3D {
	public static void main(String[] args) {
		final int SIZE = 6;

		Box3D[] b = new Box3D[SIZE];
		b[0] = new Box3D();
		b[1] = new Box3D(12.0,2.2,1.00,"Red");
		b[2] = new Box3D(11.0,22.0,23.2,"Blue");
		b[3] = new Box3D(7.6,2.1,16.2,"Orange");
		b[4] = new Box3D(5.2,22.3,12.02,"Violet");
		b[5] = new Box3D(b[2]);


		/********************** Print *****************/	
		System.out.println("Displaying--------- ");
		System.out.println("Before sorting ");
		Box3D.print(b);


		/**************************** isEqaul *************************/
		if (b[2].isEqual(b[5])) {
			System.out.println("Box3d 3 and Box3D 6 has equal state\n ");
			
		}
		else
			System.out.println("Box3d 3 and Box3D 6 has not equal state\n");

		// Box3D.sort(b);

		/******************** Linear Search *********************/
		double keyToSearch = 12.0;
		int index = Box3D.linearSearch(b, keyToSearch);
		if (index != -1) {
			System.out.println(keyToSearch +" found at " +index);
			b[index].print();
		}
		else
			System.out.println(keyToSearch +" not found");


		/******************************* Sort ********************/
		Box3D.sort(b);
		System.out.println("After sorting ");
		Box3D.print(b);


		/******************** Binary Search ***********************/
		String colorKey = "Red";
		int index2 = Box3D.binarySearch(b,colorKey);

		if (index2 != -1) {
			System.out.println(colorKey +" found at index " +index2 );
			
		}
		else
			System.out.println(colorKey +" not found");
	
	}
	
}