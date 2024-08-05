class AddTwoMatrix {

	static int[][] addMAtrix(int[][] array1, int[][]array2){

		int[][] temp = new int[array1.length][array2[0].length];

		for (int i=0; i<array1.length ;i++ ) {
			for (int j=0; j<array2[0].length ;j++ ) {
				temp[i][j] = (array1[i][j]+array2[i][j]);
				
			}
			
		}

		return temp;


	}

		public static void printArray(int[][] array){

		for (int i=0; i<array.length ;i++ ) {
			for (int j=0;j<array[i].length ;j++ ) {
				System.out.print(array[i][j] +" ");
				
			}
			System.out.println();
			
		}
	}












	public static void main(String[] args) {
		int[][] array1 = {{5 ,7 ,9 ,4 ,3},{2 ,3 ,9, 7 ,6},{3 ,6 ,8 ,7 ,9},{1 ,9 ,7 ,5 ,6},{3 ,8 ,7 ,9 ,2}};

		int[][]array2 = {{7 ,3 ,2 ,1 ,5},{3 ,9 ,4 ,0 ,3},{6 ,2 ,8 ,9 ,4},{5 ,0, 3 ,8 ,7},{1 ,6 ,8 ,4 ,3}};
	
		int[][] arr = addMAtrix(array1,array2);

		printArray(arr);




	}
	
}